public abstract class Staff extends Person{

    protected  int hours;
    protected  double hrlyRate;
 

    Staff(){
        super("","",0);
        type = 'X';
        hours = 0;
        hrlyRate = 0.0;
    }
    Staff(char t, String f, String l, int a, int h, double hr){
        super(f,l,a);
        type = t;
        hours = h;
        hrlyRate = hr;
        totalStaff++;
    }

    //create all getters (accessors)
    public int getHours(){return hours;}
    public double getHrlyRate(){return hrlyRate;}
    
    //create all setters (mutators)
    public void setHours(int h){hours = h;}
    public void setHrlyRate(double hr){this.hrlyRate = hr;}
 
    @Override
    public abstract String toString();

    public static int totalStaff = 0;
            
}
