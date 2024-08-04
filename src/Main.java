import java.text.NumberFormat;

public class Main {
    public static void main(String [] args) {
        var employee = new Employee(50_000, 20);
        String wage = NumberFormat.getCurrencyInstance().format(employee.calculateWage(20));
        System.out.println(wage);
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
