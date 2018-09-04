import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void check() {
        Triangle triangle = new Triangle();
        int actual = triangle.check(2,2,2);
        int expected = 3;
        assertEquals(expected,actual);
    }

}