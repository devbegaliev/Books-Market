package com.example.books.modul;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "book_id",updatable = false,insertable = false)
    private Book bookid;
}
