package ua.com.java;

public class PetMaster {
    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.sey("Гав-гав");
        System.out.println(petReaction);
        myPet.sleep();
    }
}
