/**
 * Created by pwatson on 10/16/15.
 */
public class ConsumerData {

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
            score = score - 3;
        }
        if(tHI < 20800 ) {
            score = score -2;
        }
        if((disposable /mhi) < .15) {
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

        //Must be declared where actioned
        Integer lor = Integer.parseInt(residence);
        Integer loe = Integer.parseInt(lengthofEm);
        Integer ficoYears = Integer.parseInt(ficoYrs);

        if(lor < 3) {
            score = score -1;
        }else if(lor < 2) {
            score = score - 2;
        }else{
            score = score - 3;
        }
        if(loe < 3) {
            score = score -1;
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
    public void willingNessToPay(){

        //Must be declared where actioned
        Integer fico = Integer.parseInt(ficScore);

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
