public class BmiService {
    public int calculate(double weight, double height) {
        double x = height * height;
        double y = weight / x;
        return (int) y;
    }
}