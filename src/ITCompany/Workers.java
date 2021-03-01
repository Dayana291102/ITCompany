package ITCompany;

public class Workers {
    private int Id;
    private String Name;
    private String Surname;
    private String Address;
    private String level;
    private String department;

    public Workers(){

    }

    public Workers(int id, String name, String surname, String address, String level, String department) {
        Id = id;
        Name = name;
        Surname = surname;
        Address = address;
        this.level = level;
        this.department = department;
    }

    public Workers(String name, String surname, String address, String level, String department) {
        Name = name;
        Surname = surname;
        Address = address;
        this.level = level;
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDepartment() {
        return department;
    }

    public String getLevel() {
        return level;
    }

    public String getAddress() {
        return Address;
    }

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }
    public void WorkerInf(){
        System.out.println("Worker"+ getName()+" "+getSurname() +"with Id"+getId());
        System.out.println("Address"+getAddress());
        System.out.println("Level"+getLevel());
        System.out.println("Department"+getDepartment());
    }
}
