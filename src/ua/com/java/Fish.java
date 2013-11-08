package ua.com.java;

public class Fish extends Pet{
    int currentDepth = 0;
    public int dive(int howDepth){
        currentDepth = currentDepth + howDepth;
        System.out.println("Ниряю на глубину " +howDepth +" метри");
        System.out.println("Я на глубині " +currentDepth +" метри");
        return currentDepth;
    }
}
