package laba2;
import java.util.ArrayList;
import java.util.List;

public abstract class Somebody implements SomeboduInterface {
    private String name;
    protected List<Skill> skills = null;
    protected List<Cond> Conditional = null;

    public Somebody(String name){
        this.name=name;
    }


    public abstract String addSkill(Skill skill,String time) throws NoTimeCheckedExeption;

    @Override
    public void setSkills(ArrayList<Skill> skills){
        this.skills = skills;
    }

    @Override
    public String getName(){
        return this.name;
    }

}
