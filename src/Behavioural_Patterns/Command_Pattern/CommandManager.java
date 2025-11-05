/* INVOKER */
package Behavioural_Patterns.Command_Pattern;

import java.util.Stack;

public class CommandManager {
    private Stack<Command> history = new Stack<>();
    private Stack<Command> redo = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
        redo.clear(); // Clear redo stack on new command execution
    }

    public void undo(){
        if(!history.isEmpty()){
            Command command = history.pop();
            command.undo();
            redo.push(command);
        }else{
            System.out.println("No commands to undo.");
        }
    }

    public void redo(){
        if (!redo.isEmpty()) {
            Command command = redo.pop();
            command.execute();
            history.push(command);
        }else {
            System.out.println("No commands to redo.");
        }
    }
}
