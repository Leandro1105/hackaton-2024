package com.example.hackathon.application.user;

import br.com.java.tcc.application.user.persistence.UserEntity;
import br.com.java.tcc.application.user.resources.UserRequest;
import br.com.java.tcc.application.user.resources.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse findById(Long id);

    UserEntity returnUser(Long id);

    List<UserResponse> findAll();

    UserResponse register(UserRequest userDTO);

    UserResponse update(Long id, UserRequest userDTO);

    String delete(Long id);

    UserResponse findByCpfAndPassword(String cpf, String password);
}