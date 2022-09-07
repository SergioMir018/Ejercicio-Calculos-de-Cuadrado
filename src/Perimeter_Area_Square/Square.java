package Perimeter_Area_Square;

public class Square {
    private float side1;
    private float side2;

    public Square(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public float getPerimeter(){
        float perimeter = 2 * (side1 + side2);
        return  perimeter;
    }

    public float getArea() {
        float area = (side1 * side2);
        return area;
    }
}
