package helloJPA;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team") /* 하나의 Team에 여러 명의 Member 가능, 누구랑 매핑되어 있는지 mappedBy, 주인이 아님을 나타냄 */
    private List<Member> members = new ArrayList<>(); /* ArrayList로 초기화 해주는게 관례 (null 발생 X) */

    public Team() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
