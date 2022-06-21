package com.example.entitymanagerdemo.service.impl;

import com.example.entitymanagerdemo.config.EntityManagerFactoryConfig;
import com.example.entitymanagerdemo.model.User;
import com.example.entitymanagerdemo.repository.UserRepository;
import com.example.entitymanagerdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public void add(User user) {
userRepository.save(user);
  }
}
