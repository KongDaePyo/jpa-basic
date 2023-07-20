package helloJPA;

import javax.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED) /* 테이블 전략 선택 가능, 조인 전략*/
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) /* 테이블 전략 선택 가능, 단일 테이블 전략*/
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) /* 테이블 전략 선택 가능, 구현 클래스마다 테이블 전략, abstarc를 추가해야한다.*/
@DiscriminatorColumn /* DTYPE Column 생성 하위 Entity명이 들어감 */
/* @DiscriminatorValue() 자식 클래스에선 dtype에 Insert 되는 Value를 Entity명이 아닌 name 속성으로 값을 다르게 줄 수 있음 */
public abstract class Item {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
