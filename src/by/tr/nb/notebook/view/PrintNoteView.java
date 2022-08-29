package by.tr.nb.notebook.view;

import java.util.List;

import by.tr.nb.notebook.beans.Note;
import by.tr.nb.notebook.beans.Notebook;

public class PrintNoteView {
	public void print(List<Note> notes) {
		for (int i=0; i<notes.size(); i++) {
			System.out.println("note " +i+" "+notes.get(i).toString());
		}
		return;
	}
	
	public void print(Note note) {
		System.out.println(note.toString());
		return;
	}
	
	public void print(Notebook nb) {
		for (int i=0; i<nb.size(); i++) {
			System.out.println("note " +i+" " +nb.getNote(i).toString());
		}
		return;
	}

}
