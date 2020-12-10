import java.util.Scanner;

public class Main {

    static Scanner line = new Scanner(System.in);

    public static void main(String[] args) {

        Student Johny = new Student("Johny", 25, 12352323);
        Student Dikky = new Student("Johny", 25, 31324013);
        System.out.println();
//        first();
//        mod_F();
//        arrys();
//        line.close();

        // Hier you check how much people can get in the car.
//        FunnyTaxi taxi = new FunnyTaxi();
//        for (int i = 0; i < 6; i++){
//            System.out.println(taxi.addPassager("name_"+i, "forname_"+i));
//        }
    }
    /*
    public static void mod_F(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("Int: " + i);
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Double: " + d);
        String s = scan.nextLine();
        System.out.println("String: " + s);

    }
    public static void first(){
        System.out.println("Hi, I'm Jonhy! And who are you?");
//        String name = line.nextLine();
//        System.out.println("Hi, " + name);
    }
    public static void arrys(){
        int x = line.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = i;
        }
        System.out.println(arr);

        for(int elem:arr){
            System.out.println(elem + 1);
        }
    }
    */
}

class Human{
    String name, forename;

    Human(String name, String forename){
        this.name = name;
        this.forename = forename;
    }

    public String getName() {
        return name;
    }
    public String getForename() {
        return forename;
    }
}

class FunnyTaxi{

    int personIn;
    String nameOfDriver;
    Human[] passagers = new Human[4];

    FunnyTaxi(){
        this.nameOfDriver = "Johny Blancko"; //default Taxi driver *)
    }
    FunnyTaxi(String nameOfDriver){
        personIn = 1;
        this.nameOfDriver = nameOfDriver;
    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public String addPassager(String name, String forname){
        if (personIn >= 5){
            return "We are sorry, Lucky Fuke. The taxi is full.\n";
        }
        Human passager = new Human(name, forname);
        passagers[personIn - 1] = passager;
        this.personIn++;
        return "Lucky Fuke gets in.\n";
    }

    public Human[] allGetOut(){
        this.personIn = 1;
        if (passagers.length != 0){
            return passagers;
        }
        return passagers;
    }
}

