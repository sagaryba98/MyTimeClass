public class MyTime{
    private int hour;
    private int minute;
    private int second;
    
    public MyTime(){
        
    }
    
    public MyTime(int hour, int minute, int second){
        if(hour<24&&minute<60&&second<60){
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }
        else{
            System.out.print("Invalid Time...");
        }
        
    }
    
    public void setTime(int hour, int minute, int second){
        if(hour<24&&minute<60&&second<60){
            this.hour=hour;
            this.minute=minute;
            this.second=second;
            }
        else{
            System.out.print("Invalid Time...");
        }
    }
    
    public MyTime getTime(MyTime t){
        return t;
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
    
    public int getSecond(){
        return second;
    }
    
    public String toString(){
        return hour+":"+minute+":"+second;
    }
    
    public MyTime nextSecond(MyTime t){
        t.second=t.second+1;
        return t;
    }
    public MyTime nextMinute(MyTime t){
        t.minute=t.minute+1;
        return t;
    }
    public MyTime nextHour(MyTime t){
        t.hour=t.hour+1;
        return t;
    }
    
    public MyTime previousSecond(MyTime t){
        t.second=t.second-1;
        return t;
    }
    public MyTime previousHour(MyTime t){
        t.hour=t.hour-1;
        return t;
    }
    public MyTime previousMinute(MyTime t){
        t.minute=t.minute-1;
        return t;
    }
    
    public static void main(String... args){
        MyTime t = new MyTime(12,12,12);
        System.out.println(t);
        t.setTime(13,13,13);
        
        System.out.println(t.getTime(t));
        System.out.println(t.nextSecond(t));
        
        
    }
    
    
}