package by.tr.nb.notebook.service;

import by.tr.nb.notebook.beans.Note;

public interface NotebookLogic {
	
	public void addNote(Note obj);
	public void addNote(String noteContent);
	public void deleteNote(Note obj);
	public int getSize();
	
	
	


}
