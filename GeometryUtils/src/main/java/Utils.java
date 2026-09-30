

public class Utils {

    public static boolean comparePerimeter(Geometry geom1, Geometry geom2) {
        return Double.compare(geom1.perimeter(), geom2.perimeter()) == 0;
    }
}
