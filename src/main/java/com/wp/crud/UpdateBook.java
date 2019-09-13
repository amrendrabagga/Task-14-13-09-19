package com.wp.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wp.entity.Book;
import com.wp.util.Util;

public class UpdateBook {

	public static void main(String[] args) {
		Session session = Util.getSF().openSession();
		Book book = new Book(217,"7 habbits of highly effective people","motivation",1100);
		Transaction tr = session.beginTransaction();
		session.update(book);
		tr.commit();
		session.close();
		System.out.println("BOOK UPDATED SUCCESSFULLY");

	}

}
