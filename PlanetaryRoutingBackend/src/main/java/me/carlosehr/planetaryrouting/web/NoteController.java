package me.carlosehr.planetaryrouting.web;


import me.carlosehr.planetaryrouting.domain.Note;
import me.carlosehr.planetaryrouting.services.MapValidationError;
import me.carlosehr.planetaryrouting.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @Autowired
    private MapValidationError mapValidationError;

    @PostMapping("")
    public ResponseEntity<?> createNewNote(@Valid @RequestBody Note note, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationError.MapValidationService(result);
        if(errorMap != null) return errorMap;

        Note newNote = noteService.saveNote(note);
        return new ResponseEntity<Note>(note, HttpStatus.CREATED);
    }

    @GetMapping("/{noteId}")
    public ResponseEntity<?> getNoteById(@PathVariable Long noteId){

        Note note = noteService.findNoteByIdentifier(noteId);
        return new ResponseEntity<Note>(note, HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Note> getAllNotes(){return noteService.findAllNotes();}

    @DeleteMapping("/{noteId}")
    public ResponseEntity<?> deleteNote(@PathVariable Long noteId){
        noteService.deleteNoteByIdentifier(noteId);

        return new ResponseEntity<String>("Note with Id: '" +noteId + "' was deleted.", HttpStatus.OK);
    }



}
