import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCircle {
    @Test
    public void testSomeCircle() {
        // Given: New Circle
        double Radius = 4;
        Circle circle = new Circle(Radius);

        //  When: Calculating the area.
        double Area = circle.getArea();

        // Then: The area should be Math.PI * 4 * 4 = 50.265...
        assertEquals(Math.PI * Radius * Radius, Area, 0.001);
    }

    @Test
    public void testSomeOtherCircle() {
        // Given: New Circle
        Circle circle2 = new Circle(0);

        //  When: Calculating the area.
        Double Area = circle2.getArea();

        // Then: The Area should be 0 since radius is 0.
        assertEquals(0.0, Area, 0.001);
    }                                                                               
}
