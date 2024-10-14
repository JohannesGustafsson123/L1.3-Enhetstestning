import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestShapeCollection {

    // 2D shape test's

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
        
        // Check: All shapes are circles (should return true because the collection is empty).
        assertTrue(Collection.isAllCircles());
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
        
        // Check: All shapes are circles (should return false because there's a rectangle).
        assertFalse(Collection.isAllCircles());
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
        
        // Check: All shapes are circles (should return false because there's a rectangle).
        assertFalse(Collection.isAllCircles());
    }

    @Test
    public void testSingleSquare() {
        // Given: New shape collection and a square.
        ShapeCollection Collection = new ShapeCollection();
        Square Square = new Square(4); // 4 * 4 = 16 in area.
        
        // When: Add Square to ShapeCollection.
        Collection.addShape(Square);
        
        // Then: Amount of shapes should be 1 and total area needs to be correct.
        assertEquals(1, Collection.getNumberOfShapes());
        assertEquals(16.0, Collection.getTotalArea(), 0.001);
        
        // Check: All shapes are circles (should return false because there's a square).
        assertFalse(Collection.isAllCircles());
    }

    @Test
    public void testTriangleAndCircle() {
        // Given: New shape collection with a triangle and a circle.
        ShapeCollection Collection = new ShapeCollection();
        Triangle Triangle = new Triangle(3, 6); // 0.5 * 3 * 6 = 9 in area.
        Circle Circle = new Circle(3); // PI * 3^2 ≈ 28.274 in area.
        
        // When: Add Triangle and Circle to ShapeCollection.
        Collection.addShape(Triangle);
        Collection.addShape(Circle);
        
        // Then: Amount of shapes should be 2 and total area needs to be correct.
        assertEquals(2, Collection.getNumberOfShapes());
        assertEquals(9.0 + Math.PI * 9, Collection.getTotalArea(), 0.001);
        
        // Check: All shapes are circles (should return false because there's a triangle).
        assertFalse(Collection.isAllCircles());
    }



    // 3D shape test's
    @Test
    public void testCylinderVolume() {
        // Given: A cylinder with radius 3 and height 5.
        Cylinder Cylinder = new Cylinder(3, 5);
        
        // When: Calculating the volume.
        double Volume = Cylinder.getVolume();
        
        // Then: The volume should be PI * 3^2 * 5 = 141.37...
        assertEquals(Math.PI * 9 * 5, Volume, 0.001);
    }

    @Test
    public void testCylinderWithZeroHeight() {
        // Given: A cylinder with radius 4 and height 0.
        Cylinder Cylinder = new Cylinder(4, 0);
        
        // When: Calculating the volume.
        double Volume = Cylinder.getVolume();
        
        // Then: The volume should be 0 since height is 0.
        assertEquals(0.0, Volume, 0.001);
    }

    @Test
    public void testSphereVolume() {
        // Given: A sphere with radius 4.
        Sphere Sphere = new Sphere(4);
        
        // When: Calculating the volume.
        double Volume = Sphere.getVolume();
        
        // Then: The volume should be (4/3) * PI * 4^3 = 268.08...
        assertEquals((4.0 / 3.0) * Math.PI * Math.pow(4, 3), Volume, 0.001);
    }

    @Test
    public void testSphereWithZeroRadius() {
        // Given: A sphere with radius 0.
        Sphere Sphere = new Sphere(0);
        
        // When: Calculating the volume.
        double Volume = Sphere.getVolume();
        
        // Then: The volume should be 0 because the radius is 0.
        assertEquals(0.0, Volume, 0.001);
    }
}