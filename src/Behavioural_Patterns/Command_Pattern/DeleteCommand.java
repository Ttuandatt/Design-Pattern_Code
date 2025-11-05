package Behavioural_Patterns.Command_Pattern;

public class DeleteCommand implements Command{
    private TextEditor editor;
    private String deletedText = "";
    private int count;

    public DeleteCommand(TextEditor editor, int count) {
        this.editor = editor;
        this.count = count;
    }

    @Override
    public void execute() {
        String current = editor.getText();
        int start = Math.max(0, current.length() - count);
        deletedText = current.substring(start);
        editor.delete(count);
    }

    @Override
    public void undo() {
        editor.write(deletedText);
    }
}
