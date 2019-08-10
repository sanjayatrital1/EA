package edu.mum.cs.onlinemarket.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String password;
    private String type;
    private  String status;
    private LocalDate createDate;
    private  Integer points;
    @OneToMany
    private List<Review> reviewList;
    @ManyToMany
    private List<User> userList;
    @OneToMany
    private List<Address> addressList;
    @OneToMany
    private List<Order>orderList;
    @OneToOne
    private Cart cart;

}
