package br.com.willianctti.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.IdClass;
import lombok.Data;


@Data
@Entity(name= "tb_tasks")
public class TaskModel {
    /**
     * Id
     * Usuário
     * Descrição
     * Título
     * Data de início
     * Data de término
     * Prioridade
     */

     @Id
     @GeneratedValue(generator = "UUID")
     private UUID id;
     private String description;
     @Column(length = 50)
     private String title;
     private LocalDateTime startAt;
     private LocalDateTime endAt;
     private String priority;
     private UUID idUser;

    @CreationTimestamp
     private LocalDateTime createdAt;


    




}
