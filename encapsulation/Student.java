package encapsulation;

public class Student {

    private String Name;
    private String department;
    private int id;
    private String university;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Student(){}

    public Student(String Name, int id, String department, String university){
        super();
        this.Name=Name;
        this.department = department;
        this.id=id;
        this.university = university;
    }

    public Student(String Name, int id){
        this.Name = Name;
        this.id = id;
    }


}
