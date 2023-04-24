import javax.crypto.spec.IvParameterSpec;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class ReaderandSum {


    private ReaderandSum() {

    }

    public static int[] read(String fileName) throws InvalidNumberException {
        int count = 0;
        int[] array = new int[] {};

        try {
            File file = new File(fileName);

            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine() && count < 10) {
                try {
                    int red = Integer.parseInt(scanner.nextLine());
                    if (red < 0) {
                        throw new InvalidNumberException("Number is negative");
                    }
                    else {
                        array = Arrays.copyOf(array, array.length + 1);
                        array[array.length-1] = red;
                        count++;
                    }
                }
                catch  (NumberFormatException | ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            }

            scanner.close();
        } catch (FileNotFoundException | InvalidNumberException e) {
            System.out.println(e.getMessage());
        }

        return array;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
