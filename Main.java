public class Main{
    public static void main(String [] args){
        Animal myDog = new Dog("Chloe", 12, "Maltes");

        System.out.println("My dog name is: " + myDog.getName()
                + ", it's age is: " + myDog.getAge()
                + ", it's race is: " + myDog.getRace()
                + " and sound is: " + myDog.SoundAnimal());
    }
}