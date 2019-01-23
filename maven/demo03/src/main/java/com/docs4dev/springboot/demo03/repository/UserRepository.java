package com.docs4dev.springboot.demo03.repository;

import com.docs4dev.springboot.demo03.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
