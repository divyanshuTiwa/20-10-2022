package com.exceptions.demo.bll;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book(1,"Koren");
		Book b2 = new Book(2,"Lucent");
		Book b3 = new Book(3,"General Science");
		Book b4 = new Book(4,"Occean of c");
		Book b5 = new Book(5,"Marvels");
		
		//Store all books details in books array
		Book books[] = {b1,b2,b3,b4,b5};
		
		//Find book By Id
		try {
			if(findById(books,5)) {
				System.out.println("Book is present");
			}
			else{
				throw new BookNotFoundException("Book with the given id isn't present");
			}
		}catch(BookNotFoundException ex) {
			ex.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	// search book
	public static boolean findById(Book[] books , int id) {
		for(Book b:books) {
			if(b.getId()==id)
			return true;
		}
		return false;
	}



	}

