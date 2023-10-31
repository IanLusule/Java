package com.bankTest;
class BankAccount {
    int acNo;
    String acName, acPhone, acEmail;
    double AcBal;

    public BankAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        this.acNo = acNo;
        this.acName = acName;
        this.acPhone = acPhone;
        this.acEmail = acEmail;
        this.AcBal = AcBal;
    }

    public void accountHolder() {
        System.out.println("Account Holder Number : " + acNo);
        System.out.println("Account Holder Name : " + acName);
        System.out.println("Account Holder Phone : " + acPhone);
        System.out.println("Account Holder Email : " + acEmail);
        System.out.println("Account Holder Balance : " + AcBal);
    }

    public void deposit(double amount) {
        AcBal += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void displayBalance() {
        System.out.println("Account Number: " + acNo + "Balance: $" + AcBal);
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        super(acNo, acName, acPhone, acEmail, AcBal);
    }
}


 class SavingsAccount extends BankAccount {
     public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
         super(acNo, acName, acPhone, acEmail, AcBal);
     }
 }

        public class Account {
            public static void main(String[] args) {
                // TODO Auto-generated method stub
                System.out.println("SAVINGS ACCOUNT DETAILS");
                SavingsAccount sac = new SavingsAccount(1001, "Ian Lusule", "0722000000", "IanTest@gmail.com", 1000);
                sac.deposit(500);
                //sac.displayBalance();
                sac.accountHolder();

                System.out.println("\nCURRENT ACCOUNT DETAILS");
                CurrentAccount cac = new CurrentAccount(2001, "Ian Lusule", "0711000000", "Ian Lusule", 500);
                cac.deposit(300);
                cac.accountHolder();

            }
        }

