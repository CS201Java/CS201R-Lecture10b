import java.util.ArrayList;
import java.util.Scanner;

public class Functions {

    public static int loadArrayList(ArrayList<Person> people, Scanner input){

        String inputLine;
        char t;
        int a, h;
        double g, hr;
        String f, l, s;

 
        while (input.hasNextLine()){
            //get the next line of input from the file
            inputLine = input.nextLine();
            String[] tokens = inputLine.split(",");

            //check that the number of tokens includes row & colum
            if (tokens[0].equals("P") && tokens.length < 4){
                return -1;
            } 
            if (tokens[0].equals("S") && tokens.length < 5){
                return -1;
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
                    Person newPerson = new Person(f,l,a);
                    people.add(newPerson);
                }
                catch(NumberFormatException e){
                    System.out.println("Error in the line: " + inputLine);
                }
            }

       }
                   
       return 1;
    }

    public static String printObjects(Person p){
        String out = String.format("%-15s%-15s%5d\n",p.getFName(),p.getLName(), p.getAge());
        return out;
    }


    
}
