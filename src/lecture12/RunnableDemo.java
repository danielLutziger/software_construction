package lecture12;

public class RunnableDemo {
    public static void main(String[] args){
        System.out.println("======Runnable========");
        Runnable r0 = new RunnableTeacher();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world one!");
            }
        };
        Runnable r2 = () -> System.out.println("Hello world 2!");

        r0.run();
        r1.run();
        r2.run();
    }
}
