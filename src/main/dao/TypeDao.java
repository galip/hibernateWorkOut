package main.dao;

import java.util.List;
import main.baseDao.BaseDao;
import main.model.Type;

/**
 * Aug 23, 2016
 * @author galip
 *
 */
public class TypeDao extends BaseDao {
	
	// for custom dao queries.
	
	public List<Type> getAllTypes(Type type) {
		return getAllList(type);
	}
	
}