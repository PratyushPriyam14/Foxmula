package Foxmula_Assignment_OOPSConcept;

public class Time {

    //declare private instance variable hour min sec
    private int hour;
    private int min;
    private int sec;
    //constructor
    Time(int ho, int mi, int s)
    {
        this.hour=ho;
        this. min=mi;
        this.sec=s;
    }
    Time()
    {
        hour=0;
        min=0;
        sec=0;
    }
    //add method
    public Time add(Time ti)
    {
        Time t= new Time();
        t.sec= this.sec+ti.sec;
        //condition for second
        if(t.sec>60)
        {
            t.sec-=60;
            t.min++;
        }
        //condition for min
        t.min += this.min + ti.min;
        if(t.min>60)
        {
            t.min-=60;
            t.hour++;
        }
        //condition for hour
        t.hour += this.hour +ti.hour;
        if(t.hour>24)
        {
            t.hour-=24;
        }
        return t;
    }

    void display(String str)
    {
        System.out.println(str+" "+hour+":"+min+":"+sec);
    }

    public static void main(String args[])
    {
        Time t1= new Time(11, 30, 12);
        Time t2= new Time(12, 40, 50);
        Time t3= t1.add(t2);
        t1.display("Time 1: ");
        t2.display("Time 2: ");
        t3.display("Time after addition: ");
    }
}

