package laba2;

public class Reading extends Skill{

    public Reading(String name1,String info1) throws HeirArraysInTimeRuntimeExeption {
        super(name1, info1);
        if ((name1.equals("читать")==false) && (name1.equals("Читать")==false)){
            throw new HeirArraysInTimeRuntimeExeption("Неправильное название наследника");
        }
    }

}
