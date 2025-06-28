import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author Cody Hopkins
 * Date: 06/28/2025
 * Explanation: tests
 */
class TriangleTest {

    private Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(10, 20);
    }

    @AfterEach
    void tearDown() {
        triangle = null;
    }

    @Test
    void getArea() {
        assertEquals(100.0, triangle.getArea());
    }

    @Test
    void getHeight() {
        assertEquals(10, triangle.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(20, triangle.getWidth());
    }

    @Test
    void setHeight() {
        triangle.setHeight(15);
        assertEquals(15, triangle.getHeight());
    }

    @Test
    void setWidth() {
        triangle.setWidth(25);
        assertEquals(25, triangle.getWidth());
    }

    @Test
    void testToString() {
        String expected = "Triangle{width=20, height=10, area=100.0}";
        assertEquals(expected, triangle.toString());
    }

    @Test
    void testEquals() {
        Triangle same = new Triangle(10, 20);
        Triangle different = new Triangle(5, 30);
        assertEquals(triangle, same);
        assertNotEquals(triangle, different);
        assertNotEquals(null, triangle);
        assertNotEquals("not a triangle", triangle);
    }

}