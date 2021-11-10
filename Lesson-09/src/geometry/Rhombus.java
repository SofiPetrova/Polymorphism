package geometry;

public abstract class Rhombus extends Rectangle {

    public Rhombus(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return (a * b) / 2;
    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow(a / 2, 2) + Math.pow(b / 2, 2));
        return side * 4;
    }
}

