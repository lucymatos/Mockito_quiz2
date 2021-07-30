import java.util.Arrays;
import java.util.List;

public class BookStub implements BookService {

    @Override
    public List<String> retrieveBooks() {
        return  Arrays.asList("PHP", "Java for Dummies","Java for Experts", "HTML");
    }

    @Override
    public void deleteBooks(String book) {

    }







}
