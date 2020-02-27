package me.carlosehr.planetaryrouting.services;

import me.carlosehr.planetaryrouting.domain.Note;
import me.carlosehr.planetaryrouting.exceptions.NoteIdException;
import me.carlosehr.planetaryrouting.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note saveNote(Note note){
        Note newNote = noteRepository.save(note);

        return newNote;
    }

    public Note findNoteByIdentifier(Long noteId){

        Note note = noteRepository.findByNoteIdentifier(noteId);

        if(note == null){
            throw new NoteIdException("Note Id '" + noteId + "' does not exist.");
        }
        return note;
    }

    public Iterable<Note> findAllNotes(){
        return noteRepository.findAll();
    }

    public void deleteNoteByIdentifier(Long noteId){
        Note note = noteRepository.findByNoteIdentifier(noteId);

        if(note == null ){
            throw new NoteIdException("Note id: '" + noteId + "' not found.");
        }
        noteRepository.delete(note);
    }
}
