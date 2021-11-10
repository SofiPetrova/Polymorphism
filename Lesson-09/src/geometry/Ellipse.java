package geometry;

public class Ellipse extends Geometry {
    protected double a; //semi-major axis
    protected double b; //semi-minor axis

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        double per = (Math.PI * a * b + Math.pow((a - b), 2)) / (a + b);
        return 4 * per;
    }
}