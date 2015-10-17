import java.util.Scanner;

/**
 * Created by pwatson on 10/16/15.
 */
public class ConsumerData {

<<<<<<< HEAD
    String social;
    String residence;
    String lengthofEm;
    String rentBuyOwn;
    double tHI = 0;
    String houseInc;
    String houseDis;
    String monthlyInc;
    String monthlyDis;
    double disposable = 0;
    String col;
    String cap;
    String loan;
    String ficScore;
    String ficoYrs;
    int score = 30;
    String employed;

    public void setEmployed(String employed) {
        this.employed = employed;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public void setLor(String residence) {
        this.residence = residence;
    }

    public void setLoe(String lengthofEm) {
        this.lengthofEm = lengthofEm;
    }

    public void setRentBuyOwn(String rentBuyOwn) {
        this.rentBuyOwn = rentBuyOwn;
    }

    public void settHI(String houseInc) {
        this.houseInc = houseInc;
    }

    public void settHD(String houseDis) {
        this.houseDis = houseDis;
    }

    public void setMhi(String monthlyInc) {
        this.monthlyInc = monthlyInc;
    }

    public void setMdi(String monthlyDis) {
        this.monthlyDis = monthlyDis;
    }

    public void setDisposable(String disposable) {
        this.disposable = Double.parseDouble(disposable);
    }

    public void setCollateral(String col) {
        this.col = col;
    }

    public void setCapital(String cap) {
        this.cap = cap;
    }

    public void setLoanAmt(String loan) {
        this.loan = loan;
    }

    public void setFico(String ficScore) {
        this.ficScore = ficScore;
    }


    public void setFicoYears(String ficoYrs) {
        this.ficoYrs = ficoYrs;
    }

    public int getScore(){
        return score;
    }


    public void ability() {

        //Must be declared where they are actioned
        Double mhi = Double.parseDouble(monthlyInc);
        Integer collateral = Integer.parseInt(col);
        Integer capital = Integer.parseInt(cap);
        Double loanAmt = Double.parseDouble(loan);

        if(employed.equals("Y")) {
=======
    boolean employed = true;

    public void setEmployed(String employed) {
        this.employed = employed;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public void setLor(int lor) {
        this.lor = lor;
    }

    public void setLoe(int loe) {
        this.loe = loe;
    }

    public void setRentBuyOwn(String rentBuyOwn) {
        this.rentBuyOwn = rentBuyOwn;
    }

    public void setHousingExpense(double housingExpense) {
        this.housingExpense = housingExpense;
    }

    public void settHI(double tHI) {
        this.tHI = tHI;
    }

    public void settHD(double tHD) {
        this.tHD = tHD;
    }

    public void setMhi(double mhi) {
        this.mhi = mhi;
    }

    public void setMdi(double mdi) {
        this.mdi = mdi;
    }

    public void setDisposabe(double disposabe) {
        this.disposabe = disposabe;
    }

    public void setCollateral(double collateral) {
        this.collateral = collateral;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setLoanAmt(double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public void setFico(int fico) {
        this.fico = fico;
    }

    public void setFicoYears(int ficoYears) {
        this.ficoYears = ficoYears;
    }

    public void setScore(int score) {
        this.score = score;
    }

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
>>>>>>> ec771a0198e98360203621fc1260a7ef9483cf3e
            score = score - 3;
        }
        if(tHI < 20800 ) {
            score = score -2;
        }
<<<<<<< HEAD
        if((disposable /mhi) < .15) {
=======
        if((disposabe/mhi) < .15) {
>>>>>>> ec771a0198e98360203621fc1260a7ef9483cf3e
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

<<<<<<< HEAD
        //Must be declared where actioned
        Integer lor = Integer.parseInt(residence);
        Integer loe = Integer.parseInt(lengthofEm);
        Integer ficoYears = Integer.parseInt(ficoYrs);

        if(lor < 3) {
            score = score -1;
=======
        if(lor < 3) {
            score = score = -1;
>>>>>>> ec771a0198e98360203621fc1260a7ef9483cf3e
        }else if(lor < 2) {
            score = score - 2;
        }else{
            score = score - 3;
        }
        if(loe < 3) {
<<<<<<< HEAD
            score = score -1;
=======
            score = score = -1;
>>>>>>> ec771a0198e98360203621fc1260a7ef9483cf3e
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
<<<<<<< HEAD
    public void willingNessToPay(){

        //Must be declared where actioned
        Integer fico = Integer.parseInt(ficScore);

=======
    public void WillingNessToPay(){
>>>>>>> ec771a0198e98360203621fc1260a7ef9483cf3e
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
<<<<<<< HEAD

    public void disposable() {

        //Call where actioned
        Double tHD = Double.parseDouble(houseDis);

        //Declare this type of variable
        Double mdi;
        Double mhi;

        mhi=(((tHI/52)*4)*.64);
        mdi=((tHD/52)*4);
        disposable = (mhi-mdi)/mhi;
    }

}

=======

    public void disposable() {
        mhi=(((tHI/52)*4)*.64);
        mdi=((tHD/52)*4);
        disposabe = (mhi-mdi)/mhi;
    }
}
>>>>>>> ec771a0198e98360203621fc1260a7ef9483cf3e
