import java.util.Scanner;

/**
 * Created by pwatson on 10/16/15.
 */
public class App {
    private static Scanner scanner = new Scanner(System.in);
    ConsumerData consumerData;

    public App() {
        consumerData = new ConsumerData();
        personInput();
        consumerData.ability();
        consumerData.stability();
        consumerData.willingNessToPay();
        consumerData.disposable();
        compare();

    }

    public void personInput() {
        Person person = new Person();

        System.out.println("Please enter your name.");
        person.setName(scanner.nextLine());

        System.out.println("Please enter Date of birth in date format.");
        person.setDOB(scanner.nextLine());

        System.out.println("Are you married? Please enter y or n for yes or no.");
        person.setMarital(scanner.nextLine());

        System.out.println("Please enter your Social Security Number.");
        consumerData.setSocial(scanner.nextLine());

        System.out.println("Please enter your address.");
        person.setAddress(scanner.nextLine());

        System.out.println("Please enter the length of your current residence.");
        consumerData.setLor(scanner.nextLine());

        System.out.println("Please enter your totaled household income.");
        consumerData.settHI(scanner.nextLine());

        System.out.println("Please enter your current profession.");
        consumerData.setEmployed(scanner.nextLine());

        System.out.println("Please enter your total monthly disposable income.");
        consumerData.setMdi(scanner.nextLine());

        System.out.println("Please enter your disposable income.");
        consumerData.setDisposable(scanner.nextLine());

        System.out.println("Please enter the amount of your loan request.");
        consumerData.setLoanAmt(scanner.nextLine());

        System.out.println("Please enter your rent per month.");
        consumerData.setRentBuyOwn(scanner.nextLine());

        System.out.println("Please enter the length of you current employment (in years).");
        consumerData.setLoe(scanner.nextLine());

        System.out.println("Please enter your annual household income.");
        consumerData.settHD(scanner.nextLine());

        System.out.println("Please enter your FICO score.");
        consumerData.setFico(scanner.nextLine());

        System.out.println("Please enter the number of months you have had outstanding credit.");
        consumerData.setFicoYears(scanner.nextLine());

        System.out.println("Please enter your total household debt.");
        consumerData.settHD(scanner.nextLine());

        System.out.println("Please enter your amount of collateral");
        consumerData.setCollateral(scanner.nextLine());

        System.out.println("Please enter your amount of capital");
        consumerData.setCapital(scanner.nextLine());

        System.out.println("Please enter your amount of monthly income");
        consumerData.setMhi(scanner.nextLine());
    }

    public void compare(){

        if (consumerData.getScore() >= 20) {
            System.out.println("Your loan has been approved! Congratulations!");
        } else {
            System.out.println("No loan for you!");
        }

    }



    public static void main(String[] args) {
        App app = new App();


    }


}
