public class Employee {
    private String name;
    private String ID;
    private String department;
    private String exLvl;
    private String gender;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExLvl() {
        return exLvl;
    }

    public void setExLvl(String exLvl) {
        this.exLvl = exLvl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;

    }
    public void display() {
        System.out.println("Name:"+getName());
        System.out.println("Department:"+getDepartment());
        System.out.println("Salary:"+getSalary());
        System.out.println("Experience:"+getExLvl());
        System.out.println("Gender:"+getGender());
    }



}
