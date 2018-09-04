import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest1 {

    @Test
    public void check() {
        Triangle triangle = new Triangle();
        int actual = triangle.check(3,5,7);
        int expected = 1;
        assertEquals(expected,actual);
    }
}