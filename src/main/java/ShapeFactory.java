/*
 * @author Cody Hopkins
 * Date: 06/28/2025
 * Explanation: This class contains static methods for creating shapes.
 */
public class ShapeFactory {
    //This will be used to reference values from a String[]
    public static final int SHAPE_TYPE = 0;
    public static final int SHAPE_WIDTH = 1;
    public static final int SHAPE_HEIGHT = 2;
    //Check to make sure there are the right number of tokens
    public static final int TOKEN_COUNT = 3;

   static Shape getShape(String shapeString) {

        //removes whitespace. source = https://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java
        String newShapeString = shapeString.replaceAll("\\s", "");
        String[] shapeTokens = newShapeString.split(",");
        if (shapeTokens.length != TOKEN_COUNT) {
            System.out.printf("Required number of tokens %d actual number of tokens %d is the String correct?: %s",
                    TOKEN_COUNT,
                    shapeTokens.length,
                    shapeString);
            return null;
        }
        String shapeType = shapeTokens[SHAPE_TYPE];
        int width = Integer.parseInt(shapeTokens[SHAPE_WIDTH]);
        int height = Integer.parseInt(shapeTokens[SHAPE_HEIGHT]);

        if (shapeType.equals("rectangle")) {
            return new Rectangle(width, height);
        } else {
            System.out.printf("I don't know what %s is\n", shapeType);
            return null;
        }
    }

}

