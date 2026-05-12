import java.util.ArrayList;
import java.util.Scanner;

public class Functions {

    public static void loadArrayList(ArrayList<Person> people, Scanner input){

        String inputLine;
        char t;
        int a, h;
        double g, hr, v;
        String f, l, s;

 
        while (input.hasNextLine()){
            //get the next line of input from the file
            inputLine = input.nextLine();
            String[] tokens = inputLine.split(",");

            //check that the number of tokens includes row & colum
            if (tokens[0].equals("P") && tokens.length < 4){
                System.out.println("Input is invalid: " + inputLine);
                continue;
            } 
            if (tokens[0].equals("S") && tokens.length < 5){
                System.out.println("Input is invalid: " + inputLine);
                continue;
            } 
            if (tokens[0].equals("T") && tokens.length < 7){
                System.out.println("Input is invalid: " + inputLine);
                continue;
            }
            f = tokens[2];
            l = tokens[1];

            if (tokens[0].equals("P")){
                try{
                    a = Integer.parseInt(tokens[3]);
                    Person newPerson = new Person(f,l,a);
                    people.add(newPerson);
                }
                catch(NumberFormatException e){
                    System.out.println("Error in the line: " + inputLine);
                }
            }
            else if (tokens[0].equals("S")){
                try{
                    a = Integer.parseInt(tokens[3]);
                    g = Double.parseDouble(tokens[4]);
                    Student newPerson = new Student('S',f,l,a,g);
                    people.add(newPerson);
                }
                catch(NumberFormatException e){
                    System.out.println("Error in the line: " + inputLine);
                }
            }
            else if (tokens[0].equals("T")){
                try{
                    a = Integer.parseInt(tokens[3]);
                    h = Integer.parseInt(tokens[4]);
                    hr = Double.parseDouble(tokens[5]);
                    s = tokens[6];
                    Teacher newPerson = new Teacher('T',f,l,a, h, hr, s);
                    people.add(newPerson);
                }
                catch(NumberFormatException e){
                    System.out.println("Error in the line: " + inputLine);
                }
            }
            else if (tokens[0].equals("E")){
                try{
                    a = Integer.parseInt(tokens[3]);
                    h = Integer.parseInt(tokens[4]);
                    hr = Double.parseDouble(tokens[5]);
                    v = Double.parseDouble(tokens[6]);
                    Employee newPerson = new Employee('E',f,l,a, h, hr, v);
                    people.add(newPerson);
                }
                catch(NumberFormatException e){
                    System.out.println("Error in the line: " + inputLine);
                }
            }
       }
    }

    public static String printObjects(Person p){
        String out = String.format("%-15s%-15s%5d\n",p.getFName(),p.getLName(), p.getAge());
        return out;
    }


    
}
