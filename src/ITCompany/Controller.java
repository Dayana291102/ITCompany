package ITCompany;

import ITCompany.Repository.IRepository;

import java.time.LocalDate;

public class Controller {
    private final IRepository employee_repository;

    public Controller(IRepository employee_repository) {
        this.employee_repository = employee_repository;
    }

    public String getEmployeeById(int id) {

        String result = employee_repository.getEmployeeById(id).toString();

        return result;

    }

    public String addWorker(String name, String surname, String address, String level, String department) {


        boolean added = employee_repository.addWorker(new Workers(name, surname, address, level, department));

        return (added ? "Employee was added!" : "ERROR");
    }

    public String addsoft(String name, String surname, String address, String level, String department, int deadline, int penalty, int bonus, int doTime, int salary) {


        boolean added = employee_repository.addsoft(new SoftwareEng(name, surname, address, level, department, deadline, penalty, bonus, doTime, salary));

        return (added ? "Employee was added!" : "ERROR");
    }


    public String removesoftworker(int id) {
        boolean removed = employee_repository.removesoftworker(id);

        return(removed?"Employee was removed!":"ERROR");
    }

}
