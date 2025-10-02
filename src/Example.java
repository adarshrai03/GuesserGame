

class Student implements  Cloneable{
    int roll;
    String name;

    Student(int roll , String name){
        this.roll = roll;
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}



public class Example {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student(14 , "adarsh");
        Student s1 = s; // shallow copy
        System.out.println("before");
        System.out.println(s1.name);
        System.out.println(s1.roll);

        System.out.println("after");
        s.name = "rai";
        s.roll = 25;
        System.out.println(s1.name);
        System.out.println(s1.roll);

        Student s3 = (Student) s.clone();



    }
}