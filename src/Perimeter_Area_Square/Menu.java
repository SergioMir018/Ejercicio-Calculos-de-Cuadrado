package Perimeter_Area_Square;

import javax.swing.*;

public class Menu {
    static int  input;

    public void getMenu() {
        input = Integer.parseInt(JOptionPane.showInputDialog("MENU\nCHOOSE AN OPTION:\n1-Calculate perimeter\n2-Calculate area\n3-Exit"));
    }


}
