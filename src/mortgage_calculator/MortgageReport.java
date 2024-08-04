package mortgage_calculator;

import java.text.NumberFormat;

public class MortgageReport {
    private final MortgageCalculator calculator;
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgageSummary() {
        double mortgageAmount = this.calculator.calculateMortgage();
        System.out.println("MORTGAGE");
        System.out.println("----------");
        System.out.println("Monthly Payments: " + MortgageReport.currency.format(mortgageAmount));
        System.out.println();
    }

    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------------------");
        for (double balance: calculator.getRemainingBalances())
            System.out.println( MortgageReport.currency.format(balance) );
    }
}
