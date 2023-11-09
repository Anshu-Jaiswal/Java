package CDAC_Arraylist.test;

import CDAC_Arraylist.beans.Employee;
import CDAC_Arraylist.service.EmployeeService;
import CDAC_Arraylist.service.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        EmployeeService s = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Enter 1. Add new Employee\\n2. Delete employee by id\\n 3. Modify salary\\n  4. Display all\\n5. Display by id\\n 6. Sort by salary\\n7. Sort by name\\n8.Exit\\n Choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" enter 1.for salaried\n 2. for contract\n ");
                    int ch = sc.nextInt();
                    s.addNewEmployee(ch);
                    break;
                case 2:
                    System.out.println("enter id to delete");
                    int id = sc.nextInt();
                    boolean status = s.deleteById(id);
                    if (status) System.out.println("Deleted successfully");
                    else System.out.println("Not Found ");
                    break;
                case 3:
                    System.out.println("Enter ID to update salary");
                    id = sc.nextInt();
                    System.out.println("Enter salary");
                    double sal = sc.nextDouble();
                    status = s.modifySalById(id, sal);
                    if (status) {
                        System.out.println("Modified successfully");
                    } else {
                        System.out.println(" ID Not found");
                    }
                    break;
                case 4:
                    List<Employee> ls = s.displayAllEmp();
                    if (ls != null)
                        ls.stream().forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Enter ID for search");
                    id = sc.nextInt();
                    Employee e = s.displayByID(id);
                    if (e != null)
                        System.out.println(e);
                    else
                        System.out.println("Not found");
                    break;
                case 6:
                    System.out.println("Not implemented sort by salary");
                    break;
                case 7:
                    ls = s.sortByName();
                    ls.stream().forEach(System.out::println);
                    break;
                case 8:
                    sc.close();
                    System.out.println("Thank you for visiting....");
                    break;
                default:
                    System.out.println("Wrong choice!");

            }

        } while (choice != 8);
    }
}
