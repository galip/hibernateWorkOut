package main.impl;

import java.util.List;
import main.dao.TypeDao;
import main.model.Book;
import main.model.Type;
import main.service.TypeService;

/**
 * Aug 24, 2016
 * @author galip
 *
 */
public class TypeImpl implements TypeService {

	TypeDao typeDao = new TypeDao();
	
	
	@Override
	public void save(Type type) {
		typeDao.save(type);
	}

	
	@Override
	public void delete(Type type, int id) {
		typeDao.delete(type, id);
		
	}

	
	@Override
	public List<Type> getAllTypes(Type type) {
		return typeDao.getAllTypes(type);
	}

}