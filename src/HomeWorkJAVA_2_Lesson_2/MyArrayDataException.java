package HomeWorkJAVA_2_Lesson_2;

public class MyArrayDataException extends RuntimeException{
    private int line;
    private int column;

    public MyArrayDataException(int line, int column) {
        this.line = line;
        this.column = column;
    }
}
