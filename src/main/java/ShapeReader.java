import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @author Cody Hopkins
 * Date: 06/28/2025
 * Explanation: Reads a CSV and uses the values to create shapes
 */
public class ShapeReader {
    public static void main(String[] args) {
        String fileName = "testfile.csv";
        List<Shape> shapes;
        shapes = shapesFromFiles(fileName);
        assert shapes != null;

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
    /**
     * reads from a CSV of format:
     * shapes,width,height
     * @param fileName where our shapes are stored
     * @return a list of Shapes
     */
    static List<Shape> shapesFromFiles(String fileName){
        List<Shape> shapes = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.printf("Could not open file '%s'%n", fileName);
            return null;
        }

        while (scanner.hasNextLine()) {
            String shapeString = scanner.nextLine();
            shapes.add(ShapeFactory.getShape(shapeString));
        }

        return shapes;
    }
}
