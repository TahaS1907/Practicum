public class Main {
    public static void main(String[] args) {
Employee employee=new Employee("Taha",2000,50,2010);
employee.tax(2000);
employee.bonus(50);
employee.raiseSalary(2010,2000,50);
System.out.println(employee.toString());

    }
}