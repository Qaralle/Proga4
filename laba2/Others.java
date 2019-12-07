package laba2;

import java.util.ArrayList;

public class Others extends Somebody {
    {skills = new ArrayList<Skill>();}
    {Conditional = new ArrayList<Cond>();}
    private Logger print = new Logger();
    public Others(String name) {
        super(name);
        print.SimpleRecord(name+" была призвана");
    }



    SomeOfoTHER<String> golova = new SomeOfoTHER<>("голова");
    SomeOfoTHER<String> lapa = new SomeOfoTHER<>("лапка");
    SomeOfoTHER<String> lapi = new SomeOfoTHER<>("лапки");


    @Override
    public String addSkill(Skill skill,String time) throws NoTimeCheckedExeption {
        if (skills.add(skill)) {
            if (time.equals("настоящие")) {
                return (this.getName() + " начал " + skill.getName() + "(" + skill.getInfo() + ")");
            }
            else if (time.equals("прошлое")) {
                return (this.getName() + " делал " + skill.getName()+"("+skill.getInfo()+")");
            }
            else if (time.equals("будующие")) {
                return (this.getName() + " будет делать " + skill.getName()+"("+skill.getInfo()+")");
            }
            else{
                throw new NoTimeCheckedExeption("Параметр 'Время' не коректный ");
            }
        }
        return "";
    }
    public String addCond(Cond conditional) {
        if (Conditional.add(conditional)) {
            return (this.getName() +" "+ conditional.getName());
        }
        return " ";
    }
    private class SomeOfoTHER<S> {
        private String name;
        private SomeOfoTHER(String name1){
            this.name=name1;
        }
        public String getName(){
            return name;
        }

    }
    public String golova(){
        String kostil;
        kostil=golova.getName();
        return kostil;
    }
    public String lapa(){
        String kostil;
        kostil=lapa.getName();
        return kostil;
    }
    public String lapi(){
        String kostil;
        kostil=lapi.getName();
        return kostil;
    }
}
