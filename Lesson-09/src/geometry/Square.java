package geometry;

public abstract class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
