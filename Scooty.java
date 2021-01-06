class vehicle{
    void cost(){
        System.out.println("25k");
    }
}
public class Scooty extends vehicle {
    void cost(){
        System.out.println("20k");

    }
    void mileage(){
        System.out.println("20km");
    }

    public static void main(String[] args) {
        Scooty obj=new Scooty();
        System.out.println("Extending the class");
        obj.cost();
        obj.mileage();
    }

}
