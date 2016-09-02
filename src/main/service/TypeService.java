package main.service;

import java.util.List;
import main.model.Type;

/**
 * Aug 24, 2016
 * @author galip
 *
 */
public interface  TypeService {
	public void save(Type type);
	public void delete(Type type, int id);
	public List<Type> getAllTypes(Type type);
}
