package com.springSecurity.client.repository;

import com.springSecurity.client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
