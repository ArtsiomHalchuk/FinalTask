package by.tr.nb.notebook.beans;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {
	
//	private static int count;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String note;
	private Date date;
	
	
	public Note() {
		this.note = null;
		this.date = null;
		}
	
	public Note(String note) {
		this.note = note;
		this.date = new Date();
		}
	

	public Note(String note, Date date) {
		this.note = note;
		this.date = date;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public boolean equalContent(String content) {
		return note.equals(content);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
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
		Note other = (Note) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Note [note=" + note + ", date=" + date + "]";
	}
	
	
	
}

