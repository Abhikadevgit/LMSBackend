package com.demo.lms.lms.repo;
import com.demo.lms.lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}