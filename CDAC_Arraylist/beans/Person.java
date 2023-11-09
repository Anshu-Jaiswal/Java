package CDAC_Arraylist.beans;

public class Person implements Comparable<Person> {
    private int pid;
    private String pname;
    private String mobile;
    private String email;


    public Person() {
    }

    public Person(int pid) {
        this.pid = pid;
    }

    public Person(int pid, String pname, String mobile, String email) {
        this.pid = pid;
        this.pname = pname;
        this.mobile = mobile;
        this.email = email;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public boolean equals(Person person) {
        return this.pid == ((Person) person).pid;
        // Type casted bz while deleting person by id using remove(person)its type is unknown so always cast in parent type for all emp type
    }

    // implemented comparator to sort data on the basis of person name by overriding compareTo()
    @Override
    public int compareTo(Person person) {
        System.out.println("In Person compareTo Method " + this.pname + "----" + person.pname);
        return this.pname.compareTo(person.pname);
    }
}
