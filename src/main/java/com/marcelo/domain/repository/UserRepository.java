package com.marcelo.domain.repository;

import com.marcelo.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);

    boolean existsByCardNumber(String number);
}
