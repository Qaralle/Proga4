import laba2.*;

public class Main {


    public static void main(String[] args) {
        Logger print = new Logger();
        Others emma = new Others("Эмма");
        Thinks metla = new Thinks("метла","существует");
        try {
            print.SimpleRecord(emma.addSkill(new Skill("бросать", "предмет "+metla.GetName()), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        print.SimpleRecord(emma.addCond(new Cond("заколебалась"))) ;
        try {
            print.SimpleRecord(emma.addSkill(new Skill("решила смилостиваться", "предмет "+metla.GetName()), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        print.SimpleRecord(emma.addCond(new Cond("смилостивилась")));
        Mumi.Mama mama = new Mumi.Mama("мама");
        Thinks krovat = new Thinks("Кровать","существует"){
            @Override
            public void Vnutri(String name2){
                this.name=this.name+"."+name2;
                String name;
                name=name2;
                System.out.println(this.name+" существует");

            }
        };
        krovat.Vnutri("Угол");

        try {
            print.SimpleRecord(emma.addSkill(new Skill("cидеть", "на "+krovat.GetName()+" возлу "+mama.getName()), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }


        try {
            Skill talk = new Skill("Сказать","проихносит");
            print.SimpleRecord(emma.addSkill(talk, "прошлое"));
            talk.talking("ПУСТОТА......");
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }

        try {
            Cond terp = new Cond("терпеливо");
            print.SimpleRecord(emma.addSkill(new Skill("покачать " + emma.golova()), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }

        Thinks paper = new Thinks("листок бумаги","пустой");

        try {
            print.SimpleRecord(emma.addSkill(new Skill("взять", paper.GetName()), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }

        Cond droz =new Cond("дрожащая");
        try {
            print.SimpleRecord(emma.addSkill(new Skill("рисовать", "на "+paper.GetName()+" с помощью "+droz.getName()+" "+emma.lapa()+" для "+mama.getName()), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Thinks theater = new Thinks("театр","нарисован на "+paper.GetName());
        paper.srtCond("на нем есть "+theater.GetName());
        System.out.println("теперь "+paper.GetName()+paper.GetCond());

        try {
            print.SimpleRecord(emma.addSkill(new Skill("оюъяснять и записываться что к чему к "+theater.GetName(),"что бы "+mama.getName() + mama.addSkill(new Skill("не забыть"),"будующие")), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Mumi.Spectors spectors= new Mumi.Spectors("Все");
        Mumi.Papa papa= new Mumi.Papa("Папа");
        try{
            print.SimpleRecord(spectors.addSkill(new Skill("подошли и окружили "+emma.getName(),"Пока "+emma.getName()+" рисовала" ),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            print.SimpleRecord(mama.addSkill(new Skill("посмотреть на "+papa.getName()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Cond somn = new Cond("сомнение");
        try{
            print.SimpleRecord(spectors.addSkill(new Skill("c "+somn.getName()+" посмортеть"," друг на друга" ),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
        }
        try{
            print.SimpleRecord(spectors.addSkill(new Skill("взглянуть на "+emma.getName(),"потом" ),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
        }
        try {
            print.SimpleRecord(emma.addSkill(new Skill("разводить "+emma.lapi()), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Thinks piesa = new Thinks("пьеса","почти закончина");
        Time VECHER = new Time("Вечер");
        try {
            print.SimpleRecord(papa.addSkill(new Skill("закончил "+piesa.GetName(), null), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        print.SimpleRecord(piesa.ChangeConditional("закончена"));
        try {
            print.SimpleRecord(papa.addSkill(new Skill("прочитал "+piesa.GetName(), "всем"), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try {
            print.SimpleRecord(spectors.addSkill(new Skill("не перебивали "+papa.getName(), null), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try {
            print.SimpleRecord(papa.addSkill(new Skill("закончить читать "+piesa.GetName()), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Thinks tishina = new Thinks("тишина","воцарила");


        try {
            Skill talk = new Skill("Сказать","наконец");
            print.SimpleRecord(emma.addSkill(talk, "прошлое"));
            talk.talking("Не боюсь я льва, Убиваю его всегда! Ужасно!");
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try {
            print.SimpleRecord(papa.addSkill(new Skill("просиять"), "прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        print.SimpleRecord(papa.addCond(new Cond("обижен")));
        try {
            print.SimpleRecord(papa.addSkill(new Skill("вставать", null), "настоящие"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try {
            print.SimpleRecord(papa.addSkill(new Skill("собирать листы *агрх* ", null), "настоящие"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Thinks work = new Thinks("Работа ","закончена"," большая");
        try{
            print.SimpleRecord(papa.addSkill(new LastSkills(work.GetName()+" всю ночь",work.GetName()+" было "+work.GetCond()),"прошлое"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }

        Thinks slova= new Thinks("Cлова",0);
        try{
            print.SimpleRecord(mama.addSkill(new Skill("молчать и боятся произнести хоть слова", slova.GetName()+" было "+slova.GetCount()),"настоящие"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            print.SimpleRecord(spectors.addSkill(new Skill("молчать и боятся произнести хоть слова",slova.GetName()+" было "+slova.GetCount()),"настоящие"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            print.SimpleRecord(papa.addSkill(new Skill("Заканчивать работу и сразу же читать","Читает "+spectors.getName()),"настоящие"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            papa.addRead(new Reading("читать",null),Lists.FirstList ,"настоящие");
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }catch(HeirArraysInTimeRuntimeExeption e){
            System.out.println(e.getMessage());
            System.out.println("Этот метод умеет работать только с именем 'читать'");
        }
        try{
            print.SimpleRecord(mama.addSkill(new Skill("подкладывать мармелад","Получатель "+papa.getName()),"настоящие"));
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
             papa.addRead(new Reading("читать",null),Lists.SecondList,"настоящие");
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }catch(HeirArraysInTimeRuntimeExeption e){
            System.out.println(e.getMessage());
            System.out.println("Этот метод умеет работать только с именем 'Читать'");
        }
        print.SimpleRecord(mama.Сontin(new Skill("подкладывать мармелад","Получатель "+papa.getName())));
        Thinks nadejda=new Thinks("Надежды","существуют","большие");
        print.SimpleRecord( spectors.addCond(new Cond("возбуждены и полны "+ nadejda.GetSize()+" "+nadejda.GetName())));
        try{
            papa.addRead(new Reading("читать",null),Lists.Continiue,"прошлое");
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }catch(HeirArraysInTimeRuntimeExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Этот метод умеет работать только с именем 'Читать'");
        }
        Time NOCH = new Time("Ночь");
        print.SimpleRecord(spectors.addCond(new Cond("не спалось")));
        print.SimpleRecord(mama.addCond(new Cond("не спалось")));
        print.SimpleRecord(papa.addCond(new Cond("не спалось")));
        print.SimpleRecord(emma.addCond(new Cond("не спалось")));
        Thinks sili=new Thinks("Силы","появились");
        try{
            print.SimpleRecord(emma.addSkill(new Skill("почувствовать",sili.GetName()+" "+sili.GetCond()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Thinks neochem = new Thinks("ни о чем другом","объект мыслителя");
        Thinks repeticia = new Thinks("генеральная репетиция","объект мыслителя");
        try{
            print.SimpleRecord(emma.addSkill(new Skill("не думать ", neochem.GetName()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            print.SimpleRecord(emma.addSkill(new Skill("думать ",repeticia.GetName()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Time UTRO = new Time("Утро того самого дня");
        try{
            print.SimpleRecord(papa.addSkill(new Skill("писать свою "+piesa.GetName()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Mumi.Trol trol=new Mumi.Trol("тролль");
        Thinks jail = new Thinks("Тюрьма","существует");
        try{
            trol.addSkill(new Skill("попасть" ,jail.GetName()),"прошлое");
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Others snusmumric=new Others("Снусмумрик");

        Thinks vetki = new Thinks("Елове ветки","крыша шалаша");
        Thinks shalsh = new Thinks("шалаш","существует");
        Thinks zemlya = new Thinks("поросшая мхом земля","нп ней стоит "+shalsh.GetName());
        Thinks kapli = new Thinks("Дождевые капли","просачиваться cквозь "+vetki.GetName()+" в "+shalsh.GetName());

        Others baby = new Others("малыши");
        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("проснулся" ,"оттого "+kapli.GetName()+" "+kapli.GetCond()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }

        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("выглянул из шалаша" , snusmumric.addCond(new Cond("боясь разбудить "+baby.getName()))),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Forest les = new Forest("Лес","мокрый");
        Forest.Polyanka kover = new Forest.Polyanka("Ковер");
        Forest.Polyanka.ObjectOnPolyanka gvozdiki = new Forest.Polyanka.ObjectOnPolyanka("полевые гвоздики", kover.GetName());
        Forest.Polyanka.ObjectOnPolyanka paporotnik = new Forest.Polyanka.ObjectOnPolyanka("зеленый папоротник", kover.GetName(),"прекрасный");

        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("пожалеть","что на "+kover.GetName()+" растет " + gvozdiki.GetName()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Forest.Polyanka.ObjectOnPolyanka vegetables = new Forest.Polyanka.ObjectOnPolyanka("репа или брюква", kover.GetName(),"в мечтах "+snusmumric.getName());
        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("думать","что лучше на "+kover.GetName()+" росли " +vegetables.GetName()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Others mu=new Others("Мю");
        Thinks BACKPACK = new Thinks("рюкзак","cуществует");
        try {
            Skill talk = new Skill("думал","*в его голове*");
            print.SimpleRecord(snusmumric.addSkill(talk, "прошлое"));
            talk.talking("Да, вот так же, наверно, чувствуешь себя, когда становишься отцом.Чем я буду сегодня кормить малышей? "+mu.getName()+" не съест много, но"+baby.getName()+" (орава) опустошит весь    "+BACKPACK.GetName());
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("обернуться"),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("посмотреть на "+baby.getName(),baby.addSkill(new Skill("спать","в "+shalsh.GetName()+" прям на "+zemlya.GetName()),"прошлое")),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try {
            Skill talk = new Skill("думал","*в его голове*");
            print.SimpleRecord(snusmumric.addSkill(talk, "прошлое"));
            talk.talking("Теперь они("+baby.getName()+")"+"еще начнут чихать от "+kapli.GetName()+ ". Да и это не самое страшное");
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try {
            Skill talk = new Skill("думал","*в его голове*");
            print.SimpleRecord(snusmumric.addSkill(talk, "прошлое"));
            talk.talking("Просто не знаю, что "+snusmumric.addSkill(new Skill("придумать"),"будующие") +", что бы их"+ "("+baby.getName()+")"+"развлечь");
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
           baby.addSkill(new Skill("не хотеть курить"),"прошлое");
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Thinks stories = new Thinks("истории","пугают "+baby.getName());
        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("пугать "+baby.getName(),"c помощью "+stories.GetName()),"прошлое"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }

        Place dolina = new Place("Долина муми-троллей");
        Time osen = new Time("Осени",1);
        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("добираться в "+dolina.getName(),"к "+osen.getTime()+" поэтому "+snusmumric.addSkill(new Skill("не может стоять на "+snusmumric.golova(),"целый день(нет времени)"),"будующие")),"будующие"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Cond horosho = new Cond("хорошо");
        try{
            print.SimpleRecord(mama.addSkill(new Skill("взять на попечение "+baby.getName(),horosho.getCond("будет")),"будующие"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Cond neo = new Cond("неожидонностью");
        try {
            Skill talk = new Skill("подумать","*в его голове* c "+neo.getName());
            print.SimpleRecord(snusmumric.addSkill(talk, "прошлое"));
            talk.talking("Муми-"+trol.getName());
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            print.SimpleRecord(mama.addSkill(new Skill("взять на попечение "+baby.getName(),horosho.getCond("будет")),"будующие"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("плавать","при лунном свете"),"будующие"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            trol.addSkill(new Skill("плавать","при лунном свете"),"будующие");
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Place peshera = new Place("Пещера");
        try{
            print.SimpleRecord(snusmumric.addSkill(new Skill("поболтать","в "+peshera.getName()),"будующие"));
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try{
            trol.addSkill(new Skill("поболтать","в "+peshera.getName()),"будующие");
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Others oneBaby = new Others("один из малышей");
        Thinks son = new Thinks("плохой сон", "приснился");

        oneBaby.addCond(new Cond("испуган c помощью "+son.GetName()));
        try{
            oneBaby.addSkill(new Skill("кричать"),"настоящие");
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        Others othersBaby = new Others("остальные малыши");
        try{
            othersBaby.addSkill(new Skill("проснуться и кричать","из солидарности с "+oneBaby.getName()),"настоящие");
        }catch(NoTimeCheckedExeption e) {
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }
        try {
            Skill talk = new Skill("сказать","цикнул на "+baby.getName()+neo.getName());
            print.SimpleRecord(snusmumric.addSkill(talk, "прошлое"));
            talk.talking("Тсс! Хопетихоп! Титте-рити!");
        }catch(NoTimeCheckedExeption e){
            System.out.println(e.getMessage());
            System.out.println("Существует только 3 времени 'настоящие' , 'будущиу' и 'прошлое'");
        }

    }

}
