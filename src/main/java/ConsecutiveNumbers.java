import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String args[]) {
        String s = "";

        System.out.println("Enter the input numbers");
        Scanner scanner = new Scanner(System.in);

        s = scanner.next();

        String[] array = s.split(",");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        boolean result = true, check = true, check1 = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) == 1) {
                check = false;
            } else if ((arr[i + 1] - arr[i]) == -1) {
                check1 = false;
            } else {
                result = false;
                break;
            }
        }
        if (result && check == false && check1 == true)
            System.out.println(s + "are consecutive numbers");
        else if (result && check1 == false && check == true) {
            System.out.println(s + "are consecutive numbers");
        } else if (check == false && check1 == false) {
            System.out.println(s + "are non consecutive numbers");
        } else
            System.out.println(s + "are non consecutive numbers");
    }
}