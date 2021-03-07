package ITCompany;

import java.util.Scanner;

public class MyApplication {
    private final Controller doctor_controller;
    private final Scanner scanner;



    public MyApplication(Controller doctor_controller) {
        this.doctor_controller=doctor_controller;
        scanner=new Scanner((System.in));
    }

    public void start() {
        char quit = 'n';
        String input;
        int choice;
        while (quit != 'y') {

            System.out.println("Choose one option:\n 1) Find doctor  by id \n 2) Add doctor \n3)Add software engineer \n4)Remove software engineer \n 5)Remove web developer ");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1 -> getDoctorById();
                    case 2 -> addDoctor();
                    case 3 -> adddentist();
                    case 4 -> removedentist();
                    case 5 -> removetherapist();


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

            System.out.println("Who are you?:\n 1)IPediatr 2)Dentist 2)therapist");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1 -> start();
                    case 2 -> start2();
                    case 3 -> start2();



                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("y/n");
            input=scanner.next().toLowerCase();
            quit=input.charAt(0);
        }
    }
    public void start2() {
        char quit = 'n';
        String input;
        int choice;
        while (quit != 'y') {

            System.out.println("Choose one option:\n 1)Show max salary 2)Show min salary");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1 -> smaxsalary();
                    case 2 -> sminsalary();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("y/n");
            input=scanner.next().toLowerCase();
            quit=input.charAt(0);
        }
    }

    private void smaxsalary() {
        String result = doctor_controller.smaxsalary();
        System.out.println(result);
    }
    private void sminsalary() {
        String result = doctor_controller.sminsalary();
        System.out.println(result);
    }


    public void removedentist() {
        System.out.println("Write doctor's id!");
        int id = scanner.nextInt();

        String result = doctor_controller.removedentist(id);

        System.out.println(result);
    }
    private void removetherapist() {
        System.out.println("Write doctor's id!");
        int id = scanner.nextInt();

        String result = doctor_controller.removetherapist(id);

        System.out.println(result);

    }


    public void getDoctorById() {
        System.out.println("Write the id of medicine!");
        int id = scanner.nextInt();
        String result = doctor_controller.getDoctorById(id);
        System.out.println(result);
    }

    public void addDoctor() {
        System.out.println("Write the name of doctor!");
        String name = scanner.next();
        System.out.println("Write the surname of doctor!");
        String surname  = scanner.next();
        System.out.println("Write the address!");
        String address = scanner.next();
        System.out.println("Write the level");
        String level = scanner.next();
        System.out.println("Write the department");
        String department = scanner.next();

        String result = doctor_controller.addDoctor(name, surname, address, level, department);

        System.out.println(result);
    }
    public void adddentist() {
        System.out.println("Write the name of doctor!");
        String name = scanner.next();
        System.out.println("Write the surname of doctor!");
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

        String result = doctor_controller.adddentist(name, surname, address, level, department,deadline,penalty, bonus,doTime,salary);

        System.out.println(result);
    }
}
/*
* String Dayana=scanner.nextLine()
* scanner.nextLine();
* int a=scanner.nextInt()*/