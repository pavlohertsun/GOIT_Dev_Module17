package com.example.goit_dev_module17.repositories;

import com.example.goit_dev_module17.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
