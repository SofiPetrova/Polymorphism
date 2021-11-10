package geometry;

public class Parallelogram extends Rectangle {

    protected double h;

    public Parallelogram(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return a*h;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }
}
