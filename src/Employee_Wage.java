public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("welcome to Employee wage computation program");
        final int Wage_per_hour = 20;
        final int fullday_hours = 8;
        int pay = 0;
        double employee = Math.floor(Math.random() * 10) % 2;
        if (employee == 1) {
            System.out.println(" Employee is present ");
            pay = Wage_per_hour * fullday_hours;
            System.out.println("Employee wage per day is : " + pay);
        } else {
            System.out.println(" Employee is absent ");
        }
    }
}
