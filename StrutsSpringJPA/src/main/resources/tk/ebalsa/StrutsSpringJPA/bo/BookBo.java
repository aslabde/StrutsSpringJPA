package tk.ebalsa.StrutsSpringJPA.bo;

import java.util.List;

import tk.ebalsa.StrutsSpringJPA.model.Book;

public interface BookBo {

	void addBook (Book book);
	List<Book> listBooks();
}
