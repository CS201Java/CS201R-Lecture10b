public class Teacher extends Staff{
    
    private String subject;
    public static int totalTeachers = 0;

    public Teacher(){
        super();
        type = 'T';
        subject = "";
    }
    public Teacher(char t, String f, String l, int a, int h, 
                         double hr, String s){
        super('T',f, l,a,h,hr);
        subject = s;
        totalTeachers++;
    }

    public void setSubject(String s){subject = s;}
    public String getSubject(){return subject;}
    
    //create the print method
    public String printPerson(){
        String out = String.format("%-15s%-15s%5d%10d%10.2f%5s%-15s\n",
                           fname, lname, age, hours, hrlyRate, " ", subject);
        return out;
     }

    //create the toString method
    @Override
    public String toString(){
        String out = String.format("%-15s%-15s%5d%10d%10.2f%5s%-15s\n",
                           fname, lname, age, hours, hrlyRate, " ", subject);
        return out;
     }
}
