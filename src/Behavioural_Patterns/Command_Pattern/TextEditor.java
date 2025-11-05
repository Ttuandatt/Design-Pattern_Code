/* RECEIVER */
package Behavioural_Patterns.Command_Pattern;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String s){
        text.append(s);
    }

    public void delete(int count){
        int start = Math.max(0, text.length()-count);
        text.delete(start, text.length());
    }

    public String getText(){
        return text.toString();
    }

    public void show(){
        System.out.println("Current Text: " + text.toString());
    }
}

/*
    Method explanations:
    - write(String s): Appends the given string 's' to the current text in the editor.
    - delete(int count): Deletes the last 'count' characters from the current text. Example, if the text is "Hello World" and count is 5, then text.length() = 11, start = Math.max(0, 11 - 5) = 6, text.delete(6, 11); → xóa từ ký tự thứ 6 đến hết → "Hello "
*/
