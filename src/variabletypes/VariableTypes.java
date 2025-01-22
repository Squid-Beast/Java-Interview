package variabletypes;

public class VariableTypes {
    static int x = 20;
    int y = 50; // instance variable
    public static void main(String[] args) {
        int sum = x + 10;
        System.out.println("Sum: " + sum);
        System.out.println("Static variable: " + x);
    }
}
