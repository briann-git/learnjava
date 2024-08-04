package mortgage_calculator;

public class MortgageCalculator {
    private static final short PERCENT = 100;
    private static final byte MONTHS_IN_YEAR = 12;

    private float principal;
    private float annualInterestRate;
    private byte periodInYears;


    private void setPrincipal(float principal) {
        this.principal = principal;
    }

    private void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    private void setPeriodInYears(byte periodInYears) {
        this.periodInYears = periodInYears;
    }

    public MortgageCalculator(float principal, float annualInterestRate, byte periodInYears) {
        this.setPrincipal(principal);
        this.setAnnualInterestRate(annualInterestRate);
        this.setPeriodInYears(periodInYears);
    }

    public double calculateMortgage() {
        float monthly_rate = getMonthlyRate();
        short periodInMonths = (short)(periodInYears * MONTHS_IN_YEAR);

        return (
                principal * (
                        ( monthly_rate * Math.pow( (1 + monthly_rate ), periodInMonths) ) /
                                ( Math.pow ( (1 + monthly_rate), periodInMonths) - 1)
                )
        );
    }

    private double calculateBalance(int balanceQueryMonth) {
        float monthlyRate = getMonthlyRate();
        short periodInMonths = getPeriodInMonths();

        return (
                this.principal *
                        (Math.pow((1+monthlyRate), periodInMonths) - Math.pow((1+monthlyRate), balanceQueryMonth))/
                        (Math.pow((1+monthlyRate), periodInMonths) -1)
        );
    }

    private short getPeriodInMonths() {
        return (short)(this.periodInYears * MONTHS_IN_YEAR);
    }

    private float getMonthlyRate() {
        return (this.annualInterestRate/PERCENT) / MONTHS_IN_YEAR;
    }

    public double [] getRemainingBalances() {
        int months = getPeriodInMonths();
        double [] balanceArray = new double[months -1];
        for (int i=1; i<months; i++)
            balanceArray[i-1] = this.calculateBalance(i);
        return balanceArray;
    }

}
