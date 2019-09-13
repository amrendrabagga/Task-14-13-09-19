package com.wp.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wp.entity.Book;
import com.wp.util.Util;

public class DeleteBook {

	public static void main(String[] args) {
		Session session = Util.getSF().openSession();
		Book book = new Book();
		book.setBook_id(217);
		Transaction tr = session.beginTransaction();
		session.delete(book);
		tr.commit();
		session.close();
		System.out.println("BOOK DELETED SUCCESSFULLY");


	}

}
