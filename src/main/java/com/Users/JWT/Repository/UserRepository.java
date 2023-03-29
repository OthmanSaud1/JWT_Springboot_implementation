package com.Users.JWT.Repository;

import com.Users.JWT.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
