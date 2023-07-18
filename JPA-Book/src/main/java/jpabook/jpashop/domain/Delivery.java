package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    private String city;

    private String street;

    private String zipcode;
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery") /* Order에 있는 delivery 필드와 mapped */
    private Order order;
}
