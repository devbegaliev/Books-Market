package com.example.books.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CostumerDto {
    private Integer id;
    @NotNull(message = "Familiyasi bosh bolishi mumkin emas")
    private String name;
    @NotNull(message = "Familiyasi bosh bolishi mumkin emas")
    private String surname;
    @Size(min = 8,max = 20,message = "parol 8tadan kop 20 tadan kam bolishi shart")
    private String password;
    @Size(min = 12,max = 13)
    private String contact;
    private Boolean city;
    @Email
    private String email;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
    private LocalDateTime delete_at;
}
