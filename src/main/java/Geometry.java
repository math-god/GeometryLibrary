public abstract class Geometry {

    abstract public double perimeter();

    abstract public double area();

    public static class Rectangle extends Geometry {

        private final double a;
        private final double b;

        public Rectangle(double a, double b) {
            if (!(a > 0 && b > 0)) throw new IllegalArgumentException("Only positive numbers are allowed");

            this.a = a;
            this.b = b;
        }

        public static Rectangle create(double a, double b) {
            return new Rectangle(a, b);
        }

        @Override
        public double perimeter() {
            return a * 2 + b * 2;
        }

        @Override
        public double area() {
            return b * a;
        }
    }

    public static class Circle extends Geometry {

        private final double radius;

        public Circle(double radius) {
            if (!(radius > 0)) throw new IllegalArgumentException("Only positive numbers are allowed");

            this.radius = radius;
        }

        public static Circle create(double radius) {
            return new Circle(radius);
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public static class Triangle extends Geometry {

        private final double a;
        private final double b;
        private final double c;

        public Triangle(double a, double b, double c) {
            if (!(a > 0 && b > 0 && c > 0)) throw new IllegalArgumentException("Only positive numbers are allowed");
            if (!(a + b > c && a + c > b && b + c > a)) throw new IllegalArgumentException("Not a triangle");

            this.a = a;
            this.b = b;
            this.c = c;
        }

        public static Triangle create(double a, double b, double c) {
            return new Triangle(a, b, c);
        }

        @Override
        public double perimeter() {
            return a + b + c;
        }

        @Override
        public double area() {
            var p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

}
