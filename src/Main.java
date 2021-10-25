import java.util.Random;
//workWithStatic();
public class Main {
    public static void main(String[] args){
        Rectangle r = new Rectangle(2, 5);
        showInfo(r);
        formatRectToPalka(r, 6);
        showInfo(r);
        Square s = new Square(4);
        showInfo(s);
        s.setSize(16);
        s.setWidth(9);
        showInfo(s);


    }

    private static void showInfo(Rectangle r){
        System.out.println(r.getWidth() + "x" + r.getHeight());
    }

    private static void formatRectToPalka(Rectangle r, int baseSize){
        r.setHeight(baseSize * 2);
        r.setWidth(baseSize);
    }

    private static void Heroes() {
        Hero hero = new Hero ("Рабочий");
        AlyansHero hero2 = new AlyansHero("Крестьянин");
        Hero[] heroes ={hero, hero2};
        for (Hero h: heroes){
            System.out.println(h.getPhrase());
        }
    }

    private static void workWithPrivateConstruction(){

    }

    private static void workWithStatic() {
        Person[] people = {
                new Person("Stas"),
                new Person("Alexey"),
                new Person("Isa"),
                new Person(null),
                new Person("Max"),
                new Person(null),
                new Person("Max"),
                new Person("Max"),
                new Person("Max")

        };
        Random random = new Random(300);
        for (Person p :
                people) {
            p.setHeightInMeter(random.nextDouble() * 2.5);
        }
        for (Person p :
                people) {
            System.out.println(p.getName() + " " + p.getPrettyHeight());
        }
        Person.setHeightPoint(1.3, 1.5);
        System.out.println("==================");
        for (Person p :
                people) {
            System.out.println(p.getName() + " " + p.getPrettyHeight());
        }
    }


    public static void workWithName(String[] args) {
        Person person = new Person("Biba");
        System.out.println(person.getName());
        person.setName("FirstPerson");
        System.out.println(person.getName());
    }


// public static void workWIthCalc(String[] args) {
// Calculator calc = new Calculator();
// System.out.println(calc.sum(5));
// System.out.println(calc.getCurrent());
// }
}
