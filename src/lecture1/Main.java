package lecture1;

public class Main {
    public static void main(String[] args) {
        System.out.println(eat("apple"));
    }

    static String eat(String item) {
        return String.format("I ate a %s, and it was delicious!",item); 
    }
}