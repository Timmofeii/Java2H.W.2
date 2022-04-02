public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arr = new String[][]{
                {"2", "2", "3", "4"},
                {"2", "2", "2", "3"},
                {"1", "2", "2", "2"},
                {"2", "2", "2", "three"}
        };
        try {
            try {
                int result = assertDimensions(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int assertDimensions(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);

                }
            }
        }
        return count;

    }
}







