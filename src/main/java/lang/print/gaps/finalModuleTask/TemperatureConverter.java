package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {
        toFahrenheit(1);
    }
    public static void toFahrenheit(int temperatureCelsius){
        double res = (temperatureCelsius*9/5.0)+32;
        System.out.println(res);
    }
}
