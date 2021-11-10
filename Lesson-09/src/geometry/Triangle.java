package geometry;

public class Triangle extends Geometry {

    protected double a;
    protected double b;
    protected double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        double h = (2 / a) * (Math.sqrt(s));
        return 0.5 * a * h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
