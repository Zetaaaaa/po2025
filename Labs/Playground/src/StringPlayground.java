import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringPlayground {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("This is my playground!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        //Initalize class
        StringOperations stringOperations = new StringOperations(text);

        System.out.println("Print string normally: " + stringOperations.getText());
        System.out.println("Print string as int: " + stringOperations.getTextInt());

    }
}