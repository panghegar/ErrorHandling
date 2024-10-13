import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        String[] errorMessage = {
                "Container descent rate failure",
                "Science Payload position failure",
                "Container position failure",
                "Science Payload descent rate failure",
                "Release failure"
        };

        Scanner scanner = new Scanner(System.in);
        int errorCode = scanner.nextInt();

        int[] binaryBit = new int[5];

        int index = 0;
        while (errorCode > 0 && index < 5) {
            binaryBit[index] = errorCode % 2;
            errorCode = errorCode / 2;
            index++;
        }

        boolean noError = true;

        for (int i = 0; i < 5; i++) {
            if (binaryBit[i] == 1) {
                System.out.println(errorMessage[i]);
                noError = false;
            }
        }

        if (noError) {
            System.out.println("No error");
        }

        scanner.close();
    }
}
