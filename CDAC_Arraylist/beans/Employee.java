package CDAC_Arraylist.beans;

import java.time.LocalDate;

public class Employee extends Person {
    private String desg;
    private String dept;
    private LocalDate doj;

    public Employee() {
    }

    public Employee(int id) {
        super(id);
    }

    public Employee(int pid, String pname, String mobile, String email, String desg, String dept, LocalDate doj) {
        super(pid, pname, mobile, email);
        this.desg = desg;
        this.dept = dept;
        this.doj = doj;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    // function to calculate salary
    public double calculateSal() {
        System.out.println("in calculate sal emp");
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "desg='" + desg + '\'' +
                ", dept='" + dept + '\'' +
                ", doj=" + doj +
                "} ";
    }
}
