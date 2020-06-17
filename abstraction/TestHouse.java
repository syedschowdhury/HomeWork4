package abstraction;

public class TestHouse {
    public static void main(String[] args) {

        House home = new ConcreteClass();
        home.name();
        home.type();
        home.land();
        home.bedRoom();


        ConcreteClass con = new ConcreteClass();
        con.pool();
        System.out.println();

        House green = new GreenHouse();
        green.name();
        green.type();
        green.land();
        green.bedRoom();
        System.out.println();

        BrickHouse brick = new ConcreteClass();
        brick.Apartments();
        brick.design();
        System.out.println();

        TownHouse town = new ConcreteClass();
        town.sizeUnit();


    }
}
