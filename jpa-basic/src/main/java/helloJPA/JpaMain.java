package helloJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        /* EMF는 하나만 만들어야 한다. */

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin(); /* transaction을 해줘야 한다. */


        try {
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("Kong");

//            em.persist(member); /* Insert */


//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.id =" + findMember.getId());
//            System.out.println("findMember.Name =" + findMember.getName()); /* Select */

//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("Kong2"); /* Update는 기존에 Insert 하듯이 setName으로 컬럼값을 주고 em.persist() 해야하는게 아닌 값만 바꿔도 Insert (Update) 해준다. */

            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                            .getResultList(); /* JPQL 예시, JPA는 Table 대상으로 쿼리 X 객체를 대상으로 O */

            for (Member member : result) {
                System.out.println(member.getName());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        } /* 정석으로 쓰려면 이렇게 try catch를 해야한다. 하지만 안해도 됨 왜 ? spring에서 관리 */

        emf.close();
    }
}
