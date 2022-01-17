package com.example.restapitest.repo;

import com.example.restapitest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
