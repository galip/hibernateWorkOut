package main.service;

import java.util.List;
import main.model.Book;

/**
 * Aug 24, 2016
 * @author galip
 *
 */
public interface  BookService {
	public void save(Book book);
	public void delete(Book book, int id);
	public List<Book> getAllBooks(Book book);
}
