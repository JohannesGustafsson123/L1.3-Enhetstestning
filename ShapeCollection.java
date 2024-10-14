import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {
    private List<Shape2D> shapes = new ArrayList<>();

    public void addShape(Shape2D shape) {
        shapes.add(shape);
    }

    public int getNumberOfShapes() {
        return shapes.size();
    }

    public double getTotalArea() {
        // TODO: Skriv klart den här funktionen.
        return 0.0;
    }

    public boolean isAllCircles() {

        if (shapes.isEmpty()) {
            return true;
        }

        for(Shape2D shape : shapes) {
            
            if(!(shape instanceof Circle)) {
return false;
            }
        }
        return true;
    }
}