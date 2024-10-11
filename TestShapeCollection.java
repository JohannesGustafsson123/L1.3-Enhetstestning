import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestShapeCollection {
    
    @Test
    public void testEmptyCollection() {
        // Given: New shape collection.
        ShapeCollection Collection = new ShapeCollection();
        
        // When: No shape is added.
        int NumberOfShapes = Collection.getNumberOfShapes();
        double TotalArea = Collection.getTotalArea();
        
        // Then: Amount of shapes, total area should be 0.
        assertEquals(0, NumberOfShapes);
        assertEquals(0.0, TotalArea);
    }

    @Test
    public void testSingleRectangle() {
        // Given: New shape collection and rectangle.
        ShapeCollection Collection = new ShapeCollection();
        Rectangle Rect = new Rectangle(5, 10); // 5 * 10 = 50 in area.
        
        // When: Add Rectangle to ShapeCollection.
        Collection.addShape(Rect);
        
        // Then: Amount of shapes should be 1 and total area needs to be correct.
        assertEquals(1, Collection.getNumberOfShapes());
        assertEquals(50.0, Collection.getTotalArea(), 0.001);
    }

    @Test
    public void testRectangleAndCircle() {
        // Given: New shape collection and rectangle and circle.
        ShapeCollection Collection = new ShapeCollection();
        Rectangle Rect = new Rectangle(3, 4); // 3 * 4 = 12 in area.
        Circle Circle = new Circle(2); // PI * 2^2 ≈ 12.566 in area.
        
        // When: Add Rectangle and Circle to ShapeCollection
        Collection.addShape(Rect);
        Collection.addShape(Circle);
        
        // Then: Amount of shapes should be 2 and total area needs to be correct.
        assertEquals(2, Collection.getNumberOfShapes());
        assertEquals(12.0 + Math.PI * 4, Collection.getTotalArea(), 0.001);
    }
}