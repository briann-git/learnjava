package mortgage_calculator;

public class Main {
    private static final float MAX_PRINCIPAL = 1_000_000;
    private static final float MIN_PRINCIPAL = 1_000;

    private static final double MAX_ANNUAL_INTEREST_RATE = 30;
    private static final double MIN_ANNUAL_INTEREST_RATE = 0;

    private static final byte MAX_PERIOD_YEARS = 30;
    private static final byte MIN_PERIOD_YEARS = 0;

    public static void main(String[] args) {
        float principal = Console.readFloat("Principal: ", MIN_PRINCIPAL, MAX_PRINCIPAL );

        float annualInterestRate = Console.readFloat(
                "Annual Interest Rate: ", MIN_ANNUAL_INTEREST_RATE, MAX_ANNUAL_INTEREST_RATE
        );

        byte periodInYears = Console.readByte(
                "Period (Years): ", MIN_PERIOD_YEARS, MAX_PERIOD_YEARS
        );

        var mortgage = new MortgageCalculator(principal, annualInterestRate, periodInYears);

        var report = new MortgageReport(mortgage);
        report.printMortgageSummary();
        report.printPaymentSchedule();
    }

}

//public class MortgageCalculator {
//    final static byte  PERCENT = 100;
//    final static byte MONTHS_IN_YEAR = 12;
//
//    public static void main(String[] args) {
//        float principal = (float) readNumber(
//                "Principal: ",
//                1_000,
//                1_000_000
//        );
//
//
//        float annualInterestRate = (float) readNumber(
//                "Annual Interest Rate: ",
//                0,
//                30
//        );
//
//        byte periodInYears = (byte) readNumber(
//                "Period (Years): ",
//                0,
//                30
//        );
//
//
////        Print out the result
//        printMortgageSummary(principal, annualInterestRate, periodInYears);
//        printPaymentSchedule(periodInYears, principal, annualInterestRate);
//    }
//
//    private static void printMortgageSummary(float principal, float annualInterestRate, byte periodInYears) {
//        double mortgageAmount = calculateMortgage(principal, annualInterestRate, periodInYears);
//        System.out.println( "MORTGAGE");
//        System.out.println("----------");
//        System.out.println("Monthly Payments: "+ NumberFormat.getCurrencyInstance().format(mortgageAmount));
//        System.out.println();
//    }
//
//    private static void printPaymentSchedule(byte periodInYears, float principal, float annualInterestRate) {
//        System.out.println("PAYMENT SCHEDULE");
//        System.out.println("------------------");
//        int periodInMonths = (int) (periodInYears *MONTHS_IN_YEAR) + 1;
//        for (int i=1; i<= periodInMonths; i++)
//            System.out.println( calculateBalance(principal, annualInterestRate, periodInMonths, i ) );
//    }
//
//
//    public static double readNumber(String prompt, double min, double max) {
//        Scanner scanner = new Scanner(System.in);
//        double value;
//
//        while (true) {
//            System.out.print(prompt);
//            value = scanner.nextDouble();
//            if ((value >= min) && (value <= max))
//                break;
//            System.out.println("Enter a value between " + min + " and " +max);
//        }
//
//        return value;
//    }
//
//
//    public static String calculateBalance(float principal, float annualInterestRate, int periodInMonths, int balanceQueryMonth) {
//        float monthlyRate = (annualInterestRate/PERCENT) / MONTHS_IN_YEAR;
//        double balanceAfterPMonths =(
//                principal *
//                (Math.pow((1+monthlyRate), periodInMonths) - Math.pow((1+monthlyRate), balanceQueryMonth))/
//                (Math.pow((1+monthlyRate), periodInMonths) -1)
//        );
//
//        return NumberFormat.getCurrencyInstance().format(balanceAfterPMonths);
//    }
//
//
//    public static double calculateMortgage(float principal, float annualInterestRate, byte periodInYears) {
////        Mortgage Calculation
//        float monthly_rate = (annualInterestRate/PERCENT) / MONTHS_IN_YEAR;
//        short periodInMonths = (short)(periodInYears * MONTHS_IN_YEAR);
//
//        return (
//                principal * (
//                        ( monthly_rate * Math.pow( (1 + monthly_rate ), periodInMonths) ) /
//                        ( Math.pow ( (1 + monthly_rate), periodInMonths) - 1)
//                )
//        );
//    }
//}