package com.zavialov.DAO.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private int amount;

    @ManyToOne(optional = false)
    private Customers customer;
}
