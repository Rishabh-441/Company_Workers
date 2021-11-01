/*
Q2. At GLA College of  Programming, the final school fees to be paid is calculated as follows.
•	Original Fees should be greater than or equal to R50 000
•	Minimum fixed deposit of R10 000
•	If a deposit is greater than pr equal to half the original fees, you get a 5% discount from the original fees
•	Final total fees will also include the following
1.	School Levy is 10% of original fees
2.	Sports fee is 5% of the original fees.
Write a program the calculates the final total fees to be paid.

Program must request user to enter original fees value greater than R50 000.
Program should also request user to enter amount to deposit before calculating final total fees.
 */

import java.util.Scanner;

public class ClgFees {
    float fD = 10_000.0f;
    float s_Levy = 10.0f;
    float s_Fees = 5.0f;
    float Fees;
    float dis = 0;

    public ClgFees(float o_Fees, float fD) {

        if (fD >= o_Fees/2) {
            this.Fees = o_Fees;
            this.dis = o_Fees*0.05f;
        }
        else {
            this.Fees = o_Fees;
        }
        this.fD = fD;
        this.Fees -= (dis + ((s_Fees + s_Levy)/100)*Fees);
    }


    public void display_TotalFees(){
        System.out.println("Fees=" + Fees);
    }
}
class Dep_Fees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter the original fees:");
            float o_Fees = sc.nextFloat();
            System.out.println("Enter the fixed deposit:");
            float fD = sc.nextFloat();
            if (o_Fees >= 50_000 && fD >= 10_000){
                ClgFees c = new ClgFees(o_Fees , fD);
                c.display_TotalFees();
                break;
            }
            else{
                if (o_Fees < 50_000){
                    System.out.println("entered original fees is less than RS 50,000");
                }
                if (fD < 10_000){
                    System.out.println("entered fixed deposit is less than RS 10,000");
                }
                System.out.println("enter the correct original fees and fixed deposit");
            }
        }

    }
}
