import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author Cody Hopkins
 * Date: 06/28/2025
 * Explanation:
 */
class ShapeFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getShape() {
    }

    @Test
    void properShape() {
        //expected
        Rectangle rectangle = new Rectangle(5,5);

        String unknownShape = "idk, 5, 5";

        String recFromFile = "rectangle, 5, 5";
        Shape newShape = ShapeFactory.getShape(recFromFile);

        Shape shape = ShapeFactory.getShape(unknownShape);

        assertNull(shape);
        assertEquals(rectangle, newShape);
    }
}