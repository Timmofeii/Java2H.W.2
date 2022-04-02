public class MyArrayDataException extends Exception {
    public int i,j;
    public MyArrayDataException( int i, int j) {
        super("Invalid array value: " + i + "x" + j);
        this.j=j;
        this.i=i;

    }
}
