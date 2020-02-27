package me.carlosehr.planetaryrouting.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

//This entity class defines trouble ticket notes
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Agent name is required")
    private String agent;
    @NotBlank(message = "Site information is required")
    private String site;
    @Column( unique = true)
    private Long noteIdentifier;
    @NotBlank(message = "Note details are required")
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd")
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

    public Long getNoteIdentifier() {
        return noteIdentifier;
    }

    public void setNoteIdentifier(Long noteIdentifier) {
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
