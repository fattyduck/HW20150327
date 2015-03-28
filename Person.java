/**
 * Created by fattyduck on 3/27/15.
 * This assignment is to: 1. add private fields name, phone number, along with getter setter
 * 2. Write a function called checkSameCity and register child
 */

public class Person {

    String name, city;
    int age, pNumber;


    public Person(String name, String city, int age) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    private Person(String name, int pNumber) {
        this.name = name;
        this.pNumber=pNumber;

    }
    private void setNumber(int pNumber){
        this.pNumber=pNumber;
    }
    private int getNumber(){
        return this.pNumber;
    }


    private void setName(String newName) {
        this.name = newName;
    }

    private String getName() {
        return this.name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public void setCity(String newCity){
        this.city = newCity;
    }
    public String getCity(){
        return this.city;
    }

    public static boolean checkSameCity(String city1, String city2){
        if(city1.equalsIgnoreCase(city2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){

        Person allan = new Person ("pig", "brooklyn", 21);
        Person dison = new Person ("duck", "brooklyn", 24);
        allan.setNumber(2123223222);
        System.out.println(allan.getNumber());
       // System.out.println(checkSameCity(allan.getCity(), dison.getCity()));
       // System.out.println(allan.getNumber());

    }
}