package ilzira;

public class Cat {
String name;
int age;
int weight;
String color;
String street;
public Cat(String name){
    this.name = name;
}
public Cat (String name,int weight,int age){
    this.name = name;
    this.weight = weight;
    this.age = age;
}
public Cat (String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 19;
}
public Cat(int weight,String color){
    this.weight = weight;
    this.color = color;
    this.age = 4;
    this.name = null;
    this.street = null;
}

}
