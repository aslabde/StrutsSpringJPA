package tk.ebalsa.tk.ebalsa.StrutsSpringJPA.persistence;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByAuthor (String author);
	List<Book> findByEdit (String editor);
}
