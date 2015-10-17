import java.util.Scanner;
/**
 * Created by pwatson on 10/16/15.
 */
public class App {
    int score = 30;
    private static Scanner scanner = new Scanner(System.in);

    public void personInput() {
        Person person = new Person();
        ConsumerData consumerData = new ConsumerData();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name.");
        person.setName(scanner.nextLine());
        System.out.println("Please enter Date of birth in date format.");
        person.setDOB(scanner.nextLine());
        System.out.println("Are you married? Please enter y or n for yes or no.");
        person.setMarital (scanner.nextLine());
        System.out.println("Please enter your address.");
        person.setAddress(scanner.nextLine());
        System.out.println("Please enter the length of your current residence.");
        String residence = scanner.nextLine();
        consumerData.setLor(Integer.parseInt(residence));
        System.out.println("Please enter your rent per month.");
        consumerData.setRentBuyOwn(scanner.nextLine());
        System.out.println("Please enter the length of you current employment (in years).");
        consumerData.setEmployed(scanner.nextLine());
        int loe = Integer.parseInt(employment);
        System.out.println("Please enter your annual household income.");
        String income = scanner.nextLine();
        double tHI = Double.parseDouble(income);
        System.out.println("Please enter your FICO score.");
        String fcoscr = scanner.nextLine();
        int fico = Integer.parseInt(fcoscr);
        System.out.println("Please enter the number of months you have had outstanding credit.");
        String fcyrs = scanner.nextLine();
        int ficoYears = Integer.parseInt(fcyrs);
        System.out.println("Please enter your total household debt.");
        String expense = scanner.nextLine();
        double tHD = Double.parseDouble(expense);
        System.out.println("Please enter your amount of collateral");
        String col = scanner.nextLine();
        double collateral = Double.parseDouble(col);
        System.out.println("Please enter your amount of capital");
        String cap = scanner.nextLine();
        double capital = Double.parseDouble(cap);
    }
    public static void main(String[] args) {
        Person person = new Person();
        ConsumerData consumerData = new ConsumerData();
        App app = new App();
        app.personInput();


        if (app.score > 20) {
            System.out.println("Your loan has been approved! Congratulations!");
        }
    }
}
