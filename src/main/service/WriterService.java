package main.service;

import java.util.List;
import main.model.Writer;

/**
 * Aug 24, 2016
 * @author galip
 *
 */
public interface  WriterService {
	public void save(Writer w);
	public void delete(Writer w, int id);
	public List<Writer> getAllWriters(Writer w);
}
