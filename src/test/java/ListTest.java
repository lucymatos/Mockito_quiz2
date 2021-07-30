import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

public class ListTest {


        @Mock
        List listTest;


        @Test
        public void listSize(){
            Mockito.when(listTest.size()).thenReturn(2);
            assertEquals(2,listTest.size());

        }

        @Test
        public void listSizeMul(){
            Mockito.when(listTest.size()).thenReturn(2).thenReturn(3);
            assertEquals(2,listTest.size());
            assertEquals(3,listTest.size());
        }

        @Test
        public void listSizeGet(){
            Mockito.when(listTest.get(0)).thenReturn("Hey");
            assertEquals("Hey",listTest.get(0));
            assertEquals(null,listTest.get(1));
        }

        @Test
        public void listSizeGet2(){
            Mockito.when(listTest.get(anyInt())).thenReturn("Hey");
            assertEquals("Hey",listTest.get(0));
        }

        @Test
        public void listSizeGet3(){
            Mockito.when(listTest.get(anyInt())).thenThrow(new RuntimeException("Error"));
            Assertions.assertThrows(RuntimeException.class,() -> {
                listTest.get(0);
            });
        }

}
