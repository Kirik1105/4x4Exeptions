public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    MyArrayDataException(int i, int j,String msg) {
        super(msg+i+" "+j);
        this.i = i;
        this.j = j;

    }
}
