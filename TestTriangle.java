import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.ref.Cleaner;

public class TestTriangle {
    @Test
    public void testSomeTriangle() {
        // TODO: Skriv klart tester för en triangel.
        // Ta bort raden nedan innan du börjar.
        // Kom ihåg Given, When, Then och se till att
        // ALLA metoder i Triangle täcks av dina tester.
        String name = "Triangle1";
        double height = 100;
        double base = 50;
        Triangle triangle = new Triangle(base, height);
        assertTrue(triangle.getWidth() == 50 );
        assertTrue(triangle.getHeight() == 100 );
        assertTrue(triangle.getArea() == base * height /2 );
    }

    @Test
    public void testSomeOtherTriangle() {
        // TODO: Skriv klart tester för en annan triangel.
        // Ta bort raden nedan innan du börjar.
        String name = "Triangle2";
        double height = 50;
        double base = 25;
        Triangle triangle = new Triangle(base, height);
        assertTrue(triangle.getWidth() == 25 );
        assertTrue(triangle.getHeight() == 50 );
        assertTrue(triangle.getArea() == base * height /2 );
    }
}
