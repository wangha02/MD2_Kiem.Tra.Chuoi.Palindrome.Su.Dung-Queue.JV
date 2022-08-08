import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "Able was I ere I saw Elba";
        String output="";
        Stack<String> myStack = new Stack<>();
        String[] myChar = input.split("");
        for (String c : myChar) {
            myStack.push(c);
        }
        System.out.println("My Queue:");
        System.out.println(myStack);
        while(myStack.isEmpty()){
            String popped = myStack.pop();
            output+=popped;
        }
        System.out.print(output);

    }
}