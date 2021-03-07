package ITCompany.Repository;

import ITCompany.Doctors;
import ITCompany.dentist;

public interface IRepository {


    public Doctors getDoctorById(int id);

    boolean addDoctor(Doctors doctors);

    boolean adddentist(dentist dentist);

    boolean removedentist(int id);

    boolean removetherapist(int id);

    public dentist  smaxsalary();

    public dentist sminsalary();
}
