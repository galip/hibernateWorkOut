package main.impl;

import java.util.List;
import main.dao.WriterDao;
import main.model.Writer;
import main.service.WriterService;

/**
 * Aug 24, 2016
 * @author galip
 *
 */
public class WriterImpl implements WriterService {

	WriterDao writerDao = new WriterDao();
	
	
	@Override
	public void save(Writer w) {
		writerDao.save(w);
	}

	
	@Override
	public void delete(Writer w, int id) {
		writerDao.delete(w, id);
		
	}


	@Override
	public List<Writer> getAllWriters(Writer w) {
		return writerDao.getAllWriters(w);
	}
	
}
