package com.example.books.modul;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("books"))
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
    private String title;
    private Double price;
    private String book_image;
    private LocalDate published_date;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
    private LocalDateTime delete_at;
}
