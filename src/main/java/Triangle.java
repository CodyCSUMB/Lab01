import java.util.Objects;

/*
 * @author Cody Hopkins
 * Date: 06/28/2025
 * Explanation:
 */
public class Triangle implements Shape<Double> {

    private int width;
    private int height;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double getArea() {
        double area  = width * height;
        return area *= 0.5;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle triangle)) return false;
        return width == triangle.width && height == triangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
