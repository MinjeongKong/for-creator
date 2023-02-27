package com.kmj.forcreator.controller;

import com.kmj.forcreator.domain.User;
import com.kmj.forcreator.dto.UserDto;
import com.kmj.forcreator.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/user")
    public String createUser(@RequestBody UserDto userDto) {
        User user = userDto.toEntity();
        return userRepository.save(user).getId();
    }

    @GetMapping("/user/{userId}")
    public User findUser(@PathVariable String userId) {
        User user = userRepository.findById(userId).orElseThrow();
        return user;
    }
}
