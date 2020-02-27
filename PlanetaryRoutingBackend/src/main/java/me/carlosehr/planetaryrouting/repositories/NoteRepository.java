package me.carlosehr.planetaryrouting.repositories;

import me.carlosehr.planetaryrouting.domain.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {

    Note findByNoteIdentifier(Long noteId);

    @Override
    Iterable<Note> findAll();


}
