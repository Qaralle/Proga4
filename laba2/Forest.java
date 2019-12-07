package laba2;

public class Forest extends Thinks {
    public Forest(String nam1, String cond1) {
        super(nam1, cond1);
    }

    public static class Polyanka{

        private String name;
        public Polyanka(String name1){
            this.name=name1;
            System.out.println("Объект полянка-"+ name+ " был создан");
        }
        public String GetName(){
            return name;
        }

        public static class ObjectOnPolyanka{
            private String name;
            private String place;
            private String info;

            public ObjectOnPolyanka(String name1,String place1){
                this.name=name1;
                this.place=place1;
                System.out.println("Объект растение-"+ name+ " был создан на "+place);
            }

            public ObjectOnPolyanka(String name1,String place1,String cond){
                this.name=name1;
                this.info=cond;
                this.place=place1;
                System.out.println("Объект растение-"+ name+" "+info+ " был создан на "+place);
            }
            public String GetName(){
                return name;
            }

        }

    }


}
