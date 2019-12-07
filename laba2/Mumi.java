package laba2;

import java.util.ArrayList;

public class Mumi extends Somebody {

    {skills = new ArrayList<Skill>();}
    {Conditional = new ArrayList<Cond>();}
    Logger print = new Logger();

    public Mumi(String name) {
        super(name);
        print.MUMI_Record(name+"был призван");
    }



    @Override
    public String addSkill(Skill skill,String time) throws NoTimeCheckedExeption {
        if (skills.add(skill)) {
            if (time.equals("настоящие")) {
                return ("Муми-" + this.getName() + " начал " + skill.getName() + "(" + skill.getInfo() + ")");
            }
            else if (time.equals("прошлое")) {
                return ("Муми-" + this.getName() + " делал " + skill.getName()+"("+skill.getInfo()+")");
            }
            else if (time.equals("будующие")) {
                return ("Муми-" + this.getName() + " будет делать " + skill.getName()+"("+skill.getInfo()+")");
            }
            else{
                throw new NoTimeCheckedExeption("Параметр 'Время' не коректный ");
            }
        }
        return "";
    }

    public String addCond(Cond conditional) {
        if (Conditional.add(conditional)) {
            return (this.getName() + " был " + conditional.getName());
        }
        return "";
    }


    public void addRead(Reading skill, Lists list,String time) throws NoTimeCheckedExeption{

        if (skills.add(skill)) {
            if (time.equals("настоящие")) {
                print.MUMI_Record(this.getName() + " начал " + skill.getName());
            }
            else if (time.equals("прошлое")) {
                print.MUMI_Record( this.getName() + " продолжал " + skill.getName());
            }
            else if (time.equals("будующие")) {
                print.MUMI_Record(this.getName() + " будет продолжать " + skill.getName());
            }
            else{
                throw new NoTimeCheckedExeption("Параметр 'Время' не коректный ");
            }
            switch (list) {
                case FirstList:
                    System.out.println(list);
                    break;
                case SecondList:
                    System.out.println(list);
                    break;
                case Continiue:
                    System.out.println(list);
                    break;

            }
        }
    }



    @Override
    public String toString() {
        return ("(" + getName() + ", ");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        return false;
    }

    public static class Mama extends Mumi {
        public Mama(String name) {
            super(name);
            print.MUMI_Record(name+"была призвана");
        }

        @Override
        public String addSkill(Skill skill, String time) throws NoTimeCheckedExeption {
            if (skills.add(skill)) {
                if (time.equals("настоящие")) {

                    return ("Муми-" + this.getName() + " начал " + skill.getName() + "(" + skill.getInfo() + ")");
                } else if (time.equals("прошлое")) {

                    return ("Муми-" + this.getName() + " делала " + skill.getName() + "(" + skill.getInfo() + ")");
                } else if (time.equals("будующие")) {
                    return ("Муми-" + this.getName() + " будет делать " + skill.getName() + "(" + skill.getInfo() + ")");
                } else {
                    throw new NoTimeCheckedExeption("Параметр 'Время' не коректный ");
                }
            }
            return  "";
        }

        @Override
        public String addCond(Cond conditional) {
            if (Conditional.add(conditional)) {
                return (this.getName() + " была " + conditional.getName());
            }
            return "";
        }

        public String Сontin(Skill skill) {
            if (skills.add(skill)) {
                return (this.getName() + " продолжила " + skill.getName() + "(" + skill.getInfo() + ")");
            }
            return "";
        }
    }

    public static class Papa extends Mumi{
        public Papa(String name) {
            super(name);
        }
    }

    public static class Spectors extends Mumi{
            public Spectors(String name) {
                super(name);
                print.MUMI_Record(name+"были призвана");
            }
            @Override
            public String  addSkill(Skill skill,String time) throws NoTimeCheckedExeption {
                if (skills.add(skill)) {
                    if (time.equals("настоящие")) {
                        return (this.getName() + " начали " + skill.getName() + "(" + skill.getInfo() + ")");
                    }
                    else if (time.equals("прошлое")) {
                        return (this.getName() + " делали " + skill.getName()+"("+skill.getInfo()+")");
                    }
                    else if (time.equals("будующие")) {
                        return (this.getName() + " будут делать " + skill.getName()+"("+skill.getInfo()+")");
                    }
                    else{
                        throw new NoTimeCheckedExeption("Параметр 'Время' не коректный ");
                    }
                }
                return  "";
            }
            @Override
            public String addCond(Cond conditional) {
                if (Conditional.add(conditional)) {
                    return (this.getName() + " были " + conditional.getName());
                }
                return  "";
            }

        }
        public static class Trol extends Mumi{

            public Trol(String name) {
                super(name);
            }
        }


}

