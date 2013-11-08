package ua.com.java;

public class Fish extends Pet{
    int currentDepth = 0;
    public int dive(int howDepth){
        currentDepth = currentDepth + howDepth;
        if (currentDepth >100){
            System.out.println("Ти що офігів, сам ниряй на таку глибину, я боюсь");
            currentDepth =currentDepth -howDepth;
        } else{
            System.out.println("Ниряю на глубину " +howDepth +" метри");
            System.out.println("Я на глубині " +currentDepth +" метри");
        }
        return currentDepth;
    }
}
