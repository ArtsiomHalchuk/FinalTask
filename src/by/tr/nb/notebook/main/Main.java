package by.tr.nb.notebook.main;

import java.util.List;

import by.tr.nb.notebook.beans.Note;
import by.tr.nb.notebook.controller.NoteBookProvider;
import by.tr.nb.notebook.dao.NoteDAOimpl;
import by.tr.nb.notebook.service.NotebookLogicImpl;
import by.tr.nb.notebook.view.PrintNoteView;


public class Main {

	public static void main(String[] args) {
		NoteBookProvider provider = NoteBookProvider.getInstance();
		NotebookLogicImpl logic = new NotebookLogicImpl(provider.getNoteBook(0));
		PrintNoteView view = new PrintNoteView();
		NoteDAOimpl inputText = new NoteDAOimpl();
		
//		
		
		try {
			logic.addNote("note1");
			logic.addNote("note2");
			view.print(logic.findByContent("note1"));
			
			Note result = logic.findByContent("note2");
			view.print(result);
			
			
			logic.changeNoteBook(1);
			logic.addNote(inputText.getText());
			logic.addNote("note4");
			logic.addNote("note5");
			logic.addNote("note6");
			logic.addNote("text1");
			logic.addNote("text2");
			logic.addNote("text3");
			
			List<Note> searchResutls = logic.findByPartContent("note");
			print(searchResutls);
			
			
		}catch(Exception e) {
			System.out.println("sorry( ");
		}

	}

	public static void print(List<Note> notes) {
			System.out.printf("|%-10s|%-10s|\n", "Note", "Date");
			for (Note note : notes) {
				System.out.printf("|%-10s|%-10s|\n", note.getNote(), note.getDate());
			}
	}



}
