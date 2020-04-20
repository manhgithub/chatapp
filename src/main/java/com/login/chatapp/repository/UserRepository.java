package com.login.chatapp.repository;

import com.login.chatapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface for user, use JPA to automatic working with database
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
        User findByEmail(String email);
        User findByUserName(String userName);
}