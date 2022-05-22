package testPackage;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //first constructor
        Table myTable = new Table(75, 75, 140, "white");

        //second constructor
        Table myBrotherTable = new Table();

        //create Array for class Table objects
        var storehouse = new HashMap<String, Table>();
        storehouse.put("My table", myTable);
        storehouse.put("My brother table", myBrotherTable);

        //Some Code
        storehouse.get("My table").sizeDescription();
        storehouse.get("My brother table").sizeDescription();



        /*try {
            storehouse.get("my table").squareCount();
        } catch (NullPointerException exception) {
            System.out.println("There is no table with this name");
        }*/
    }
}
