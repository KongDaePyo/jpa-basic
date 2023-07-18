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

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                            .getResultList(); /* JPQL 예시, JPA는 Table 대상으로 쿼리 X 객체를 대상으로 O */
//
//            for (Member member : result) {
//                System.out.println(member.getName());
//            }


              /* 비영속 */
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("Kong");


//            /* 영속 */
//            System.out.println("before");
//            em.persist(member); /* persist가 쿼리문을 날리는게 아니다. */
//            System.out.println("after");

//            Member member = new Member();
//            member.setId(105L);
//            member.setName("Kong");
//
//            em.persist(member);
//
//            Member findMember = em.find(Member.class, 101L); /* 조회 쿼리문을 DB에 날리는게 아닌 1차 캐시에서 조회하기 때문에 쿼리문 X */


//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L); /* findMember1 즉 첫 번째 조회 할 때는 쿼리문을 날리고 두 번째는 1차캐시에서 조회하니 쿼리문을 안 날린다. */
//
//            System.out.println("reuslt = " + (findMember1 == findMember2)); // 1차 캐시로 인하여 동일성 보장


//            Member member1 = new Member(150L, "A");
//            Member member2 = new Member(160L, "B");
//
//            em.persist(member1);
//            em.persist(member2); /* persist는 1차 캐시, 쓰기 지연 저장소에 쌓이는 것. */
//            System.out.println("===============");
//
//
//            tx.commit(); /* tx.commit() 실행 시 쓰기 지연 저장소에 저장 된 쿼리문 날린다. 따라서 ======= 뒤에 쿼리문 실행되는 것 옵션을 통해 버퍼링 (10개 쌓이면 쿼리문을 보내는 식) 가능 */

//            Member findMember = em.find(Member.class, 150L);
//            findMember.setName("Cong1"); /* 값만 변경해도 Update 쿼리문을 실행한다. 즉 값을 수정할 때는 persist를 호출 안 해도 된다. */

//            Member member = new Member(200L, "member200");
//            em.persist(member);
//
//            em.flush(); // flush 발생되니 바로 Insert Query 바로 실행
//            System.out.println("=============");

//            Member memberA = new Member(200L, "member200");
//            em.persist(memberA);
//            Member memberB = new Member(200L, "member200");
//            em.persist(memberB); /* 현재까진 DB에 반영 X */
//
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                            .getResultList(); /* Commit 되지 않은 상태에서 조회 JPQL 실행 ? 에러 즉 JPQL은 flush 해준다. */

//            Member member = em.find(Member.class, 150L); /* 영속 상태 */
//            member.setName("AAAAA"); /* dirty checking 해준다. */
//
//            em.detach(member); /* JPA에서 관리 안한다. 준영속 상태이다. 즉 commit을 해도 Update 되지 않는다. */

//            Member member = new Member();
//            member.setUsername("CAAAA");
//
//            em.persist(member);

//            Team team = new Team();
//            team.setName("TeamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setName("member1");
//            member.setTeamId(team.getId());
//            em.persist(member);
//
//            Member findMember = em.find(Member.class, member.getId());
//
//            Long findTeamId = findMember.getTeamId();
//            Team findTeam = em.find(Team.class, findTeamId); /* 연관관계가 없기 때문에 계속 조회해야 한다. */

//            Team team = new Team();
//            team.setName("TeamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setName("member1");
//            member.setTeam(team); /* JPA에서 알아서 team 객체의 PK 값을 Member 객체의 FK 값으로 사용한다. */
//            em.persist(member);
//
//            em.flush();
//            em.clear(); /* 1차 캐시가 아닌 강제로 DB에서 값을 조회하기 위해 사용 */

//            Member findMember = em.find(Member.class, member.getId());
//            Team findTeam = findMember.getTeam();
//
//            System.out.println("findTeam = " + findTeam.getName() + " : " + findTeam.getId());

//            List<Member> members = findMember.getTeam().getMembers();
//
//            for (Member m : members) {
//                System.out.println("m = " + m.getName());
//            }

//            Member member = new Member();
//            member.setName("member1");
//            member.setTeam();
//            em.persist(member);
//
//            Team team = new Team();
//            team.setName("TeamA");
//            team.getMembers().add(member);
//            em.persist(team); /* 매핑시 실수) 연관관계 주인은 Member.Team 이니 값을 입력해줘야 한다.  */


            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            Member member = new Member();
            member.setName("member1");
            member.setTeam(team);
            em.persist(member); /* 연관관계 주인한테 값을 주면 정상적 즉 양방향 매핑은 항상 양쪽다 값을 넣어줘야 한다. */


            em.flush();
            em.clear();

            Team findTeam = em.find(Team.class, team.getId());
            List<Member> members = findTeam.getMembers(); /* 만약 em.flush, clear를 안 하고 찾을 경우에 1차 캐시에서 찾게 되므로 가져올 수 없음 따라서 양쪽 다 값을 넣어줘야 한다. */

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        } /* 정석으로 쓰려면 이렇게 try catch를 해야한다. 하지만 안해도 됨 왜 ? spring에서 관리 */

        emf.close();
    }
}
