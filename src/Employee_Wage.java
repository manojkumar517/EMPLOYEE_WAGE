public class Employee_Wage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if (employeeCheck == IS_FULL_TIME)
            System.out.println(" Employee is present ");
        else
            System.out.println(" Employee is absent ");
        }
    }
