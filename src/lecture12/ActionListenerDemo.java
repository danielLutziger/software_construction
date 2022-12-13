package lecture12;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ActionListenerDemo {

    public static void main(String[] args){
        JButton testButton = new JButton("name");
        testButton.setBackground(Color.RED);
        testButton.setOpaque(true);
        testButton.addActionListener(e -> System.out.println("perform when clicked"));
        JFrame f = new JFrame("Frame");
        f.add(testButton);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public ActionListenerDemo(){
        // lambdas with maps and stuff, some crazy shit
        ArrayList<String> persons = new ArrayList<>();
        for(String person : persons){
            if(person == "some check"){
                System.out.println("call a method");
            }
        }
    }
    public void getDraftees(){
        ArrayList<String> persons = new ArrayList<>();
        for(String person : persons){
            if(person == "some check"){
                System.out.println("call a method");
            }
        }
    }

    public void getMailees(){
        ArrayList<String> persons = new ArrayList<>();
        for(String person : persons){
            if(person == "some check similar to 1"){
                System.out.println("call a method");
            }
        }
    }

    /**
     * replace the methods above with something like this
     */
    public void getBetterMailees(){
        ArrayList<String> persons = new ArrayList<>();
        for(String person : persons){
            if(doSomeCheckWithPerson(person)){
                System.out.println("call a method");
            }
        }
    }

    private boolean doSomeCheckWithPerson(String person) {
        return person == "add the check here";
    }
}
