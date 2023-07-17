package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId; /* 만약 이렇게 코드를 짤 경우 Order를 통해 Member를 호출하는게 객체지향적이지 않음. JPAMain 확인 */
    /*
    private Member member; 이렇게 해서 member를 바로 찾는게 객체지향적.
     */


    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING) /* Enum 타입은 EnumType.STRING으로 명시해줘야 한다. */
    private OrderStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
