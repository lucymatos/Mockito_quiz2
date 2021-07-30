import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class BookImplementationTestMockito {

    @Captor
    ArgumentCaptor<String> ss;

    @Mock
    BookService bookMockTest;

    @InjectMocks
    BookImplementation implementationMockInject;

    @Test
    public void retrieveTest(){
        List<String> bks = Arrays.asList("PHP","Java for Dummies", "Java for Experts", "HTML");
        Mockito.when(bookMockTest.retrieveBooks()).thenReturn(bks);
        List<String> ff = implementationMockInject.Retrieve();
        assertEquals(2,ff.size());


    }

    @Test
    public void retrieveEmpty(){
        List<String> bks = Arrays.asList();
        Mockito.when(bookMockTest.retrieveBooks()).thenReturn(bks);
        List<String>ff = implementationMockInject.Retrieve();
        assertEquals(0,ff.size());

    }

    @Test
    public void delete(){
        List<String>bks = Arrays.asList("PHP","Java for Dummies", "Java for Experts", "HTML");
        Mockito.when(bookMockTest.retrieveBooks()).thenReturn(bks);
        implementationMockInject.deleteBooks();
        Mockito.verify(bookMockTest).deleteBooks("PHP");
        Mockito.verify(bookMockTest,Mockito.times(1)).deleteBooks("PHP");
        Mockito.verify(bookMockTest,Mockito.never()).deleteBooks("Java for Dummies");

    }

    @Test
    public void captorTest(){
        List<String>bks = Arrays.asList("PHP","Java for Dummies", "Java for Experts", "HTML");
        Mockito.when(bookMockTest.retrieveBooks()).thenReturn(bks);
        implementationMockInject.deleteBooks();
        Mockito.verify(bookMockTest,Mockito.times(2)).deleteBooks(ss.capture());
        assertEquals("HTML",ss.getValue());
    }

}