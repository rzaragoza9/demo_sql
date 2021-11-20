package com.example.demo_sql.repositories;

import com.example.demo_sql.models.NoteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteDTO,Integer> {
}
