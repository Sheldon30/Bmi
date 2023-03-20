public class BmiService {
    public double calculate(int kg, double m) {
        double index = kg/(m*m);
        return (int) index;
    }

}
