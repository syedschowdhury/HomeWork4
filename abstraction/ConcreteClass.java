package abstraction;

public class ConcreteClass extends BrickHouse implements House {

    public void name() {
        System.out.println("White House");
    }

    public void land() {
        System.out.println("5 Acre");
    }

    public void type() {
        System.out.println("Private house");
    }

    public void bedRoom() {
        System.out.println("4 Bedroom");
    }

    public void pool(){
        System.out.println("10 feet round pool");
    }


    //abstract class call
    public void design() {
        System.out.println("10 Apartments");
    }


    public void sizeUnit() {
        System.out.println("3200 sq feet");
    }
}
