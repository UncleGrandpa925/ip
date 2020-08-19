/*input
read book
return book
list
bye
*/
import java.util.*;

public class Duke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GreetExit greetExit = new GreetExit();
        TodoManager todoManager = new TodoManager();
        Helper.init();
        greetExit.greet();
        while (in.hasNextLine()) {
            String command = in.nextLine();
            if (command.equals("bye")) {
                greetExit.exit();
                break;
            } else if (command.equals("list")) {
                todoManager.listEvent();
            } else {
                todoManager.addEvent(command);
            }
        }
    }
}
