package enumExample;

public class Year1 {
    public Month month;

    public Year1(){}

    public Year1(Month month){
     this.month = month;
    }

    public void task(Month month){
        this.month = month;

        switch (month){
            case January:
                System.out.println("First month of the year");
                break;
            case February:
                System.out.println("Second month of the year");
                break;
            case March:
                System.out.println("Third month of the year");
                break;
            case April:
                System.out.println("Fourth month of the year");
                break;
            case May:
                System.out.println("Fifth month of the year");
                break;
            case June:
                System.out.println("Sixth month of the year");
                break;
            case July:
                System.out.println("Seventh month of the year");
                break;
            case August:
                System.out.println("Eighth month of the year\nThe Birthday Month");
                break;
            case September:
                System.out.println("Ninth month of the year");
                break;
            case October:
                System.out.println("Tenth month of the year \n The second Birthday Month");
                break;
            case November:
                System.out.println("Eleventh month of the year");
                break;
            case December:
                System.out.println("Twelve month of the year");
                break;

        }

    }

}
