package com.example.entitymanagerdemo.controller;

import com.example.entitymanagerdemo.model.User;
import com.example.entitymanagerdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

  private final UserService userService;

  @PostMapping
  public HttpStatus save(@RequestBody User user) {
    userService.add(user);
    return HttpStatus.CREATED;
  }


}
