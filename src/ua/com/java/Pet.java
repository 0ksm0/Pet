package ua.com.java;


public class Pet {
    int age;
    float weight;
    String color;

    public void sleep(){                                             // метод нічого не повертає void
        System.out.println("Спокійної ночі, до завтра");
    }
    public void eat(){                                              // метод нічого не повертає void
        System.out.println("Я дуже голодний, давай перекусимо");
    }
    public String sey(String word){                                 // метод повертає текст String
        String response = "Ну і ладно !!" +word;
        return response;
    }
}
