public class FinancialForecast {

    public static double forecast(double currentValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return currentValue;
        }
        // Recursive call
        return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
    }
    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 3;
        double futureValue = forecast(currentValue, growthRate, years);
        System.out.printf("Future Value = ₹", futureValue);
    }
}