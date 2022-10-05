public class Employee {
    public String name;
    public double salary;
    public int workHours, hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
    this.name=name;
    this.salary=salary;
    this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(double salary) {
        double tax=0;
        if (salary < 1000) {
            tax = 0;
        } else {
            tax = salary * 0.03;
        }return tax;
    }
    public double bonus(int workHours){
        double bonus = 0;
        if(workHours>40){
            bonus=workHours*30;
        }return bonus;
    }
    public double raiseSalary(int hireYear,double salary,int workHours){
        double raisesalary=tax(salary)+salary+bonus(workHours);

        if(2021-hireYear<10){
            raisesalary=(raisesalary*0.05);
        }else if(2021-hireYear>9 && 2021-hireYear<20){
            raisesalary=(raisesalary*0.1);
        }else if(2021-hireYear>19){raisesalary=(raisesalary*0.15);}
        return raisesalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax=" + tax(salary) +
                ", bonus=" + bonus(workHours) +
                ", raisesalary=" + raiseSalary(hireYear,salary,workHours) +
                ", Maas artı vergi artı bonus=" + (tax(salary)+bonus(workHours)+salary)+
                ", tüm maas=" + (tax(salary)+bonus(workHours)+salary+raiseSalary(hireYear,salary,workHours))+
                '}';
    }
}

