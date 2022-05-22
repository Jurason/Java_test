package testPackage;

import java.util.Scanner;

public class Table {
    private int height;
    private int width;
    private int length;
    private int thickness;
    String color;
    private int maxHeight = 90;
    private int maxWidth = 100;
    private int maxLength = 200;
    private int maxThickness = 20;

    //Types of constructors
    Table(){
        setHeight();
        setLength();
        setWidth();
        setThickness();
        setColor();
    }
    Table(int height, int width, int length, String color) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    // Set methods

    void setThickness() {
        while (true){

            System.out.println("Please, set a desirable thickness for your table in sm");
            Scanner sc = new Scanner(System.in);
            int newThickness = sc.nextInt();

            if (newThickness < maxThickness) {
                this.thickness = newThickness;
                System.out.println("You've set thickness of the table " + newThickness + " sm");
                break;
            } else {
                System.out.println("Thickness is too big. Should be less then " + maxThickness + " sm");
            }
        }
    }

    void setLength() {
        while(true) {
            System.out.println("Please, set a desirable length for your table in sm");
            Scanner sc = new Scanner(System.in);
            int newLength = sc.nextInt();
            if (newLength < maxLength) {
                this.length = newLength;
                System.out.println("You've set length of the table " + newLength + " sm");
                break;
            } else {
                System.out.println("Length is too big. Should be less then " + maxLength + " sm");
            }
        }
    }

    void setWidth() {
        while(true) {
            System.out.println("Please, set a desirable width for your table in sm");
            Scanner sc = new Scanner(System.in);
            int newWidth = sc.nextInt();

            if (newWidth < maxWidth) {
                this.width = newWidth;
                System.out.println("You've set width of the table " + newWidth + " sm");
                break;
            } else {
                System.out.println("Width is too big. Should be less then " + maxWidth + " sm");
            }
        }
    }

    void setHeight() {
        while(true) {
            System.out.println("Please, set a desirable height for your table in sm");
            Scanner sc = new Scanner(System.in);
            int newHeight = sc.nextInt();

            if (newHeight < maxHeight) {
                this.height = newHeight;
                System.out.println("You've set height of the table " + newHeight + " sm");
                break;
            } else {
                System.out.println("Height is too big. Should be less then " + maxHeight + " sm");
            }
        }
    }

    void setColor() {           //This method needs more attention
        System.out.println("Please, set a desirable color for your table");
        Scanner sc = new Scanner(System.in);
        String newColor = sc.nextLine();
        if (newColor.equals("")){
            System.out.println("You didn't chose particular color of the table. It will be white color");
            this.color = "white";
        }
        else {
            this.color = newColor;
        }
    }


    //Describe methods

    void sizeDescription() {
        System.out.println("Dimensions of " + color + " table");
        System.out.println("Table height = " + height + " sm");
        System.out.println("Table width = " + width + " sm");
        System.out.println("Table length = " + length + " sm");
        System.out.println("Table thickness = " + thickness + " sm");
    }


    //Delegation method from class Chair, just for code practice

    Chair chairDelegation = new Chair();


    public void sittingDownTable(String name){

        chairDelegation.sitingDown(name);
    }


    //Unused methods

    void weight() {
        int weight = width * length * thickness;
        System.out.println("Table weight = " + weight + "kg");
    }

    void squareCount() {
        int square = width * length;
        System.out.println("Square of the table =" + square + "m2");
    }
}