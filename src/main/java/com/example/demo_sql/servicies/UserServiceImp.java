package com.example.demo_sql.servicies;

import com.example.demo_sql.models.UserDTO;
import com.example.demo_sql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public UserDTO addUser(UserDTO user) {
        return userRepository.save(user);
    }

    @Override
    public void removeUser(Integer user) {
        userRepository.deleteById(user);
    }
}
