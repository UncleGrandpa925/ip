/*input
list
bye
*/
package duke;

/**
 * The main driver of the program
 */
public class Duke {
    /**
     * The entry point to the program
     */
    private final TaskList taskList;
    private final Parser parser;

    public Duke() {
        taskList = new TaskList();
        Ui.init();
        Ui.greet();
        parser = new Parser(taskList);
    }

    public String getResponse(String input) {
        return parser.run(input);
    }
}
