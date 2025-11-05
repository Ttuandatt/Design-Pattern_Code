package Behavioural_Patterns.Command_Pattern;

public class WriteCommand implements Command {
    private TextEditor editor;
    private String words;

    public WriteCommand(TextEditor editor, String words) {
        this.editor = editor;
        this.words = words;
    }

    @Override
    public void execute() {
        editor.write(words);
    }

    @Override
    public void undo() {
        editor.delete(words.length());
    }
}
