public class Person {
   private String name;
   private int age; //etc
   private double height;
   private double weight;

    public Person(String name, int age, double height, double weight){
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void GrowOlder(){
        age ++;
        height --;
        weight = weight - 0.5;
    }


    //public String toString() {
        //return "Name: " + name + ", Age: " + age + ", Height: " + height + " cm, Weight: " + weight + " kg";}
}