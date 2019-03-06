package com.itcast.service;

import com.itcast.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll();
}
