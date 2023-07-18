package helloJPA;

import javax.persistence.*;

@Entity
public class Locker {

    @Id
    @GeneratedValue
    @Column(name = "LOCKER_ID")
    private Long id;

    private String name;

     @OneToOne(mappedBy = "locker") /* 일대일 양방향 */
    private Member member;
}
