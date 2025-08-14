package com.example.ExercicioRevisao.controller;

import com.example.ExercicioRevisao.model.produto.Produto;
import com.example.ExercicioRevisao.model.user.User;
import com.example.ExercicioRevisao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> listaTodos(){
        List<User> lista = userRepository.findAll();
        return ResponseEntity.ok(lista);
    }

}
