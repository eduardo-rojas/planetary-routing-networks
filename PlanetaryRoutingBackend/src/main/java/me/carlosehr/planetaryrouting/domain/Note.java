package me.carlosehr.planetaryrouting.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String agent;
    private String site;
    private String noteIdentifier;
    private String description;
    private Date dateSubmitted;

    @PrePersist
    protected void onCreate(){
        this.dateSubmitted = new Date();
    }

    public Note() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNoteIdentifier() {
        return noteIdentifier;
    }

    public void setNoteIdentifier(String noteIdentifier) {
        this.noteIdentifier = noteIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }
}
