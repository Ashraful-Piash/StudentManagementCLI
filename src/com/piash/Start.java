package com.piash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args)throws IOException {
        System.out.println("Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("press 1 to add student");
            System.out.println("press 2 to delete student");
            System.out.println("press 3 to display student");
            System.out.println("press 4 to exit app");
            int c = Integer.parseInt(br.readLine());

            if(c==1){
                //create student
                System.out.println("Enter user name: ");
                String name = br.readLine();
                System.out.println("Enter user Phone: ");
                String phone = br.readLine();
                System.out.println("Enter user city: ");
                String city = br.readLine();

                Student st = new Student(name, phone,city);
                boolean answer= StudentDao.insertStudentToDB(st);
                if(answer){
                    System.out.println("Student added successfully");
                }else{
                    System.out.println("Something went wrong!!! Try again");
                }
                System.out.println(st);
            }else if(c==2){
                System.out.println("Enter student id to delete student: ");
                int userId = Integer.parseInt((br.readLine()));
                boolean f= StudentDao.deleteStudent(userId);
                if(f){
                    System.out.println("Deleted");
                }else{
                    System.out.println("Something went wrong");
                }
                //delete student
            } else if (c == 3) {
                StudentDao.showAllStudent();


                //display student
            }else if(c==4){
                //exit app
              break;
            }else{


            }
            System.out.println("Thanks for using the app");
        }

    }

}
