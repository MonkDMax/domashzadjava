public class SimCard {
    protected String num, provaider;
    protected int balance;

    public void setNum(String num) {
        this.num = num;
    }
    public String getNum() {
        return this.num;
    }

    public void setProvaider(String provaider) {
        this.provaider = provaider;
    }
    public String getProvaider() {
        return this.provaider;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }
}
