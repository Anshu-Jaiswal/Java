package CDAC_Arraylist.dao;

import CDAC_Arraylist.beans.ContractEmp;
import CDAC_Arraylist.beans.Employee;
import CDAC_Arraylist.beans.SalariedEmp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    static List<Employee> al;

    static {
        al = new ArrayList<>();
        al.add(new SalariedEmp(1, "Anshu", "4444", "anshu@gmail.com", "Developer", "TL", LocalDate.of(2002, 12, 30), 70000, 6000));
        al.add(new SalariedEmp(2, "Anjal", "2222", "anjali@gmail.com", "hr", "associate", LocalDate.of(2000, 5, 4), 40000, 2000));
        al.add(new ContractEmp(3, "Raja", "666", "raja@gmail.com", "sports", "batting", LocalDate.of(2002, 1, 30), 30, 2000));
        al.add(new ContractEmp(4, "beboo", "888", "beboo@gmail.com", "admin", "manager", LocalDate.of(2002, 12, 60), 30, 4000));
    }

    @Override
    public void save(Employee e) {
        al.add(e);
    }

    @Override
    public List<Employee> getAll() {
        return al;
    }

    @Override
    public Employee getById(int id) {
        int pos = al.indexOf(new SalariedEmp(id));
        if (pos != -1)
            return al.get(pos);
        return null;
    }

    @Override
    public boolean removeById(int id) {
        return al.remove(new SalariedEmp(id));
    }

    @Override
    public boolean updateSalById(int id, double sal) {
        Employee e = getById(id);
        if (e != null) {
            if (e instanceof SalariedEmp)
                ((SalariedEmp) e).setSal(sal);
            if (e instanceof ContractEmp)
                ((ContractEmp) e).setCharges(sal);
            return true;
        }
        return false;

    }

    @Override
    public List<Employee> sortByName() {
        //Collections.copy( elst,elist);
        List<Employee> arl = new ArrayList<>();
        for (Employee e : al) {
            arl.add(e);
        }


        //Collections.sort(elst,null);
        arl.sort(null);
        return arl;
    }
}
