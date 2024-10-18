import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSquare {
    @Test
    public void testSomeSquare() {
        Square square = new Square(5);
        double area = square.getArea();
        assertEquals(25.0, area, 0.001);
    }

    @Test
    public void testSomeOtherSquare() {
        Square square = new Square(4);
        double area = square.getArea();
        double side = square.getSide();
        assertEquals(4, side, 0.001);
        assertEquals(16.0, area, 0.001);
    }
}
