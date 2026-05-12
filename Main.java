import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to classes!");

        //define file values
        ArrayList<Person> people = new ArrayList<>();
        
        //CREATE A STUDENT OBJECT USING OVERLOADED CONSTRUCTOR
        Student s1 = new Student('S', "Mahomes","Patrick", 29, 3.5);
        System.out.print(s1);

        //CREATE A STUDENT OBJECT USING DEFAULT CONSTRUCTOR
        Student s2 = new Student();
        s2.setType('S');
        s2.setLName("Kelce");
        s2.setFName("Travis");
        s2.setAge(35);
        s2.setGPA(3.4);


        //PRINT OBJECTS 
         System.out.print(s1);
         System.out.print(s2);

        people.add(s1);
        people.add(s2);

        try {
            File inFile = new File("people.txt");
            Scanner scanner = new Scanner(inFile);

            //input values from a file & add to people
            Functions.loadArrayList(people, scanner);
            
            for (Person p : people){
                System.out.print(p);
            }
            System.out.println("Total People:   " + Person.totalPeople);
            System.out.println("Total Students: " + Student.totalStudent);
            System.out.println("Total Staff:    " + Staff.totalStaff);
            System.out.println("Total Teachers: " + Teacher.totalTeachers);
            System.out.println("Total Employees:" + Employee.totalEmployees);

            for (Person p : people){
                System.out.printf(Functions.printObjects(p));
            }
            scanner.close();
        }

        catch (FileNotFoundException e){
            System.out.println("Unable to open file");
            return;
        }
         
    }

 
      
}

