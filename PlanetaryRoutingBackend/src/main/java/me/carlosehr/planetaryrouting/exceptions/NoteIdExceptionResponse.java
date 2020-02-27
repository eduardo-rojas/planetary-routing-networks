package me.carlosehr.planetaryrouting.exceptions;

public class NoteIdExceptionResponse {

    private String noteIdentifier;

    public NoteIdExceptionResponse(String noteIdentifier) {
        this.noteIdentifier = noteIdentifier;
    }

    public String getNoteIdentifier() {
        return noteIdentifier;
    }

    public void setNoteIdentifier(String noteIdentifier) {
        this.noteIdentifier = noteIdentifier;
    }


}
