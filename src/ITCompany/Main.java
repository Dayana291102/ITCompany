package ITCompany;

import ITCompany.Repository.IRepository;
import ITCompany.Repository.Repository;

public class Main {
    public static void main(String[] args) {
        IConnection dbManager= new Connectionn();
        IRepository employee_repository= new Repository(dbManager);
        Controller employee_controller=new Controller(employee_repository);
        MyApplication myApplication=new MyApplication(employee_controller);
        myApplication.start1();
        myApplication.start();

    }
}
