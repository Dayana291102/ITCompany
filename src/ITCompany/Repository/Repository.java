package ITCompany.Repository;

import ITCompany.IConnection;
import ITCompany.SoftwareEng;
import ITCompany.Workers;
import ITCompany.webdev;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Repository implements IRepository {
    private final IConnection dbManager;

    public Repository(IConnection dbManager) {
        this.dbManager = dbManager;
    }


    @Override
    public Workers getEmployeeById(int id) {
        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM worker WHERE id=?");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Workers worker = new Workers();
            if (resultSet.next()) {
                System.out.println("ID of employee is="+ " "+ resultSet.getInt("id"));
                System.out.println("Name of employee is="+" "+resultSet.getString("name"));
                System.out.println("Surname of employee is="+" "+resultSet.getString("surname"));
                System.out.println("Address of employee is="+" "+resultSet.getString("address"));
                System.out.println("Level of employee is="+" "+resultSet.getString("level"));
                System.out.println("Department of employee is="+" "+resultSet.getString("department"));
            }
            return worker;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean addWorker(Workers workers) {
        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO worker (name, surname, address, level, department) VALUES(?,?,?,?,?)");
            preparedStatement.setString(1, workers.getName());
            preparedStatement.setString(2, workers.getSurname());
            preparedStatement.setString(3, workers.getAddress());
            preparedStatement.setString(4, workers.getLevel());
            preparedStatement.setString(5, workers.getDepartment());

            preparedStatement.execute();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    @Override
public boolean addsoft( SoftwareEng softwareEng){
    Connection connection = null;

    try {
        connection = dbManager.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO softengineer (name, surname, address, level, department,deadline,penalty,bonus,doTime,salary) VALUES(?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1, softwareEng.getName());
        preparedStatement.setString(2, softwareEng.getSurname());
        preparedStatement.setString(3, softwareEng.getAddress());
        preparedStatement.setString(4, softwareEng.getLevel());
        preparedStatement.setString(5, softwareEng.getDepartment());
        preparedStatement.setInt(6, softwareEng.getDeadline());
        preparedStatement.setInt(7, softwareEng.getPenalty());
        preparedStatement.setInt(8, softwareEng.getBonus());
        preparedStatement.setInt(9, softwareEng.getDoTime());
        preparedStatement.setInt(10, softwareEng.gettingSalary());



        preparedStatement.execute();

        return true;
    } catch (Exception e) {
        e.printStackTrace();
    }

    return false;
}

    @Override
    public boolean removesoftworker(int id) {
        Connection connection = null;

        try {
            connection = dbManager.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM softengineer WHERE id=?");

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
    public boolean removewebworker(int id) {
        Connection connection = null;

        try {
            connection = dbManager.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM webdev WHERE id=?");

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
    public SoftwareEng smaxsalary() {

        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM softengineer WHERE salary=(SELECT MAX(salary) FROM softengineer)");
            ResultSet resultSet = preparedStatement.executeQuery();
            SoftwareEng softwareEng = new SoftwareEng();
            if (resultSet.next()) {
                System.out.println("This employee has max salary:"+ resultSet.getInt("salary"));
                System.out.println("ID of employee is="+ " "+ resultSet.getInt("id"));
                System.out.println("Name of employee is="+" "+resultSet.getString("name"));
                System.out.println("Surname of employee is="+" "+resultSet.getString("surname"));

            }
            return softwareEng;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public SoftwareEng sminsalary() {

        Connection connection = null;

        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM softengineer WHERE salary=(SELECT MIN(salary) FROM softengineer)");
            ResultSet resultSet = preparedStatement.executeQuery();
            SoftwareEng softwareEng = new SoftwareEng();
            if (resultSet.next()) {
                System.out.println("This employee has max salary:"+ resultSet.getInt("salary"));
                System.out.println("ID of employee is="+ " "+ resultSet.getInt("id"));
                System.out.println("Name of employee is="+" "+resultSet.getString("name"));
                System.out.println("Surname of employee is="+" "+resultSet.getString("surname"));

            }
            return softwareEng;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }





}