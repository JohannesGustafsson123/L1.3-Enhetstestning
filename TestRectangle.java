import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRectangle {
    @Test
    public void testSomeRectangle() {
        // Given: A rectangle with width 50 and height 100
        double height = 100;
        double width = 50;
        Rectangle rectangle = new Rectangle(width, height);
         // Then: the area should be 5000
        assertTrue(rectangle.getWidth() == 50 );
        assertTrue(rectangle.getHeight() == 100 );
        assertTrue(rectangle.getArea() == width * height);
    }

    @Test
    public void testSomeOtherRectangle() {
        // Given: A rectangle with width 150 and height 75
        double height = 75;
        double width = 150;
        Rectangle rectangle = new Rectangle(width, height);
         // Then: the area should be 11250
        assertTrue(rectangle.getWidth() == 150 );
        assertTrue(rectangle.getHeight() == 75 );
        assertTrue(rectangle.getArea() == width * height);
    }
}
