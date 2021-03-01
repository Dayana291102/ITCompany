package ITCompany;

import java.util.Scanner;

public class MyApplication {
    private final Controller employee_controller;
    private final Scanner scanner;



    public MyApplication(Controller employee_controller) {
        this.employee_controller=employee_controller;
       scanner=new Scanner((System.in));
    }

    public void start() {
        char quit = 'n';
        String input;
        int choice;
        while (quit != 'y') {

            System.out.println("Choose one option:\n 1) Find employee by id \n 2) Add employee \n3)Add software engineer \n4)Remove software engineer");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1 -> getEmployeeByIdMenu();
                    case 2 -> addWorker();
                    case 3 -> addsoft();
                    case 4 -> removesoftworker();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("y/n");
            input=scanner.next().toLowerCase();
            quit=input.charAt(0);
        }
    }

    public void start1() {
        char quit = 'n';
        String input;
        int choice;
        while (quit != 'y') {

            System.out.println("Who are you?:\n 1)ITManager 2)SoftEng 2)WebDeveloper");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1 -> start();
                    case 2 -> addWorker();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("y/n");
            input=scanner.next().toLowerCase();
            quit=input.charAt(0);
        }
    }





    public void removesoftworker() {
        System.out.println("Write medicine's id!");
        int id = scanner.nextInt();

        String result = employee_controller.removesoftworker(id);

        System.out.println(result);
    }


    public void getEmployeeByIdMenu() {
        System.out.println("Write the id of medicine!");
        int id = scanner.nextInt();
        String result = employee_controller.getEmployeeById(id);
        System.out.println(result);
    }

    public void addWorker() {
        System.out.println("Write the name of employee!");
        String name = scanner.next();
        System.out.println("Write the surname of employee!");
        String surname  = scanner.next();
        System.out.println("Write the address!");
        String address = scanner.next();
        System.out.println("Write the level");
        String level = scanner.next();
        System.out.println("Write the department");
        String department = scanner.next();

        String result = employee_controller.addWorker(name, surname, address, level, department);

        System.out.println(result);
    }
    public void addsoft() {
        System.out.println("Write the name of employee!");
        String name = scanner.next();
        System.out.println("Write the surname of employee!");
        String surname  = scanner.next();
        System.out.println("Write the address!");
        String address = scanner.next();
        System.out.println("Write the level");
        String level = scanner.next();
        System.out.println("Write the department");
        String department = scanner.next();
        System.out.println("Write the deadline");
        int deadline = scanner.nextInt();
        System.out.println("Write the penalty");
        int penalty = scanner.nextInt();
        System.out.println("Write the bonus");
        int bonus = scanner.nextInt();
        System.out.println("Write the dotime");
        int doTime = scanner.nextInt();
        System.out.println("Write the salary");
        int salary = scanner.nextInt();

        String result = employee_controller.addsoft(name, surname, address, level, department,deadline,penalty, bonus,doTime,salary);

        System.out.println(result);
    }
}
