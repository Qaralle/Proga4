package laba2;

public class Thinks {
    protected String name;
    private int count;
    protected String Conditional;
    private String Size;
    private Logger print = new Logger();
    public Thinks(String nam1, int count1){
        this.count=count1;
        this.name=nam1;
        print.SimpleRecord("Объект "+name+" создан "+ "в количестве "+ count);
    }
    public Thinks(String nam1, String Conditional1, String Size1){
        this.Conditional=Conditional1;
        this.name=nam1;
        this.Size=Size1;
        print.SimpleRecord("Объект "+name+" создан "+ "с состоянием "+ Conditional+" размером "+Size);
    }

    public Thinks(String nam1, String Conditional1){
        this.Conditional=Conditional1;
        this.name=nam1;
        print.SimpleRecord("Объект "+name+" создан "+ "с состоянием "+ Conditional);
    }

    public String ChangeConditional(String Cond2){
        this.Conditional=Cond2;
        return ("Объект "+name+" теперь "+Conditional);
    }

    public String printCrteating(){
        return ("Объект с именем "+name+" cоздан");
    }
    public void Vnutri(String name2){
    }

    public void srtCond(String comd0){
        this.Conditional=comd0;
    }

    public String GetName(){
        return name;
    }
    public String GetSize(){
        return Size;
    }
    public String GetCond(){
        return Conditional;
    }
    public int GetCount(){
        return count;
    }
}
