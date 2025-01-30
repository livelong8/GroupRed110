//By rainer hesch, jacob Pickard, connor haynes
public class Lab2 {
    public static void main(String[] args) {
        /*Create a new Java class in your IDE, and name it Lab2a.java.
In the main method, declare a double variable "radius" and initialize it with the value of 6.0.
Use the formula for the area of a circle (3.14159 * radius*radius) to calculate the area of the circle and store it in a variable "areaOfCircle".
Print out the value of radius and area of the circle using the System.out.println() method.
Declare two integer variables "length" and "width" and initialize them with the values of 10 and 20, respectively.
Use the formula for the area of a rectangle (length * width) to calculate the area of the rectangle and store it in a variable "areaOfRectangle".
Print out the value of length, width, and area of the rectangle.
Re-assign the value of radius to be the value of 2* radius
Re-assign the value of areaOfCircle to be the value of 3.14159 * radius*radius
Print out the new radius and area of circle after re-assignment
Re-assign the value of length to be the value of 2 * length
Re-assign the value of width to be the value of 3 * width
Re-assign the value of areaOfRectangle to be the value of length * width
Print out the new length, width, and area of the rectangle after re-assignment

         */
        //declare variables
        double radius = 6.0;
        double areaCirc = (3.14159 *(radius*radius));
        int length = 10;
        int width = 20;
        int areaRect = length*width;

        //print starting info
        System.out.println("The radius is "+radius+" and the area is "+areaCirc);
        System.out.println("The length of the rectangle is "+length+" and the width is "+width);

        //Change the variables
        radius=radius*2;
        areaCirc=3.14159*radius*radius;
        length=2*length;
        width=3*width;
        areaRect=length*width;

        //print the new info
        System.out.println("The new radius is "+radius+" and the new area is "+areaCirc);
        System.out.println("The new length is "+length+", the new width is "+width+" and the new area is "+areaCirc);

    }
}