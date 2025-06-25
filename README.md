# Lab 01

This lab gives us more experience with Java by reading from files, creating interfaces, and writing more unit tests (hooray.).

We also do a lot of work in git, GitHub, and GitHub classroom.

Please complete all the todos and answer all the questions.

## Major Goals

- practice with Java
- learn about git/GitHub
- Learn to read from files
- Use Try/Catch
- Creating interfaces

## Part 00: GitHub

If you are reading this, you've already joined the GitHub classroom.

## Part 01: Filling in Rectangle
- Make a branch for rectangle
- add a toString to Rectangle
- add an equals method to Rectangle
- add an equality test for Rectangle
- Merge main into rectangle
- push rectangle
- open a PR

## part 02: Shape interface
- Make a branch called shape
	- git checkout -b shape
- Create an interface named Shape
- add a method named getArea
  - Question: What visibility does getArea have?
- Make rectangle implement Shape
  - Add an annotation to the existing getArea method
- commit your changes
- merge main into shape
- push your changes
- go to GitHub and make a pull request
- Merge shape into main
  - DO NOT DELETE THE _SHAPE_ BRANCH
  - Normally we would, but I want to see it.

## part 03: ShapeFactory
- make a new branch named shapefactory

### Make a class named ShapeFactory
- declare three symbolic constants
- SHAPE_TYPE
- SHAPE_WIDTH
- SHAPE_HEIGHT
	- It might be a good idea to make these enums
	
### make a static method getShape(String)
- it returns a shape
- Split the String on a ","
- Check to make sure there are enough tokens
- Get the values from the tokens
- Use the first value to call the appropriate constructor

### Merge
- Update your repo
	- git fetch
- merge main into shapefactory
	- git merge main
- update your local
	- git pull origin shapefactory
-  push your changes
	-  git push origin shapefactory
-  make a PR
-  merge shapefactory into main
	-  do not delete shapefactory

## part 04: ShapeReader.java

Make a class named ShapeReader.java

### make a static method named shapesFromFile(String filename)
- create a List of type Shape
- Create a file using the filename
- create a scanner
- Open the file with a scanner
	- Use a try catch
- While there are elements in the scanner
- read the line and send it through ShapeFactory
- add the result to a list

### make a main method
 - Make a List of type shapes 
 	- populate it with the results of calling shapesFromFile
 - Use an enhanced for loop to print all the shapes from the list
 
 - Merge everything into main
 # Expected output
Output should look similar to:
```
> Task :ShapeReader.main()
I don't know what a triangle is 
I don't know what a octagon is 
Rectangle{width=4, height=6, area=24}
Rectangle{width=6, height=7, area=42}
null
null
Rectangle{width=4, height=4, area=16}
```
 
 ## part 05: Testing
 - The expected format of the CSV is:
 	- shape,width,height
 - Ensure your code can handle:
 	- shape, width, height
 	- i.e. ```rectangle, 12, 2```

 ## part 06: Exercises
 
 These are exercises to be completed by the student on their own.
### ShapeFactory
- Add unit tests for shapes it doesn't know
- Add a unit test to make sure a shape is returned properly
- Add a try catch for the conversion from String to int

 ### Triangle
 - Make & checkout a new branch named _triangle_
 - make a new class named ```Triangle```
 	- it must implement Shape
 - Ensure the area is calculated correctly
 	- The area of a triangle is 0.5 * width * height
 - Question: does the following code work:
 ```Java
 Shape s = new Rectangle(6,7);
 System.out.println(s.getHeight());
 ```