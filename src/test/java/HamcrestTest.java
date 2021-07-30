import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {

    List<Integer> scores = Arrays.asList(99,100,101,105);
    Integer[] marks = {1,2,3};

    @Test
    public void scoresTest() {
        assertThat(scores,hasSize(4));
        assertThat(scores,hasItems(100,101));
        assertThat(scores,everyItem(greaterThan(90)));
        assertThat(scores,everyItem(lessThan(200)));

        assertThat("",isEmptyString());
        assertThat(null, isEmptyOrNullString());

        assertThat(marks,arrayWithSize(3));
        assertThat(marks,arrayContainingInAnyOrder(2,3,1));


    }


}
