package com.example.books.modul;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "costumers")
public class Costomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;
    private String password;
    private String contact;
    private Boolean city;
    private String email;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
    private LocalDateTime delete_at;
}
