import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest4 {
    @Test
    public void check() {
        Triangle triangle = new Triangle();
        int actual = triangle.check(0,3,4);
        int expected = 4;
        assertEquals(expected,actual);
    }
}