package com.example.goit_dev_module17.services;

import com.example.goit_dev_module17.dtos.NoteDto;
import com.example.goit_dev_module17.entities.Note;
import com.example.goit_dev_module17.repositories.NoteRepository;
import com.example.goit_dev_module17.utils.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<NoteDto> getAllNotes(){
        List<Note> notes = noteRepository.findAll();

        return NoteMapper.toNoteDtoList(notes);
    }

    public NoteDto getNoteById(long id) throws Exception {
        return noteRepository.findById(id)
                .map(NoteMapper::toNoteDto)
                .orElseThrow(() -> new Exception("Note with id #" + id + " not found"));
    }


    public NoteDto createNote(NoteDto noteDto){
        return NoteMapper.toNoteDto(noteRepository.save(NoteMapper.toNoteEntity(noteDto)));
    }

    public void deleteNote(long id) throws Exception{
        noteRepository.deleteById(id);
    }

    public void updateNote(NoteDto noteDto) throws Exception{
        noteRepository.save(NoteMapper.toNoteEntity(noteDto));
    }
}
