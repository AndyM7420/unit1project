import java.util.Scanner;
        public class unit1project {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double noTaxBill;
        double tipPercentage;
        double tipAmount;
        double totalTipAmount;
        int partyAmount;
        double totalBill;
        double personTip;
        double  eachPersonAmount;
        System.out.println("");
        System.out.println("Hello User! Please input the bill amount, tip percentage as a whole number, and the number of people in the party ");
        noTaxBill = s.nextDouble();
        tipPercentage = s.nextDouble();
        partyAmount = s.nextInt();
        tipAmount = tipPercentage/100.0;
        totalTipAmount = (noTaxBill*tipAmount);
        totalBill = totalTipAmount + noTaxBill;
        personTip = totalTipAmount/partyAmount;
        personTip = Math.round(personTip*100)/100.0;
        totalTipAmount = Math.round(totalTipAmount*100)/100.0;
        eachPersonAmount = totalBill/partyAmount;
        eachPersonAmount = Math.round(eachPersonAmount*100)/100.0;
        System.out.print("Thank you. Your total tip amount is  $" + totalTipAmount + " Your total bill with tip is:  $" + totalBill + " Each person must pay  $" + personTip+ " each for tip. The total per person is: $" + eachPersonAmount);

    }
}
