package ITCompany;

public class dentist extends Doctors implements IDentist {

    public static int deadline;
    public static int Penalty;
    public static int Bonus;
    private int doTime;
    private int Salary;
    public dentist(int id, String Name, String Surname, String Address, String level, String department) {

        super.setId(id);
        super.setName(Name);
        super.setSurname(Surname);
        super.setAddress(Address);
        super.setLevel(level);
        super.setDepartment(department);
    }

    public dentist(String name, String surname, String address, String level, String department) {
        
    }


    public dentist(String name, String surname, String address, String level, String department, int deadline, int penalty, int bonus, int doTime, int salary) {
    }

    public dentist() {

    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

    public void setPenalty(int penalty) {
        Penalty = penalty;
    }

    public int getDoTime() {
        return doTime;
    }

    public void setDoTime(int doTime) {
        this.doTime = doTime;
    }

    public int gettingSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String programs() {
        return super.getName() + " programs in "+ super.getDepartment()+" department";

    }
    public String work() {
        return super.getName() + " works in hospital as dentist.";
    }


    public String write(){return "he work";}
    @Override
    public int get_doing_duration() {
        return deadline;
    }
    public String checking() {
        if (deadline < doTime)
            return "He got bonus in "+getBonus()+"$ .";

        else
            return "He got penalty in "+getPenalty()+"$ ";

    }
    @Override
    public int getBonus() {
        return Bonus;
    }

    @Override
    public int getPenalty() {
        return Penalty;
    }
    public void SoftInf(){
        System.out.println(work());
        System.out.println(programs());

        System.out.println(write());

        System.out.println(gettingSalary());

        System.out.println(checking());

    }

   
}
