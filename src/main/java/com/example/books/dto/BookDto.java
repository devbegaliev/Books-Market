package com.example.books.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookDto {
    private Integer id;
    @NotBlank(message = "Ismi xato")
    private String name;
    @NotBlank(message = "autor nomi xato")
    private String author;
    @NotBlank(message = "Sarlavha xato")
    private String title;
    @Size(min = 1000,message = "narxi 1000 so'mdan kop bolishi kerak")
    private Double price;
    @NotBlank(message = "rasmda  xato")
    private String book_image;
    @NotBlank(message = "chiqarilgan vaqtda xato")
    private String published_date;
    private LocalDateTime create_at;
    // some is wrong
    private LocalDateTime update_at;
    private LocalDateTime delete_at;

}
