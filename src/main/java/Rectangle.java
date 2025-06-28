import java.util.Objects;

/**
 * The {@code Rectangle} class represents a two-dimensional shape with a specified width and height.
 * It provides methods to calculate the area and determine if the shape is a square.
 * <p>
 * This class also supports default initialization with equal dimensions and safe setters that ensure non-negative widths.
 * </p>
 *
 * @author Drew "Dr.C" Clinkenbeard
 * @since 0.1.0
 */
public class Rectangle implements Shape {

  private int width;
  private int height;

  /**
   * Constructs a Rectangle with the specified width and height.
   *
   * @param width  the width of the rectangle
   * @param height the height of the rectangle
   */
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Constructs a default Rectangle with width and height set to 5.
   */
  public Rectangle() {
    this(5, 5); //The keyword this refers to the current object.
    /*
    using this() will reference a constructor in the current object.
     */
  }

  /**
   * Calculates and returns the area of the rectangle.
   * TODO: Make an interface to make this generic
   * @return the area (width * height)
   */
  @Override
  public int getArea() {
    return width * height;
  }

  /**
   * Determines whether the rectangle is a square.
   *
   * @return true if the width and height are equal; false otherwise
   */
  public boolean isSquare(){
    return width==height;
  }

  /**
   * Returns the width of the rectangle.
   *
   * @return the width
   */
  public int getWidth() {
    return width;
  }

  /**
   * Sets the width of the rectangle. Converts negative inputs to positive values.
   *
   * @param width the new width
   */
  public void setWidth(int width) {
    //width can't be negative.
    this.width = Math.abs(width);
  }

  /**
   * Returns the height of the rectangle.
   *
   * @return the height
   */
  public int getHeight() {
    return height;
  }

  /**
   * Sets the height of the rectangle. Converts negative inputs to positive values.
   *
   * @param height the new height
   */
  public void setHeight(int height) {
    this.height = Math.abs(height);
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "width=" + width +
            ", height=" + height +
            ", area=" + getArea() +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Rectangle rectangle)) return false;
      return width == rectangle.width && height == rectangle.height;
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  //TODO: ToString

  //TODO: Equals and HashCode

  //TODO: Test the above.

  //TODO: make a generic SHAPE class: specifically with an getArea method.
}
