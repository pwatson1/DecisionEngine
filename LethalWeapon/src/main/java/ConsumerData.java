import java.util.Scanner;

/**
 * Created by pwatson on 10/16/15.
 */
public class ConsumerData {

    boolean employed = true;
    String social;
    int lor = 0;
    int loe = 0;
    char rentBuyOwn;
    double housingExpense = 0;
    double tHI = 0;
    double tHD = 0;
    double mhi = 0;
    double mdi = 0;
    double disposabe = 0;
    double collateral = 0;
    double capital = 0;
    double loanAmt = 0;
    int fico = 0;
    int ficoYears = 0;
    int score = 30;

    private static Scanner scanner = new Scanner(System.in);

    public void ability() {
        if(employed == true) {
            score = score - 3;
        }
        if(tHI < 20800 ) {
            score = score -2;
        }
        if((disposabe/mhi) < .15) {
            score = score -3;
        }
        if(!(collateral/loanAmt >= 3)) {
            score = score - 1;
        }
        if((!(capital/loanAmt >= 3))) {
            score = score - 1;
        }
    }

    public void stability() {

    if(lor < 3) {
        score = score = -1;
    }else if(lor < 2) {
        score = score - 2;
    }else{
        score = score - 3;
    }
        if(loe < 3) {
            score = score = -1;
        }else if(loe < 2) {
            score = score - 2;
        }else{
            score = score - 3;
        }
        if(ficoYears < 24) {
            score = score - 1;
        }else if(ficoYears < 18) {
            score = score - 2;
        }else if(ficoYears < 12) {
            score = score - 3;
        }
        else{
            score = score - 4;
        }
    }
    public void WillingNessToPay(){
        if(fico>690){
            score -=2;
        }else if(fico<=690 && fico>650){
            score-=4;
        }else if(fico<=650 && fico>600){
            score -=8;
        }else if(fico<600){
            score -=10;
        }

       }

    public void disposable() {
        mhi=(((tHI/52)*4)*.64);
        mdi=((tHD/52)*4);
         disposabe = (mhi-mdi)/mhi;
            }
        }


