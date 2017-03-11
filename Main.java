package Program;

public class Main {
    public static void main(String[] args) {
        class Inner implements ISetAndType {
            private String text = "Hello world!";

            public String getText() {
                return text;
            }

            @Override
            public void setText(String text) {
                this.text = text;
            }

            @Override
            public void typeText() {
                System.out.println(text);
            }
        }

        Inner obj = new Inner();

        System.out.println(obj.getText());
        System.out.println();

        obj.setText("Hello world again!");
        obj.typeText();
    }
}