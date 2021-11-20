package com.example.demo_sql.repositories;

import com.example.demo_sql.models.TagDTO;
import com.example.demo_sql.models.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<TagDTO,Integer> {


    @Query("from TagDTO t inner join t.users")
    List<TagDTO> findTagsByUser(Integer userId);

}
