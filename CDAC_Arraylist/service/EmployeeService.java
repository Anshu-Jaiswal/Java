package CDAC_Arraylist.service;

import CDAC_Arraylist.beans.Employee;

import java.util.List;

public interface EmployeeService {
    void addNewEmployee(int ch);

    List<Employee> displayAllEmp();

    Employee displayByID(int id);

    boolean deleteById(int id);

    boolean modifySalById(int id, double salary);

    List<Employee> sortByName();

}
