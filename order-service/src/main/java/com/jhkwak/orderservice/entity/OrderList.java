package com.jhkwak.orderservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@Table(name = "order_list")
@NoArgsConstructor
public class OrderList extends TimeStamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @OneToMany(mappedBy = "orderList", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderListDetail> orderListDetails;

    @Column(nullable = false)
    private Character status;

    public OrderList(Long userId, List<OrderListDetail> orderListDetails, Character status){
        this.userId = userId;
        this.status = status;
        this.orderListDetails = orderListDetails;
        for (OrderListDetail detail : orderListDetails) {
            detail.setOrderList(this);
        }
    }
}
