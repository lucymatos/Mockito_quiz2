import java.util.List;

public interface BookService {

    public List<String> retrieveBooks();

    public void deleteBooks(String book);


}
