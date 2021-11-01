public abstract class Student {
    String name, program;
    int age;
    abstract void display_student_info();

    public Student(String name, String program, int age) {
        this.name = name;
        this.program = program;
        this.age = age;
    }
}
class Graduate_Student extends Student{
    float percentage;
    String stream;

    public Graduate_Student(String name, String program, int age, float percentage, String stream) {
        super(name, program, age);
        this.percentage = percentage;
        this.stream = stream;
    }

    public void display_student_info(){
        System.out.println("name= " + name +
                ", program= " + program +
                ", age= " + age +
                ", percentage= " + percentage +"%"+
                ", stream= " + stream);
    }
}

class Research_Student extends Student{
    String spec;
    int yrs;

    public Research_Student(String name, String program, int age, String spec, int yrs) {
        super(name, program, age);
        this.spec = spec;
        this.yrs = yrs;
    }
    public void display_student_info(){
        System.out.println("name= " + name +
                ", program= " + program +
                ", age= " + age +
                ", specialization= " + spec +
                ", years of experience= " + yrs);
    }

}
class Identity{
    public static void main(String[] args) {
        Research_Student rs = new Research_Student("Rishabh", "Phd", 19, "AIML", 2);
        Graduate_Student gs = new Graduate_Student("Archie", "B.Tech", 19, 97, "computer science");
        rs.display_student_info();
        gs.display_student_info();
    }
}

