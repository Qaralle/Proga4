package laba2;

public enum Lists implements Listable {
    FirstList("Физика - играет огромную роль в образование и закладывает......"),
    SecondList(".....является не отъемлемым аспектом в формирование сознания......"),
    Continiue(".....бла бла бла........");

    private String description;

    Lists(String description) {
        this.description = description;
    }
    @Override
    public String Getsmthinlist(){
        return description;
    }
    @Override
    public String toString() {
        return " так на страничке у меня тут написано:" + description ;
    }

}
