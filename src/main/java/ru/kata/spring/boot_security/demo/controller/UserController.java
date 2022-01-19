package ru.kata.spring.boot_security.demo.controller;


import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@RequestMapping("/")
//@RestController
//public class UserController {
//    private List<User> Users = Stream.of(
//            new User(13L,"andrey",2),
//            new User(13L,"a",2),
//            new User(13L,"a",2)
//    ).collect(Collectors.toList());
//
//
//    @GetMapping
//    private List<User> getAll(){
//        return Users;
//    }
//
//    public User getById(@PathVariable Long id){
//        return Users.stream().filter(user -> user.getId().equals(id))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @PostMapping
//    public User create(@RequestBody User user){
//        this.Users.add(user);
//        return user;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteById(@PathVariable Long id){
//        this.Users.removeIf(user -> user.getId().equals(id));
//    }
//}
