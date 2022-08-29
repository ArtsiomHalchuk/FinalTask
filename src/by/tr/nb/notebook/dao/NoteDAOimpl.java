package by.tr.nb.notebook.dao;

import java.io.IOException;
import java.util.Scanner;

public class NoteDAOimpl implements NoteDAO{

	@Override
	public String getText() throws IOException {
		Scanner sc;
		sc = new Scanner(System.in);
		return sc.nextLine();
		
	}

	@Override
	public void date() {
		
	}

	@Override
	public void action() {
		
	}

}
