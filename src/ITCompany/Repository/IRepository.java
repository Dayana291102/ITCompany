package ITCompany.Repository;

import ITCompany.SoftwareEng;
import ITCompany.Workers;

public interface IRepository {
    public Workers getEmployeeById(int id);
    public boolean addWorker( Workers workers);
    public boolean addsoft( SoftwareEng softwareEng);
    public boolean removesoftworker( int id);
    public boolean removewebworker( int id);
    public SoftwareEng smaxsalary();
    public SoftwareEng sminsalary();


}
