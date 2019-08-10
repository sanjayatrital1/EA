package edu.mum.cs.onlinemarket.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Long id;
    private double totalPrice;
    @OneToMany
    private List<Product>productList;
    @OneToOne
    private User buyer;
}
