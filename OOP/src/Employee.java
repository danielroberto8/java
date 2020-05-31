package OOP.src;

public class Employee {
    private int salary;
    private int overtime;
    private int payPerHour;
    public static int employeeCount;

    public void setSalary(int salary){
        if(salary<=0){
            throw new IllegalArgumentException("Invalid input");
        }
        this.salary = salary;
    }

    public Employee(int salary, int payPerHour){
        setSalary(salary);
        setPayPerHour(payPerHour);
        employeeCount++;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setOvertime(int overtime){
        if(overtime<0){
            throw new IllegalArgumentException("Invalid input");
        }
        this.overtime = overtime;
    }

    public int getOvertime(){
        return this.overtime;
    }

    public void setPayPerHour(int payPerHour){
        if(payPerHour<=0){
            throw new IllegalArgumentException("Invalid input");
        }
        this.payPerHour = payPerHour;
    }

    public int getPayPerHour(){
        return this.payPerHour;
    }

    
    public static int calculateWage(int salary, int overtime, int payPerHour){
        return salary + (overtime * payPerHour);
    }
}