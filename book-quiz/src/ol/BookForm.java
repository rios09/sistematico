package ol;

import java.util.List;
import java.util.Scanner;

import ui.Book;

public class BookForm {

	Scanner scan = new Scanner(System.in);
	private Book book;
	private List<Book> books;
	
	
	
	public BookForm(List<Book> books) {
		super();
		this.books = books;
	}

	public BookForm(Book book) {
		super();
		this.book = book;
	}
	
	public BookForm() {
		super();
		this.books = books;
	}
	
	public Book catchBook() {
		Book b = new Book();
		System.out.println("Título: ");
		scan.nextLine();
		b.setTitle(scan.nextLine());
		
		System.out.println("Editorial: ");
		b.setEditorial(scan.nextLine());
		
		System.out.println("Edicion: ");
		b.setEditorial(scan.nextLine());
		
		System.out.println("Año Publicado");
		b.setYear(scan.nextInt());
		
		return b;
	}
	

	
	public void showBooks() {
		for(int i=0; i<books.size(); i++) {
			System.out.printf("%d | %s | %s | %s | %\n", i+1, books.get(i).getTitle(), books.get(i).getEditorial(), books.get(i).getEdition(), books.get(i).getYear());
		}
	}
	
}
