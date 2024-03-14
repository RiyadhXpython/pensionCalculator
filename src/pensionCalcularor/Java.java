package pensionCalcularor;

public class Java {
    public static void main(String[] args) {
        // X = A random number
        //between 18-24 and Y= A random number between 11-99
        double doubleHoursWorked = 18.11;

        // Stacey's Hourly rate calculation
        int daysWorkedInAMonth = 22;
        int hourlyWorkedInADay = 8;
        // calculate stacey's hourly rate
        System.out.println("Income per day : $" + doubleHoursWorked * hourlyWorkedInADay);
        float incomePerDay = 144.88F; // per day $144.88

        // stacey's monthly salary calculation
        System.out.println("Monthly Salary : $" + incomePerDay * daysWorkedInAMonth);
        float monthlySalary = 3187.36F;

        // Pension Deducted Amount From Each Month's Salary
        System.out.println("Stacey's Pension Contribution : $" + monthlySalary * 7/100);
        double staceysContribution = 223.11;

        // Pension Deducted Amount from Stacey's Employer in each month
        System.out.println("Stacey's Employer Contribution : $" + monthlySalary * 10.5/100);
        double employersContribution = 334.67;

        // Stacey's Total Yearly Pension Calculations
        System.out.println("Stacey's Total Yearly Pension : $" +
                (staceysContribution + employersContribution) * 12);

        // Stacey's Pension amount

        double pensionAmount = 6693.36;





    }
}
