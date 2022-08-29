package by.tr.nb.notebook.beans;
import java.util.ArrayList;
import java.util.List;


public class Notebook {
private List<Note> notes;
	
	public Notebook() {
		notes = new ArrayList<Note>();
	}
	public void addNote(Note obj) {
		notes.add(obj);
	};
	public Note getNote(int i) {
		return notes.get(i);
	}
	public void deleteNote(Note obj) {
		notes.remove(obj);
	}

	public void addNote(String noteContent) {
		notes.add(new Note(noteContent));
	}
	public int size() {
		return notes.size();
	}
	
	
	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notebook other = (Notebook) obj;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NoteBook [notes=" + notes + "]";
	}

}
