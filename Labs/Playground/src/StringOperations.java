
public class StringOperations {
    private String text;

    public StringOperations(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getTextInt() {
        try {
            int value = Integer.parseInt(text);
            return String.valueOf(value);
        } catch (NumberFormatException e) {
            System.out.println("#####Impossible to parse as string##########");
            throw new IllegalArgumentException("Invalid integer string: " + text, e);

        }
    }
}
