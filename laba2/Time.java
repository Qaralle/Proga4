package laba2;

public class Time {
    private String time;
    private Logger print = new Logger();
    private int pos;
    public Time(String time1){
        this.time=time1;
        print.SimpleRecord("Время-"+time);
    }
    public Time(String time1,int pos1){
        this.time=time1;
        this.pos=pos1;
        print.SimpleRecord(time+"где-то есть было или будет");
    }
    public String getTime(){
        return time;
    }
}
