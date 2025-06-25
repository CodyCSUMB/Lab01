import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Drew "Dr.C" Clinkenbeard
 * <br>
 * created: 6/21/25
 * @since 0.1.0
 */
class RectangleTest {

  int widthOne = 10;
  int heightOne = 15;
  int widthTwo = 20;
  int heightTwo = 5;

  Rectangle testRectangleOne = null;
  Rectangle testRectangleTwo = null;


  @BeforeAll
  static void overallSetup(){
    System.out.println("This runs once, at the beginning");
  }

  @BeforeEach
  void setUp() {
    System.out.println("This runs before EACH test");
    testRectangleOne = new Rectangle(widthOne, heightOne);
    testRectangleTwo = new Rectangle(widthTwo, heightTwo);
  }

  @AfterEach
  void tearDown() {
    System.out.println("This runs after EACH test");
    testRectangleOne = null;
    testRectangleTwo = null;
  }

  @AfterAll
  static void overallTeardown(){
    System.out.println("This runs at the very end after all tests");
  }

  @Test
  void instantiationTest(){
    System.out.printf("Checking if %s is null.%n", testRectangleOne  );
    assertNotNull(testRectangleOne);
  }

  @Test
  void getArea() {
    assertEquals((heightOne*widthOne),testRectangleOne.getArea());
  }

  @Test
  void isSquare() {
    assertFalse(testRectangleOne.isSquare());
    Rectangle square = new Rectangle();
    assertTrue(square.isSquare());
  }

  @Test
  void getWidth() {
    assertEquals(widthOne, testRectangleOne.getWidth());
  }

  @Test
  void setWidth() {
    assertEquals(widthOne, testRectangleOne.getWidth());
    testRectangleOne.setWidth(widthTwo);
    assertNotEquals(widthOne, testRectangleOne.getWidth());
    assertEquals(widthTwo, testRectangleOne.getWidth());
    int testValue = -42;
    testRectangleOne.setWidth(testValue);
    assertNotEquals(testValue, testRectangleOne.getWidth());
    assertEquals(Math.abs(testValue),testRectangleOne.getWidth());
  }

  @Test
  void setHeight() {
    assertEquals(heightOne, testRectangleOne.getHeight());
    testRectangleOne.setHeight(heightTwo);
    assertNotEquals(heightOne, testRectangleOne.getHeight());
    assertEquals(heightTwo, testRectangleOne.getHeight());
    int testValue = -42;
    testRectangleOne.setHeight(testValue);
    assertNotEquals(testValue, testRectangleOne.getHeight());
    assertEquals(Math.abs(testValue),testRectangleOne.getHeight());
  }

  @Test
  void getHeight() {
    //TODO: Write a test to check that height is being retrieved correctly.
  }
}