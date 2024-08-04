public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        this.setBaseSalary(baseSalary);
        this.setHourlyRate(hourlyRate);
    }

    private void setBaseSalary(int baseSalary) {
        if (!(baseSalary>0)) {
            throw new IllegalArgumentException("Salary must be a value greater than 0");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return  this.baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (!(hourlyRate>0)) {
            throw new IllegalArgumentException("Salary must be a value greater than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return  this.hourlyRate;
    }


    public int calculateWage(int extraHours) {
        return this.getBaseSalary() + (this.getHourlyRate() * extraHours);
    }

}
