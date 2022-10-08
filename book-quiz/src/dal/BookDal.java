package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import ui.Book;

public class BookDal {

	private Book book;
	private List <Book> books;
	
	private String filePath;
	private String fileName;
	public BookDal() {
		super();
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	public void saveList() {
		File file = new File(filePath + "\\" + fileName);
		try {
			
			ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(books);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Book> openList() {
		try {
			File file = new File(filePath);
			ObjectInputStream os = new ObjectInputStream(new FileInputStream(file));
			List<Book> b = (List<Book>)os.readObject();
			os.close();
			return b;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	

}
