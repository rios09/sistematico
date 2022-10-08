package ui;

import java.io.Serializable;

public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9107628452467033495L;
	private String title;
	private String editorial;
	private String edition;
	private int year;
	
	public Book() {
		super();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
