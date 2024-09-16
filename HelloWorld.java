public class HelloWorld {
    private String greeting;

    // Default constructor
    public HelloWorld() {
        this.greeting = "Hello, World!";
    }

    // Constructor with a custom greeting parameter
    public HelloWorld(String customGreeting) {
        this.greeting = customGreeting;
    }

    // Method to print the greeting
    public void greet() {
        System.out.println(greeting);
    }

    public static void main(String args[]) {
        // Using the default greeting
        HelloWorld helloDefault = new HelloWorld();
        helloDefault.greet(); 

        // Using a custom greeting
        HelloWorld helloCustomized = new HelloWorld("Hello, Java!");
        helloCustomized.greet(); 
    }
}