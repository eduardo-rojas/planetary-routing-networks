package me.carlosehr.planetaryrouting.services;

import me.carlosehr.planetaryrouting.domain.Note;
import me.carlosehr.planetaryrouting.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note saveNote(Note note){

        return noteRepository.save(note);

    }
}
