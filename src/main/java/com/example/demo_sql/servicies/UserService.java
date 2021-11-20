package com.example.demo_sql.servicies;

import com.example.demo_sql.models.UserDTO;

public interface UserService {
    UserDTO addUser(UserDTO user);
    void removeUser(Integer user);
}
