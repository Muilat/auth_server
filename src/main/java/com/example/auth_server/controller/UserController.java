package com.example.auth_server.controller;

import com.example.auth_server.model.User;
import com.example.auth_server.service.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping(value ="/users")
@Validated
public class UserController {

    @Autowired
    UserDetailServiceImpl userService;

//    @PostMapping(value = "/add")
//    public ResponseEntity<User> save(@Valid @RequestBody User user) throws URISyntaxException {
//        return userService.add(user);
//    }
//
//    @GetMapping(value = "/{id}")
//    public User get(@PathVariable
//                    @Min(value = 1, message = "id must be greater than or equal to 1")
//                    @Max(value = 1000, message = "id must be lower than or equal to 1000")
//                            Long id){
//        return userService.getById(id);
//
//    }
//
//    @GetMapping(value = "/")
//    public List<User> getAll(){
//        return userService.getAllUsers();
//    }

    @GetMapping (value = "/{username}")
    public Optional<User> getUserByUsername(@PathVariable String username){

        return userService.getUserByUsername(username);
    }
}
