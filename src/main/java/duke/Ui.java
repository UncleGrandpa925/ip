package duke;

import java.util.List;

public class Ui {
    protected static String separatedLine;

    public static void greet() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println(separatedLine);
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you ?");
        System.out.println(separatedLine);
    }

    public static void addTask(List<Task> lst) {
        System.out.println(separatedLine);
        System.out.println("Got it. I've added this task: ");
        System.out.println(lst.get(lst.size() - 1));
        System.out.printf("Now you have %d tasks in the list.%n", lst.size());
        System.out.println(separatedLine);
    }

    public static void markDone(Task task) {
        System.out.println(separatedLine);
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(task);
        System.out.println(separatedLine);
    }

    public static void delete(Task task, List<Task> lst) {
        System.out.println(separatedLine);
        System.out.println("Noted. I've removed this task:");
        System.out.println(task);
        System.out.printf("Now you have %d tasks in the list.%n", lst.size());
        System.out.println(separatedLine);
    }


    public static void list(List<Task> lst) {
        System.out.println(separatedLine);
        System.out.println("Here are the tasks in your list:");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println((i + 1) + "." + lst.get(i));
        }
        System.out.println(separatedLine);
    }

    public static void exit() {
        System.out.println(separatedLine);
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println(separatedLine);
    }

    public static void init() {
        separatedLine = "-".repeat(30);
    }

    public static void printException(IllegalArgumentException e) {
        System.out.println(separatedLine);
        System.out.println(e.getMessage());
        System.out.println(separatedLine);
    }

}