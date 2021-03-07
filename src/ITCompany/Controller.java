package ITCompany;

import ITCompany.Repository.IRepository;

public class Controller {
    private final IRepository employee_repository;

    public Controller(IRepository employee_repository) {
        this.employee_repository = employee_repository;
    }

    public String getDoctorById(int id) {

        String result = employee_repository.getDoctorById(id).toString();

        return result;

    }

    public String addDoctor(String name, String surname, String address, String level, String department) {


        boolean added = employee_repository.addDoctor(new Doctors(name, surname, address, level, department));

        return (added ? "Doctor was added!" : "ERROR");
    }

    public String adddentist(String name, String surname, String address, String level, String department, int deadline, int penalty, int bonus, int doTime, int salary) {


        boolean added = employee_repository.adddentist(new dentist(name, surname, address, level, department, deadline, penalty, bonus, doTime, salary));

        return (added ? "Doctor was added!" : "ERROR");
    }


    public String removedentist(int id) {
        boolean removed = employee_repository.removedentist(id);

        return(removed?"Doctor was removed!":"ERROR");
    }

    public String removetherapist(int id) {
        boolean removed = employee_repository.removetherapist(id);

        return(removed?"Doctor was removed!":"ERROR");
    }

    public String smaxsalary() {
        String result = employee_repository.smaxsalary().toString();

        return result;
    }
    public String sminsalary() {
        String result = employee_repository.sminsalary().toString();

        return result;
    }


}