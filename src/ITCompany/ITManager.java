package ITCompany;

public class ITManager extends Workers implements IManager {
    private int salary;

    public ITManager(int id, String Name, String Surname, String Address, String level, String department) {

        super.setId(id);
        super.setName(Name);
        super.setSurname(Surname);
        super.setAddress(Address);
        super.setLevel(level);
        super.setDepartment(department);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int gettingSalary() {
        return salary;
    }

    public String manage() {
        return super.getName() + "manage the department" + super.getDepartment();
    }


    public String work() {
        return super.getName() + "works in IT company as manager";
    }

    public String getSalary() {
        return super.getName() + "He get salary" + "=" + gettingSalary();}



    @Override
    public void setDoingDuration(int day) {
        SoftwareEng.deadline=day;
        webdev.deadline=day;
    }


    @Override
    public void setPenalty(int penalty) {
        SoftwareEng.Penalty=penalty;
        webdev.Penalty=penalty;
    }

    @Override
    public void setBonus(int bonus) {
        SoftwareEng.Bonus=bonus;
        webdev.Bonus=bonus;
    }
}