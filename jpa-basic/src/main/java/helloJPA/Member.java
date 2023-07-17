package helloJPA;

import javax.persistence.*;
import java.util.Date;

@Entity /* JPA가 관리 */
/* @Table(name = "USER")  Table 이름을 강제로 줄 수 있다. 즉 여기서 USER는 DB Table */
@SequenceGenerator(name = "member_seq_generator", sequenceName = "member_seq")
public class Member {

    @Id /* PK가 어떤 필드인지 명시해야 한다. */
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_generator") /* IDENTITY vs SEQUENCE ? */
    private Long id;

    @Column(name = "NAME", nullable = false) /* Table과 동일하다. 컬럼명 강제로 줄 수 있다. */
    private String username;

//    private Integer age;
//
//    @Enumerated(EnumType.STRING) /* JPA에서 Enum 타입 사용, 기본 타입은 EnumType.ORDINAL 이다. ORDINAL은 순서를, STRING은 Enum 값을 넣어준다. 즉 ORDINAL 사용 X */
//    private RoleType roleType;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;
//
//    @Lob
//    private String description;
//
//    @Transient /* DB와 매핑 X */
//    private int temp;

    public Member() {} // JPA는 내부적으로 리플렉션 ? 같은 걸 사용하기 때문에 동적으로 객체를 생성해야함 -> 기본 생성자가 하나 있어야 한다.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public RoleType getRoleType() {
//        return roleType;
//    }
//
//    public void setRoleType(RoleType roleType) {
//        this.roleType = roleType;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public Date getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(Date lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
