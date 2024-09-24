import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class arrayclasspractice {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome TO aRRAYLIST Practice!");
        // create an arraylist of strings
        ArrayList<String> Mylistofstrings = new ArrayList<>();
        // add a few elements to my ArrayList
        Mylistofstrings.add("first");
        Mylistofstrings.add("SECOND");
        Mylistofstrings.add("Third");
        // output our arrray list
        System.out.println("\n mylistofstrings is"+ Mylistofstrings);
        // REMOVE AN ELEMENT.
        Mylistofstrings. remove(2);
        System.out.println("\n after removing...");
        System.out.println("mylistofstrings is:"+ Mylistofstrings);

        String toAdd = "";

        for (int i = 0; i<10; i++) {
            toAdd=toAdd + "adding..." + Integer.toString(i);
            Mylistofstrings.add(toAdd);

        }
        System.out.println("\n after adding bunch of stuff... ");
        System.out.println("\n mylistofstrings is :"+ Mylistofstrings);

        for (int i = 0; i<Mylistofstrings.size(); i++) {
            System.out.println("AN ELEMENT IN MY LIST IS : " + Mylistofstrings.get(i));
        }

    }
}