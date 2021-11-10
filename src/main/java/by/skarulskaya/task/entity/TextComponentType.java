package by.skarulskaya.task.entity;

public enum TextComponentType {
    TEXT("\n"),
    PARAGRAPH(" "),
    SENTENCE(" "), // todo добавить знаки препинания, кстати многоточие это один символ
    WORD(""),
    SYMBOL("");

    private final String delimiter;

    TextComponentType(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter(){
        return delimiter;
    }
}
