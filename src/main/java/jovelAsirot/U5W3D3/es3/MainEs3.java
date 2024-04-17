package jovelAsirot.U5W3D3.es3;

import jovelAsirot.U5W3D3.es3.entities.*;

import java.util.Scanner;

public class MainEs3 {
    public static void main(String[] args) {


//        Officer lieutenant = new Lieutenant(captain);
//        Officer captain = new Captain(major);
//        Officer major = new Major(colonel);
//        Officer colonel = new Colonel(general);
//        Officer general = new General(null);

        Scanner sc = new Scanner(System.in);

        int userInput;
        do {
            System.out.println("1 - Insert the amount");
            System.out.println("0 - To exit");

            Officer general = new General(null);
            Officer colonel = new Colonel(general);
            Officer major = new Major(colonel);
            Officer captain = new Captain(major);
            Officer lieutenant = new Lieutenant(captain);

            userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Insert the amount you want to check.");
                    int amountToCheck = sc.nextInt();
                    lieutenant.handleRequest(amountToCheck);
                    break;
                case 0:
                    System.out.println("Terminating the program.");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }


        } while (userInput != 0);


        sc.close();
    }
}
