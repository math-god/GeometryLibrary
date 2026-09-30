public abstract class ThreeDimensional {

    public abstract double volume();

    public abstract double surfaceArea();

    public static class Cube extends ThreeDimensional {

        private double side;

        public Cube(double side) {
            this.side = side;
        }

        @Override
        public double volume() {
            if (side < 0) {
                throw new IllegalArgumentException("Side must be non-negative");
            }
            return side * side * side;
        }

        @Override
        public double surfaceArea() {
            return Math.pow(side, 6);
        }

    }

    public static class Sphere extends ThreeDimensional {

        private double radius;

        public Sphere(double radius) {
            this.radius = radius;
        }

        @Override
        public double volume() {
            if (radius < 0) {
                throw new IllegalArgumentException("Radius must be non-negative");
            }
            return (4.0 / 3.0) * Math.PI * radius * radius * radius;
        }

        @Override
        public double surfaceArea() {
            if (radius < 0) {
                throw new IllegalArgumentException("Radius must be non-negative");
            }
            return 4 * Math.PI * radius * radius;
        }
    }

}
