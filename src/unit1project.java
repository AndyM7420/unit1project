import java.util.Scanner;
public class unit1project {
    public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     Double noTaxBill;
     Double tipPercentage;
     Double tipAmount;
     Double totalTipAmount;
     int partyAmount;
     Double totalBill;
     Double personTip;
     Double  eachPersonAmount;
     System.out.println("");
        System.out.println("Hello User! Please input the bill amount, tip percentage as a whole number, and the number of people in the party ");
        noTaxBill = s.nextDouble();
        tipPercentage = s.nextDouble();
        partyAmount = s.nextInt();
        tipAmount = tipPercentage/100;
        totalTipAmount = (noTaxBill*tipAmount);
        totalBill = totalTipAmount + noTaxBill;
        personTip = totalTipAmount/partyAmount;
        eachPersonAmount = totalBill/partyAmount;
        eachPersonAmount = Double.valueOf(Math.round(eachPersonAmount*100)/100);
        System.out.print("Thank you. Your total tip amount is " + totalTipAmount + " Your total bill with tip is: " + totalBill + " Each person must pay " + personTip+ " each for tip. The total per person is: " + eachPersonAmount);




    }
}
