import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest3 {

    @Test
    public void check() {
        Triangle triangle = new Triangle();
        int actual = triangle.check(3,3,4);
        int expected = 2;
        assertEquals(expected,actual);
    }
}