package com.example.demo_sql.controllers;

import com.example.demo_sql.models.UserDTO;
import com.example.demo_sql.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }

    @PostMapping("/removeUser/{id}")
    public ResponseEntity<String> removeUser(@RequestParam Integer id){
        userService.removeUser(id);
        return new ResponseEntity<>("Usuario borrado",HttpStatus.OK);
    }
}
