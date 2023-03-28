package task2;

public enum Operator {
    PLUS(" + "),
    EQUAL(" = "),

    MINUS(" - "),
    MULTIPLY(" * "),
    DIVIDE(" / ");

    private String title;

    Operator(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
