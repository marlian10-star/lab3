package com.example.lab.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab.User.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
