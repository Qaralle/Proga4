package laba2;

public class Cond {
    private String name;

    public Cond(String name1){
        this.name = name1;
    }
    public String getCond(String obj){
        if (obj.equals("сейчас")) {
            return ("есть "+name);
        }
        if (obj.equals("было")) {
            return ("было "+name);
        }
        if (obj.equals("будет")) {
            return ("будет "+name);
        }
        return "";
    }

    public String getName(){
        return name;
    }

}
