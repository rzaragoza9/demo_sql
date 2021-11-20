package com.example.demo_sql.servicies;

import com.example.demo_sql.models.TagDTO;
import com.example.demo_sql.models.UserDTO;

import java.util.List;

public interface TagService {
    TagDTO addTag(TagDTO tag);
    void removeTag(Integer tag);
    List<TagDTO> findTagsByUser(Integer id);
}
