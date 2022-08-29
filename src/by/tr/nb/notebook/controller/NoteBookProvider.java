package by.tr.nb.notebook.controller;

import java.util.ArrayList;
import java.util.List;

import by.tr.nb.notebook.beans.Notebook;


public class NoteBookProvider {
	private static final NoteBookProvider instance = new NoteBookProvider();
	
	private List<Notebook> wh = new ArrayList<Notebook>();
	private Notebook noteBook = new Notebook();
	
	private NoteBookProvider() {
		wh.add(new Notebook());
			
	}
	
	public Notebook getNoteBook(int index) {
		if(index>=wh.size()) {
			throw new RuntimeException("error");
		}
		return wh.get(index);
	}
	
	public static NoteBookProvider getInstance() {
		return instance;
	}
	
	public int createNewNoteBook() {
		noteBook = new Notebook();
		wh.add(noteBook);
		return wh.size()-1;
				
	}

}