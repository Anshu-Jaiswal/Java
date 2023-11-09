package CDAC_Arraylist.service;

import CDAC_Arraylist.beans.ContractEmp;
import CDAC_Arraylist.beans.Employee;
import CDAC_Arraylist.beans.SalariedEmp;
import CDAC_Arraylist.dao.EmployeeDao;
import CDAC_Arraylist.dao.EmployeeDaoImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao dao;

    public EmployeeServiceImpl() {
        dao = new EmployeeDaoImpl();
    }

    @Override
    public void addNewEmployee(int ch) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pid");
        int pid = sc.nextInt();
        System.out.println("enter name");
        String nm = sc.next();
        System.out.println("enter mobile");
        String mob = sc.next();
        System.out.println("enter email");
        String em = sc.next();
        System.out.println("enter dept");
        String dept = sc.next();
        System.out.println("enter desg");
        String desg = sc.next();
        System.out.println("enter date of joining(dd/MM/yyyy)");
        String dt = sc.next();
        LocalDate ld = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/YYYY"));// string to date conversion
        Employee e = null;
        if (ch == 1) {
            System.out.println("Enter salary");
            double s = sc.nextDouble();
            System.out.println("Enter bonus");
            double b = sc.nextDouble();
            e = new SalariedEmp(pid, nm, mob, em, dept, desg, ld, s, b);

        } else if (ch == 2) {
            System.out.println("enter Hrs");
            int hrs = sc.nextInt();
            System.out.println("enter charges per hour");
            double charges = sc.nextDouble();
            e = new ContractEmp(pid, nm, mob, em, dept, desg, ld, hrs, charges);
        }
        dao.save(e);

    }

    @Override
    public List<Employee> displayAllEmp() {

        return null;
    }

    @Override
    public Employee displayByID(int id) {
        return dao.getById(id);
    }

    @Override
    public boolean deleteById(int id) {

        return dao.removeById(id);
    }

    @Override
    public boolean modifySalById(int id, double salary) {
        return dao.updateSalById(id, salary);
    }

    @Override
    public List<Employee> sortByName() {

        return dao.sortByName();
    }
}
