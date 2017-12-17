package Q2;

import java.util.Scanner;

/**
 * AHAY
 * ASAY
 * Created by AmirHosein on 12/17/2017.
 */
public class Median {
    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();
        Scanner scanner = new Scanner(System.in);
        int commandNumber = scanner.nextInt();
        for (int i = 0; i < commandNumber; i++) {
            String command = scanner.next();
            assignCommand(command, dataStructure);
        }
    }

    private static void assignCommand(String command, DataStructure structure) {
        String numbers;
        String command1 = command.substring(0, 6);
        if (command1.equals("addNum")) {
            numbers = command.replaceAll("[^0-9]", "");
            structure.addNumber(getNumber(numbers));
        }
        if (command.equals("findMedian()")) {
            structure.findMedian();
        }

    }

    private static int getNumber(String number) {
        return Integer.parseInt(number);
    }
}
