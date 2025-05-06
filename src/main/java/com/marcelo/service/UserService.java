package com.marcelo.service;

import com.marcelo.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
