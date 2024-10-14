import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.ref.Cleaner;

public class TestTriangle {
    @Test
    public void testSomeTriangle() {
        // Given: A triangle with base 50 and height 100
        double height = 100;
        double base = 50;
        Triangle triangle = new Triangle(base, height);
        // Then: the area should be 2500
        assertTrue(triangle.getWidth() == 50 );
        assertTrue(triangle.getHeight() == 100 );
        assertTrue(triangle.getArea() == base * height /2 );
    }

    @Test
    public void testSomeOtherTriangle() {
        // Given: A triangle with base 25 and height 50
        double height = 50;
        double base = 25;
        Triangle triangle = new Triangle(base, height);
        // Then: the area should be 625
        assertTrue(triangle.getWidth() == 25 );
        assertTrue(triangle.getHeight() == 50 );
        assertTrue(triangle.getArea() == base * height /2 );
    }
}
