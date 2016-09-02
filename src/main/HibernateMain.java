package main;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import main.impl.BookImpl;
import main.impl.TypeImpl;
import main.impl.WriterImpl;
import main.model.Book;
import main.model.Type;
import main.model.Writer;

/**
 * Aug 18, 2016
 * @author galip
 *
 */
public class HibernateMain {
	
	public static void main(String args[]) {
		
		Calendar calendar = Calendar.getInstance();
    	Date date = calendar.getTime();
    	Timestamp lastUpdated = new Timestamp(date.getTime());
		
		//save a writer
		WriterImpl writerImpl = new WriterImpl();
		Writer writer = new Writer();
		writer.setName("Dostoyevski");
		writer.setLastUpdated(lastUpdated);
		writer.setDeleted("FALSE");
		writerImpl.save(writer);
		
		//get all Writer list, just for an example.
		List<Writer> writers = writerImpl.getAllWriters(writer);
		
		for(Writer wr : writers)
			System.out.println(wr.getName());
		
		TypeImpl typeImpl = new TypeImpl();
		Type type = new Type();
		type.setName("Psychology");
		type.setLastUpdated(lastUpdated);
		type.setDeleted("FALSE");
		typeImpl.save(type);
		
		List<Type> types = typeImpl.getAllTypes(type);
    	for(Type typ : types) {
    		System.out.println(typ.getName());
    	}
    	
		BookImpl bookImpl = new BookImpl();
		Book book = new Book();
		book.setName("Crime And Punishment");
		book.setWriterId(1); 
		book.setTypeId(1);
		book.setDeleted("FALSE");
		book.setLastUpdated(lastUpdated);
		
		bookImpl.save(book);
		
		List<Book> books = bookImpl.getAllBooks(book);
    	for(Book bk : books) {
    		System.out.println(bk.getName());
    	}
    	
    	bookImpl.delete(book, book.getId());
	}
}