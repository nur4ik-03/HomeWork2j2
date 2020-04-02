package com.company;

public class Main {

    public static void main(String[] args ) {
        createObject("1").print();
        System.out.println("____________________________");
        System.out.println(" ");
        createObject("2").print();
        System.out.println("____________________________");
        System.out.println(" ");
        createObject("3").print();
        System.out.println("____________________________");
        createObject("4").print();

    }


        public static  Printable createObject(String className){
                    Printable printable = null;
                    switch (className){
                        case "1":
                            printable = new Magic(200," Волшебник"  ," Иллюзии "," Гипноз");
                        break;
                        case"2":
                            printable = new Health(250," Медик "," отсутвует ",50);
                        break;
                        case"3":
                            printable = new Attake(200, " Воин "," Физичекий "," Удар мечом");
                        break;
                        case"4":
                            printable =  new Simple(200," Оружиносец " ," отсутвует"," Тоскает Предметы");
                        break;
                    }
                return printable;
        }
}





