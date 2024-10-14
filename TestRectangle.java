import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRectangle {
    @Test
    public void testSomeRectangle() {
        // TODO: Skriv klart tester för en rektangel.
        // Ta bort raden nedan innan du börjar.
        // Kom ihåg Given, When, Then och se till att
        // ALLA metoder i Rectangle täcks av dina tester.
        String name = "Rectangle1";
        double height = 100;
        double base = 50;
        Rectangle rectangle = new Rectangle(base, height);
        assertTrue(rectangle.getWidth() == 50 );
        assertTrue(rectangle.getHeight() == 100 );
        assertTrue(rectangle.getArea() == base * height);
    }

    @Test
    public void testSomeOtherRectangle() {
        // TODO: Skriv klart tester för en annan rektangel.
        // Ta bort raden nedan innan du börjar.
        String name = "Rectangle2";
        double height = 75;
        double base = 150;
        Rectangle rectangle = new Rectangle(base, height);
        assertTrue(rectangle.getWidth() == 150 );
        assertTrue(rectangle.getHeight() == 75 );
        assertTrue(rectangle.getArea() == base * height);
    }
}
