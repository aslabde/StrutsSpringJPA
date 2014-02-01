import tk.ebalsa.StrutsSpringJPA.bo;
import tk.ebalsa.StrutsSpringJPA.persistence.BookRepository;

public class BookBoImpl implements BookBo {

	private BookRepository bookrepository;
	
		
	@Autowired
	public void setBookRepository(BookRepository bookrepository){
		this.bookrepository=bookrepository;
	}

	public void addBook(Book book){
		this.bookrepository.save(book);
	}

	public List<Book> listBooks(){
		this.bookrepository.findAll();
	}
}
