package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        String FirstName = m.getFirstName(); 
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        System.out.println(FirstName);
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        return new StringBuilder(message).reverse().toString();
    }
    public String getFirstName() {
        return "Oliver";
    }
}