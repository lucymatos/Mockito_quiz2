import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class BookImplementationTest {

    @Test
    void retrieve() {
        BookStub bs = new BookStub();
        BookImplementation bi = new BookImplementation(bs);

        List<String> fl = bi.Retrieve();
        assertEquals(2,fl.size());

    }










        




}