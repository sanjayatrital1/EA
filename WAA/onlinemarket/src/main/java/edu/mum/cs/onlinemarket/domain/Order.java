package edu.mum.cs.onlinemarket.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private String status;
    @OneToOne
    private Cart cart;
    private LocalDate deliveryDate;
    private LocalDate createDate;

}
