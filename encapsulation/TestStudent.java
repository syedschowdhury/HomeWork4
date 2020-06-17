package encapsulation;

public class TestStudent {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.setName("Dihan Chowdhury");
        st1.setId(101);
        st1.setDepartment("Information Technology");
        st1.setUniversity("University of Columbia");
        System.out.println(st1.getName()+"\n"+st1.getDepartment()
                +"\n"+st1.getId()+"\n"+st1.getUniversity());

        System.out.println();

        Student st2 = new Student();
        st2.setName("Sadia Chowdhury");
        st2.setId(102);
        st2.setDepartment("Bio-Chemistry");
        st2.setUniversity("College of Charleston");
        System.out.println(st2.getName()+"\n"+st2.getDepartment()+"\n"
                +st2.getId()+"\n"+st2.getUniversity());

        System.out.println();

        Student st3 = new Student("Mahin Chowdhury", 103,"IT","University of Sunderland");
        System.out.println(st3.getName()+"\n"+st3.getId()+"\n"
                +st3.getDepartment()+"\n"+st3.getUniversity());

        System.out.println();

        Student st4 = new Student("Syed Chowdhury", 104);
        System.out.println(st4.getName()+"\n"+st4.getId());




    }
}
