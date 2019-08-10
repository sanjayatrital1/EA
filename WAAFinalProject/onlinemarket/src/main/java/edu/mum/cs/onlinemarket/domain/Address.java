package edu.mum.cs.onlinemarket.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String street;
    private String state;
    private String zipCode;
    private LocalDate createDate;
    private String status;

    @ManyToOne
    private User user;
}
