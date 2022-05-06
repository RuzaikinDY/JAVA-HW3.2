public class BmiService {
    public double calculate(int weight, double growth) {

        double mgrowth = growth / 100;
        double quadrogrowth = mgrowth * mgrowth;
        double ITM = weight / quadrogrowth;


        return ITM;
    }

}
