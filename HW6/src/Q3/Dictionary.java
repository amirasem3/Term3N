package Q3;

import java.util.Scanner;

/**
 * AHAY
 * ASAY
 * Created by AmirHosein on 12/17/2017.
 */
public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandNumber = scanner.nextInt();
        DataStructure dataStructure = new DataStructure();
        for (int i = 0; i < commandNumber; i++) {
            String command = scanner.next();
            assignCommand(command, dataStructure);
            dataStructure.display();
        }
    }

    static void assignCommand(String command, DataStructure structure) {
        String flexibleCommand = null;
        if (command.charAt(0)=='s'){
            flexibleCommand = command.substring( 0 ,6);
//            System.out.println(flexibleCommand);
        }
        if (command.charAt(0)=='a'){
            flexibleCommand = command.substring(0 , 7);
        }
        if (flexibleCommand.equals("addWord")) {
            String newWord = command.substring(command.lastIndexOf("(") + 1, command.indexOf(")"));
//            System.out.println(newWord);
            structure.addWord(newWord);
        }
        if (flexibleCommand.equals("search")) {
            String searchWord = command.substring(command.lastIndexOf("(") + 1, command.indexOf(")"));
            System.out.println(searchWord);
            structure.search(searchWord);
        }
    }

}
