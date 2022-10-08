package bll;

import java.util.Scanner;

import dal.BookDal;
import ol.BookForm;

public class Application {

	Scanner scan = new Scanner(System.in);

	public void options() {
		System.out.println("Seleccione la opcion a ejecutar\n"
				+ "1. Autor\n"
				+ "2. Libro\n"
				+ "3. Salir de la aplicacion");
	}
	
	public void menu() {		
		short op = 0;		
		do {
			System.out.println();
			options();
			System.out.println();
			op = scan.nextShort();
					
			switch(op) {
			case 1: authorMenu();
				break;
			case 2: bookMenu();
				break;
			case 3: System.exit(0);				
				break;
			default: System.out.println("Ingrese una opcion valida!");
				
			}

		}while(op!=3);		
	}

	public void author() {
		System.out.println("1. Agregar Autor");
		System.out.println("2. Guardar");
		System.out.println("3. Abrir");
		System.out.println("4. Volver al inicio");
		}

	public void authorMenu() {
		short op= 0;
		
		do {
			System.out.println();
			author();
			System.out.println();
			op = scan.nextShort();
					
			switch(op) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4: menu();
				break;
			default: System.out.println("Ingrese una opcion valida");			
			}
			
		}	while(op!=4);
		
	}
	
	public void book() {
		System.out.println("1. Agregar libro");
		System.out.println("2. Guardar");
		System.out.println("3. Abrir");
		System.out.println("4. Volver al Inicio");
		
	}
	
	public void bookMenu() {
		short op=0;
		
		do {
			System.out.println();
			book();
			System.out.println();
			op= scan.nextShort();
			
		switch(op) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			book();
			break;
		default: System.out.println("Ingrese una opcion valida");
		}		
			}
		while(op!=4);
	}
	
	private void add() {
		BookForm bf = new BookForm();
		books.ad
	}
	
	public void save() {

		BookDal bd = new BookDal();
			
		bd.setFilePath(pathToSave);
		
		while(fileName.length()==0) {			
			System.out.println("Por favor indica el nombre del archivo: ");		
			fileName = scan.next();
		}
		
		bd.setFileName(fileName);
		
		bd.setBooks(books);
		
		bd.saveList();
	}
	
	public void open() {
		System.out.println("Por favor indica el nombre del archivo a abrir: ");
		fileName = scan.next();
		String filePath = pathToSave + "\\" + fileName;
		BookDal bd = new BookDal();
		bd.setFilePath(filePath);
		books = bd.openList();
		
		BookForm bf = new BookForm(books);
		bf.showBooks();
	}
	
}
