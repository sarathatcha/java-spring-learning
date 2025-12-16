import src.main.java.com.learning.day01.Person;

public static void main(String[] args){
    Person p1 = new Person();
    Person p2 = new Person();

    p1.name = "Sarath";
    p1.age = 35;
    p2.name = "Ved";
    p2.age = 4;

    System.out.println(p1.name+ " " +p1.age);
    System.out.println(p2.name+ " " +p2.age);
}
