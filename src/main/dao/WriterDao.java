package main.dao;

import java.util.List;
import main.baseDao.BaseDao;
import main.model.Writer;

/**
 * Aug 23, 2016
 * @author galip
 *
 */
public class WriterDao extends BaseDao {
	
	
	
	// for custom dao queries.
	
	public List<Writer> getAllWriters(Writer w) {
		return getAllList(w);
	}
	
}
