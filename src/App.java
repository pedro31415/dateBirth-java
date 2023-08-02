import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner scan  = new Scanner(System.in);  
        System.out.println("Please provide your date of birth!");
        System.out.println("Inform the year of birth(YYYY): ");
        int year = scan.nextInt();
        System.out.println("Inform your month of birth(MM): ");
        int month = scan.nextInt();
        System.out.println("Inform the day of bitrh(DD): ");
        int day = scan.nextInt();
        timePeriod(year, month, day);
        scan.close();    
    }

    public static void clearScreen() throws IOException, InterruptedException {
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   }

   public static void timePeriod(int year, int month, int day){
       LocalDate dateBirth = LocalDate.of(year, month, day);
        LocalDate dayNow = LocalDate.now();
        long timePeriod1 = ChronoUnit.DAYS.between(dateBirth, dayNow);
        System.out.println("Este é o período de tempo: " + timePeriod1);
   } 
}
