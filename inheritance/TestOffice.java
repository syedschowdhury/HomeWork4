package inheritance;

public class TestOffice {
    public static void main(String[] args) {

        MainOffice main = new MainOffice();
        main.HeadOffice();

        System.out.println();


        ValleyStream vs = new ValleyStream();
        vs.storeSize();
        System.out.println();

        WoodhavenStore wood = new WoodhavenStore();
        wood.manager();
        System.out.println();

        Bushwick bush = new Bushwick();
        bush.employee();
        bush.Sales();
        bush.manager();



    }
}
