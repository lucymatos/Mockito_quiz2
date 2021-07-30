import java.util.ArrayList;
import java.util.List;


public class BookImplementation {

    BookService bookService;

    public BookImplementation(BookService bookService){
        this.bookService = bookService;
    }

    public List<String> Retrieve(){
        List<String> filter = new ArrayList<String>();
        List<String> books = bookService.retrieveBooks();

        for(String bks:books){
            if(bks.contains("Java")){
                filter.add(bks);
            }
        }
        return filter;
    }

    public void deleteBooks(){
        List<String> books = bookService.retrieveBooks();

        for(String bks:books){
            if(!bks.contains("Java")){
                bookService.deleteBooks(bks);
            }
        }
    }




}
