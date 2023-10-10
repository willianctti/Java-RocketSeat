package br.com.willianctti.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public interface IUserRepository extends JpaRepository<UserModel, Id>{ 
    
}
