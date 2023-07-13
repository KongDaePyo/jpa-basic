package helloJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /* JPA가 관리 */
/* @Table(name = "USER")  Table 이름을 강제로 줄 수 있다. 즉 여기서 USER는 DB Table */
public class Member {

    @Id /* PK가 어떤 필드인지 명시해야 한다. */
    private Long id;
    /* @Column(name = "USERNAME") Table과 동일하다. 컬럼명 강제로 줄 수 있다.*/
    private String name;

    public Member() {} // JPA는 내부적으로 리플렉션 ? 같은 걸 사용하기 때문에 동적으로 객체를 생성해야함 -> 기본 생성자가 하나 있어야 한다.


    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
