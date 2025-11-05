package Behavioural_Patterns.Command_Pattern;

public class main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        // Write "Hello"
        manager.executeCommand(new WriteCommand(editor, "Hello"));
        editor.show();

        // Write " World"
        manager.executeCommand(new WriteCommand(editor, " World"));
        editor.show();

        // Undo last write (Ctrl+Z)
        manager.undo();
        editor.show();

        // Redo last undone write (Ctrl+Y)
        manager.redo();
        editor.show();
    }
}
