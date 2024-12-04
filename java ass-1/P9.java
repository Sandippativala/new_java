abstract class Shape {
    protected int dimension1, dimension2;

    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    public double area() {
        return dimension1 * dimension2;
    }

    public double perimeter() {
        return 2 * (dimension1 + dimension2);
    }
}

class Triangle extends Shape {
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        super(side1, side2);
        this.side3 = side3;
    }

    public double area() {
        double s = (dimension1 + dimension2 + side3) / 2.0;
        return Math.sqrt(s * (s - dimension1) * (s - dimension2) * (s - side3));
    }

    public double perimeter() {
        return dimension1 + dimension2 + side3;
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }

    public double area() {
        return Math.PI * dimension1 * dimension1;
    }

    public double perimeter() {
        return 2 * Math.PI * dimension1;
    }
}

public class P9 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        Shape circle = new Circle(7);
        System.out.println("\nCircle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
    }
}
