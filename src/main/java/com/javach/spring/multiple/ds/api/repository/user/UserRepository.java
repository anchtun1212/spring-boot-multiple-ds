package com.javach.spring.multiple.ds.api.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javach.spring.multiple.ds.api.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
