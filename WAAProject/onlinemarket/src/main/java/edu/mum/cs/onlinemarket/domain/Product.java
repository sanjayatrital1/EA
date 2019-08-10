package edu.mum.cs.onlinemarket.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private  String description;
    private double price;
    private int quantiy;
    @OneToOne
    private User serrer;
    private Integer points;
    private LocalDate createDate;
    @OneToMany
    private List<Review>reviewList;

}
