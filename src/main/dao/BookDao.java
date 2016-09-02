package main.dao;

import java.util.List;
import main.baseDao.BaseDao;
import main.model.Book;

/**
 * Aug 23, 2016
 * @author galip
 *
 */
public class BookDao extends BaseDao {
	
	
	
	// we can write custom dao queries here.
	
	public List<Book> getAllBooks(Book book) {
		return getAllList(book);
	}
	
}
