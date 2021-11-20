package com.example.demo_sql.controllers;

import com.example.demo_sql.models.TagDTO;
import com.example.demo_sql.servicies.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    TagService tagService;

    @PostMapping("/addTag")
    public ResponseEntity<TagDTO> addUser(@RequestBody TagDTO tag){
        return new ResponseEntity<>(tagService.addTag(tag), HttpStatus.OK);
    }

    @GetMapping("/getTags/{id}")
    public ResponseEntity<List<TagDTO>> getTags(@PathVariable Integer id){
        return new ResponseEntity<>(tagService.findTagsByUser(id), HttpStatus.OK);
    }
}
