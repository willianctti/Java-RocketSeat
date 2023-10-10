package br.com.willianctti.todolist.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
    @Id
    private Long id;


    @Column(unique = true)
    private String username;    
    private String name;    
    private String password;   
    
    @CreationTimestamp
    private LocalDateTime createdAt;



}
