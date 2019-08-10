package edu.mum.cs.onlinemarket.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String status;
    private LocalDate createDate;
    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;
}
