package EndTerm.Repository;

import EndTerm.Doctors;
import EndTerm.IConnection;
import EndTerm.IRepository;
import EndTerm.dentist;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Repository implements IRepository {
    private final IConnection dbManager;

    public Repository(IConnection dbManager) {
        this.dbManager = dbManager;
    }


    @Override
    public Doctors getDoctorById(int id) {
        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM doctor WHERE id=?");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Doctors doctors = new Doctors();
            if (resultSet.next()) {
                System.out.println("ID of employee is="+ " "+ resultSet.getInt("id"));
                System.out.println("Name of employee is="+" "+resultSet.getString("name"));
                System.out.println("Surname of employee is="+" "+resultSet.getString("surname"));
                System.out.println("Address of employee is="+" "+resultSet.getString("address"));
                System.out.println("Level of employee is="+" "+resultSet.getString("level"));
                System.out.println("Department of employee is="+" "+resultSet.getString("department"));
            }
            return doctors;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean addDoctor(Doctors doctors) {
        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO doctor (name, surname, address, level, department) VALUES(?,?,?,?,?)");
            preparedStatement.setString(1, doctors.getName());
            preparedStatement.setString(2, doctors.getSurname());
            preparedStatement.setString(3, doctors.getAddress());
            preparedStatement.setString(4, doctors.getLevel());
            preparedStatement.setString(5, doctors.getDepartment());

            preparedStatement.execute();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    @Override
    public boolean adddentist(dentist dentist){
        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO dentist (name, surname, address, level, department,deadline,penalty,bonus,doTime,salary) VALUES(?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, dentist.getName());
            preparedStatement.setString(2, dentist.getSurname());
            preparedStatement.setString(3, dentist.getAddress());
            preparedStatement.setString(4, dentist.getLevel());
            preparedStatement.setString(5, dentist.getDepartment());
            preparedStatement.setInt(6, dentist.getDeadline());
            preparedStatement.setInt(7, dentist.getPenalty());
            preparedStatement.setInt(8, dentist.getBonus());
            preparedStatement.setInt(9, dentist.getDoTime());
            preparedStatement.setInt(10, dentist.gettingSalary());



            preparedStatement.execute();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean removedentist(int id) {
        Connection connection = null;

        try {
            connection = dbManager.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM dentist WHERE id=?");

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean removetherapist(int id) {
        Connection connection = null;

        try {
            connection = dbManager.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM therapist WHERE id=?");

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public dentist smaxsalary() {

        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM dentist WHERE salary=(SELECT MAX(salary) FROM softengineer)");
            ResultSet resultSet = preparedStatement.executeQuery();
            dentist dentist = new dentist();
            if (resultSet.next()) {
                System.out.println("This doctor has max salary:"+ resultSet.getInt("salary"));
                System.out.println("ID of doctor is="+ " "+ resultSet.getInt("id"));
                System.out.println("Name of doctor is="+" "+resultSet.getString("name"));
                System.out.println("Surname of doctor is="+" "+resultSet.getString("surname"));

            }
            return dentist;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public dentist sminsalary() {

        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM softengineer WHERE salary=(SELECT MIN(salary) FROM softengineer)");
            ResultSet resultSet = preparedStatement.executeQuery();
            dentist dentist = new dentist();
            if (resultSet.next()) {
                System.out.println("This doctor has max salary:"+ resultSet.getInt("salary"));
                System.out.println("ID of doctor is="+ " "+ resultSet.getInt("id"));
                System.out.println("Name of doctor is="+" "+resultSet.getString("name"));
                System.out.println("Surname of doctor is="+" "+resultSet.getString("surname"));

            }
            return dentist;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }





}