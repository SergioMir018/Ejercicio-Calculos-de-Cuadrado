package Perimeter_Area_Square;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        float input_side1;
        float input_side2;
        String measure_unit;

        measure_unit = JOptionPane.showInputDialog("Write the measure unit that will be used");

        input_side1 = Float.parseFloat(JOptionPane.showInputDialog("Write the size of the base"));
        input_side2 = Float.parseFloat(JOptionPane.showInputDialog("Write the size of the height"));

        Square side = new Square(input_side1, input_side2);

        Menu menu = new Menu();

        while (Menu.input != 3){
            menu.getMenu();
            switch (Menu.input) {
                case 1 -> JOptionPane.showMessageDialog(null, "The perimeter of the square is: " + side.getPerimeter() + measure_unit);
                case 2 -> JOptionPane.showMessageDialog(null, "The area of the square is: " + side.getArea() + measure_unit + "²");
                case 3 -> {
                    break;
                }
                default -> JOptionPane.showMessageDialog(null, "ERROR!\nWrite a valid option");
            }
        }

    }


}
