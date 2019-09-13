package com.wp.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.wp.entity.Book;
import com.wp.util.Util;

public class SaveBook {

	public static void main(String[] args) {
		
		Session session = Util.getSF().openSession();
		Book book = new Book(217,"7 habbits of highly effective people","motivation",900);
		Transaction tr = session.beginTransaction();
		session.save(book);
		tr.commit();
		session.close();
		System.out.println("BOOK ADDED SUCCESSFULLY");
	}

}
