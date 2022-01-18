package HomeWorkJAVA_2_Lesson_2;

public class MainApp {
    public static void main(String[] args) {
        String[][] arr1 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"0", "0", "0", "0"}};
        sum(arr1);
        try {
            System.out.println(sum(arr1));
        } catch (MyArraySizeException e) {
            throw new MyArraySizeException();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
    public static int sum(String[][] a) {
        int sum = 0;
        if (a.length != 4) {
            throw new MyArraySizeException();
        }
        for (int j = 0; j < 4; j++) {
            if (a[j].length != 4) {
                throw new MyArraySizeException();
            }
            for (int k = 0; k < 4; k++) {
                try {
                    sum += Integer.parseInt(a[j][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(j, k);
                }
            }
        }
        return sum;
    }


}
