package com.marcelo.service.impl;

import com.marcelo.domain.model.User;
import com.marcelo.domain.repository.UserRepository;
import com.marcelo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("User with id " + userToCreate.getId() + " already exists");
        }
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("User with account number " + userToCreate.getAccount().getNumber()
                    + " already exists");
        }
        return userRepository.save(userToCreate);
    }
}
