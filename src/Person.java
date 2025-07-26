public class Person {
    String name;
    int age;
    float height;
    int weight;
    Person (String name , int age){
        this.name = name;
        this.age = age;
    }
    Person(){
        weight =50;
        height = 5.3f;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public static void main(String[]args){
        Person obj1 = new Person("Prinkal" , 22);
        obj1.setWeight(55);
        obj1.getWeight();
    }
}


