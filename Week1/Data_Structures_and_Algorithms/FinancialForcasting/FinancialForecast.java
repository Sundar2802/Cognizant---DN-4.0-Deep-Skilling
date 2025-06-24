package Data_Structures_and_Algorithms.FinancialForcasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue; // Base case
        }
        return forecastValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initial = 10000.0;
        double rate = 0.07; // 7% annual growth
        int years = 5;

        double futureValue = forecastValue(initial, rate, years);
        System.out.printf("Predicted Future Value after %d years: %.2f%n", years, futureValue);
    }
}
