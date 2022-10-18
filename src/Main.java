import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        double salary;
        int workHours,hireYear;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınızı giriniz:");
        name= scanner.next();
        System.out.println("Maaşınızı giriniz(Vergi ve bonuslar hariç) :");
        salary= scanner.nextDouble();
        System.out.println("Haftalık çalışma saatinizi giriniz :");
        workHours= scanner.nextInt();
        System.out.println("Giriş yılınızı giriniz :");
        hireYear= scanner.nextInt();
        Employee employee=new Employee(name,salary,workHours,hireYear);
    employee.tax(salary);
    employee.bonus(workHours);
    employee.raiseSalary(hireYear,salary);
    System.out.println(employee.toString());

    }
}