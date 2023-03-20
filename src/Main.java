public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(68, 1.87);
        System.out.println(index);
    }
}