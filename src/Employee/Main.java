package Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {

       // List<String> employee = new LinkedList<>();

        //list + set = add
        //map = put
        //LinkedList duplicate data allowed
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Gozde", "Apak"));
        employees.add(new Employee(1,"Gozde", "Apak"));
        employees.add(new Employee(2,"Özge", "Ak"));
        employees.add(new Employee(2,"Özge", "Ak"));
        employees.add(new Employee(3,"Ege", "Yurt"));
        employees.add(new Employee(3,"Ege", "Yurt"));
        System.out.println(employees);
        System.out.println("***********");


        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removeEmployee = new ArrayList<>();

        Iterator iterator  = employees.iterator();
        while (iterator.hasNext()){
            //Cast process
            Employee employee = (Employee) iterator.next();
            if (employeeMap.containsKey(employee.getId())){
                removeEmployee.add(employee);
            }else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println("employeeMap:" + employeeMap);
        System.out.println("removeEmployee" + removeEmployee);
        System.out.println("***********");



        for (Employee employee: removeEmployee ){
            employees.remove(employee);
        }
        System.out.println(employees);
        System.out.println(employeeMap);
        /*
         Iterator <Employee> = employees.iterator();
        while (iterator.hasNext()){
            //Cast process
            Employee employee = iterator.next();
            if (employeeMap.containsKey(employee.getId())){
                removeEmployee.add(employee);
            }else {
                employeeMap.put(employee.getId(), employee);
            }
        }
         */


    }
}
