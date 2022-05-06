public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 60;
        double growth = 174;
        double index1 = service.calculate(weight, growth);
        System.out.println(index1);

        weight = 80;
        growth = 120;
        double index2 = service.calculate(weight, growth);
        System.out.println(index2);

        weight = 100;
        growth = 165;
        double index3 = service.calculate(weight, growth);
        System.out.println(index3);

    }
}
