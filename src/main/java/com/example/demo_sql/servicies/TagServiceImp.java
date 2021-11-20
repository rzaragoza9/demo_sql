package com.example.demo_sql.servicies;

import com.example.demo_sql.models.TagDTO;
import com.example.demo_sql.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class TagServiceImp implements  TagService{
    @Autowired
    private TagRepository tagRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public TagDTO addTag(TagDTO tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void removeTag(Integer tag) {
        tagRepository.deleteById(tag);
    }

    @Override
    public List<TagDTO> findTagsByUser(Integer id) {
        return tagRepository.findTagsByUser(id);
    }
}
