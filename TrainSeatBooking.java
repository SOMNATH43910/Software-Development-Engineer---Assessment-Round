import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainSeatBooking {

    // Ek 2D array banate hain jo seats ka status dikhayega
    // 1-11 rows mein 7 seats hain aur 12th row mein 3 seats hain
    private static final int[][] seats = new int[12][];

    // Array initialize karte hain (0 ka matlab seat khali hai, 1 ka matlab seat reserved hai)
    static {
        for (int i = 0; i < 11; i++) {
            seats[i] = new int[7];  // 7 seats rows 1 se 11 mein
        }
        seats[11] = new int[3];      // Last row mein sirf 3 seats hain
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Sab seats ka current status print karo
            printSeatStatus();

            // User se kitni seats chahiye poochho
            System.out.print("Kitni seats chahiye (1-7)? ");
            int numSeats = scanner.nextInt();

            // Invalid input check karo
            if (numSeats < 1 || numSeats > 7) {
                System.out.println("Galat number of seats. Kripya 1 se 7 ke beech chunein.");
                continue;
            }

            // Seats reserve karne ki koshish karo
            List<String> bookedSeats = reserveSeats(numSeats);
            if (bookedSeats.isEmpty()) {
                System.out.println("Itni seats available nahi hain.");
                break;  // Agar aur seats available nahi hain toh booking khatam karo
            } else {
                System.out.println("Book ki gayi seats: " + bookedSeats);
            }

            // Check karo agar puri coach full ho gayi hai toh
            if (isCoachFull()) {
                System.out.println("Saari seats book ho chuki hain. Coach full hai!");
                break;
            }
        }

        scanner.close();
    }

    // Function jo sab seats ka current status print karega
    private static void printSeatStatus() {
        System.out.println("Current seat status (0 = available, 1 = reserved):");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function jo seats reserve karega
    private static List<String> reserveSeats(int numSeats) {
        List<String> bookedSeats = new ArrayList<>();

        // Sabse pehle ek row mein seats dhundho
        for (int i = 0; i < seats.length; i++) {
            int availableSeats = 0;
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    availableSeats++;
                } else {
                    availableSeats = 0;  // Agar beech mein ek bhi reserved seat milti hai toh reset kar do
                }
                if (availableSeats == numSeats) {
                    // Seats reserve karo is row mein
                    for (int k = j - numSeats + 1; k <= j; k++) {
                        seats[i][k] = 1;
                        bookedSeats.add("Row " + (i + 1) + " Seat " + (k + 1));
                    }
                    return bookedSeats;
                }
            }
        }

        // Agar ek row mein puri seats nahi milti, toh aas-paas ki seats dhundo
        for (int i = 0; i < seats.length && numSeats > 0; i++) {
            for (int j = 0; j < seats[i].length && numSeats > 0; j++) {
                if (seats[i][j] == 0) {
                    seats[i][j] = 1;
                    bookedSeats.add("Row " + (i + 1) + " Seat " + (j + 1));
                    numSeats--;
                }
            }
        }

        return bookedSeats;
    }

    // Function jo check karega ki coach full hai ya nahi
    private static boolean isCoachFull() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    return false;  // Agar koi seat khali hai, toh coach full nahi hai
                }
            }
        }
        return true;  // Saari seats full hain
    }
}
