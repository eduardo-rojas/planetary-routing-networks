package me.carlosehr.planetaryrouting.web;


import me.carlosehr.planetaryrouting.domain.Note;
import me.carlosehr.planetaryrouting.services.MapValidationError;
import me.carlosehr.planetaryrouting.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
