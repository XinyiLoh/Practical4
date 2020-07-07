
public class EmployeeTest {
    public static void main(String []args){
        
        //Class Employee's object
        Employee emp1 = new Employee("Ali", 5000);
        Employee emp2 = new Employee("Ali");
        emp2.setSalary(3500);
        
        if(emp1.getSalary() > emp2.getSalary()){
            System.out.println(emp1.getName());
        }else{
            System.out.println(emp2.getName());
        }
        
        System.out.println("(Sum of Salary is " + (emp1.getSalary() + emp2.getSalary()));
        
        // (a)
//        System.out.println("(Before) Salary" + emp1.getSalary());
//        emp1.raiseSalary(8.0);
//        System.out.println("(After) Salary" + emp1.getSalary());
    }
}
