package main.impl;

import java.util.List;
import main.dao.BookDao;
import main.model.Book;
import main.service.BookService;

/**
 * Aug 24, 2016
 * @author galip
 *
 */
public class BookImpl implements BookService {

	BookDao bookDao = new BookDao();
	
	
	@Override
	public void save(Book book) {
		bookDao.save(book);
	}

	
	@Override
	public void delete(Book book, int id) {
		bookDao.delete(book, id);
		
	}

	
	@Override
	public List<Book> getAllBooks(Book book) {
		return bookDao.getAllBooks(book);
	}
}