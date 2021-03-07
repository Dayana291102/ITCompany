package EndTerm;

public class pediatrican extends Doctors implements IPediatr {//class pediatrican extends variables from doctors class
    private int salary;

    public pediatrican(int id, String Name, String Surname, String Address, String level, String department) {

        super.setId(id);
        super.setName(Name);
        super.setSurname(Surname);
        super.setAddress(Address);
        super.setLevel(level);
        super.setDepartment(department);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }//getters and setters

    public int gettingSalary() {
        return salary;
    }

    public String manage() {
        return super.getName() + "manage the department" + super.getDepartment();
    }


    public String work() {
        return super.getName() + "works in hospital as pediatr";
    }

    public String getSalary() {
        return super.getName() + "He get salary" + "=" + gettingSalary();}



    @Override
    public void setDoingDuration(int day) {//methods
        dentist.deadline=day;
        therapist.deadline=day;
    }


    @Override
    public void setPenalty(int penalty) {
        dentist.Penalty=penalty;
        therapist.Penalty=penalty;
    }

    @Override
    public void setBonus(int bonus) {
        dentist.Bonus=bonus;
        therapist.Bonus=bonus;
    }
}