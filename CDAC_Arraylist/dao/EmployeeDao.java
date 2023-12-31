package CDAC_Arraylist.dao;

import CDAC_Arraylist.beans.Employee;

import java.util.List;

public interface EmployeeDao {

    void save(Employee e);

    List<Employee> getAll();

    Employee getById(int id);

    boolean removeById(int id);

    boolean updateSalById(int id, double sal);

    List<Employee> sortByName();

}
