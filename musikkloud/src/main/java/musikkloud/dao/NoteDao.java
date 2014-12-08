package musikkloud.dao;

import java.util.List;

import musikkloud.model.Note;

public interface NoteDao {
	
	public void addNote(Note n);
	
	public List<Note> getNotes(int musique);

}
