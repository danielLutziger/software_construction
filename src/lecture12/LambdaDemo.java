package lecture12;
/**
 *
 *
 *  only surface level information and knowledge is required for the exam
 *
 *
 */




/**
 * interface can only have one function for functional methods to work
 */
@FunctionalInterface
interface Printable{
    //void print(String prefix);
    String print(String prefix);
}

public class LambdaDemo{
        public static void main(String[] args){
            //lambda demo
            Teacher t = new Teacher();
            //printIt(t); //method that expects an interface

            //printIt((prefix) -> {System.out.println(prefix + " Teaching teaching");});
            //printIt((prefix) -> System.out.println(prefix + "Teaching teaching 1"));

            Printable p = (pr) ->
                /*System.out.println("Start");
                System.out.println(pr + " Teaching teaching 2");
                System.out.println("End");*/
                pr + " soemthing special";
            //;
            printIt(p);
            printIt((pr) -> pr + "something special");

        }

        static void printIt(Printable printable){
            String prefix = "sombody says: ";
            printable.print(prefix);
        }
}

class Teacher implements Printable{
    private String name;
    private int age;

    public Teacher(){

    }

    @Override
    public String print(String pre){
        return pre + ": Teaaching teaching!";
    }
}
