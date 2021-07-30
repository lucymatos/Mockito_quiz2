import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)

public class SpyTest {

    @Test
    public void spyTest(){
        List<String> listSpy = spy(ArrayList.class);
        listSpy.add("Rosa");
        listSpy.add("Janna");
        verify(listSpy).add("Rosa");
        verify(listSpy).add("Janna");
        assertEquals(2,listSpy.size());
        assertEquals("Rosa",listSpy.get(0));
        assertEquals("Janna",listSpy.get(1));
    }
}
