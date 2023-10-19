package src;

public class Student {
    private String name ;
    private int age ;
    private double score ;

    public Student(String name , int age , double score){
        this.name = name ;
        this.age = age ;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString(){
        return "Student = { Name : "+getName()+", "+" Age : "+getAge()+", "+"Score :"+getScore();
    }
}

