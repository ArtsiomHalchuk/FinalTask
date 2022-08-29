package by.tr.nb.notebook.service;

import java.util.List;

import by.tr.nb.notebook.beans.Note;
import by.tr.nb.notebook.beans.Notebook;
import by.tr.nb.notebook.controller.NoteBookProvider;


import java.util.ArrayList;
import java.util.Date;

public class NotebookLogicImpl implements NotebookLogic{
	
	private Notebook nb;
	List<Note> notes =  nb.getNotes();
	private static final NoteBookProvider provider = NoteBookProvider.getInstance();
	
	public NotebookLogicImpl(Notebook nb) {
		this.nb = nb;
	}
	
	private Note findNote(Note note) {
		if(!notes.contains(note)) {
			return null;
		}
		
		for(Note n: notes) {
			if(n.equals(note)){
				return n;
			}
		}
		return null;
	}
	
	public void changeNoteBook(int index) {
		this.nb = provider.getNoteBook(index);
	}
	
	public void addNote(Note obj) {
		notes.add(obj);
	};
	
	public void deleteNote(Note obj) {
		notes.remove(obj);
	}

	public void addNote(String noteContent) {
		notes.add(new Note(noteContent));
	}
	
	public void editNote(Note note, String context, Date date) {
		notes.set(notes.indexOf(note), new Note(context, date));
	}
	
	public void editNote(Note note, Date date) {
		Note n = findNote(note);
		
		if (n== null) {
			return;
		}
		
		n.setDate(date);
	}
	
	
	public Note findByContent(String content) {
		
		for(Note n : notes) {
			if(n.equalContent(content)) {
				return n;
			}
		}
		return null;
	}
	
	public List<Note> findByPartContent(String content) {
		List<Note> result = new ArrayList<Note>();
		for(Note n : notes) {
			if(n.getNote().contains(content)) {
				result.add(n);
			}
		}		
		return result;
	}
	
	public List<Note> findByDate(Date date){
		List<Note> result = new ArrayList<Note>();
		for (Note note: notes) {
			if (note.getDate().equals(date)) {
				result.add(note);
			}
		}
		return result;
	}
	
	public int getSize() {
		return nb.size();
	}

}
