/*
Q4. Santa  runs a local musical equipment store in your neighbourhood. He has contracted you to create an interactive
application that will assist him with customer purchases. Create a class named
Customer Purchases that will contain get and set methods for a customer number, first name, surname, product, price and
quantity. Create a separate class called Printing that will include a method called Print Details, that will print the
Customer Invoice. In the Printing class include another method called Customer Purchase Report which will display the
following information:
REPORT OPTION PERCENTAGE
TAX 15%
COMMISSION 8.5%
DISCOUNT 10%
TOTAL (Price + Tax) – (Discount + Commission)

In your main class, capture all the customer purchase details required to produce the reports.
 */

import java.util.Scanner;

public class CostumerPurchases {
    protected long c_No;
    protected String f_name, s_name, product;
    protected int price,quantity;
    protected long p_No;

    public CostumerPurchases(long c_No, String f_name, String s_name, String product, int price, int quantity, long p_No) {
        this.c_No = c_No;
        this.f_name = f_name;
        this.s_name = s_name;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.p_No = p_No;
    }

    public long getC_No() {
        return c_No;
    }

    public String getF_name() {
        return f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getP_No() {
        return p_No;
    }
}

class Printing extends CostumerPurchases{
    float tax = 0.15f;
    float com = 0.085f;
    float dis = 0.10f;

    float t_price = price*quantity;

    public Printing(long c_No, String f_name, String s_name, String product, int price, int quantity, long p_No) {
        super(c_No, f_name, s_name, product, price, quantity, p_No);
    }

    public void C_Purchase_Rep(){
        System.out.println("Customer Purchase Report");
        System.out.println("TAX 15%\n" +
                "COMMISSION 8.5%\n" +
                "DISCOUNT 10%");
        float v = dis + com;
        System.out.println("TOTAL :" + t_price*(1+tax-v));
    }
}
class Costumer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COSTUMER NUMBER:");
        int c_no = sc.nextInt();
        System.out.println("FIRST NAME:");
        String f_name = sc.next();
        sc.nextLine();
        System.out.println("SURNAME:");
        String s_name = sc.next();
        sc.nextLine();
        System.out.println("PRODUCT NAME:");
        String product = sc.nextLine();
        System.out.println("PRICE:");
        int price = sc.nextInt();
        System.out.println("QUANTITY:");
        int quantity = sc.nextInt();
        System.out.println("PHONE NUMBER:");
        long p_No = sc.nextLong();

        Printing p = new Printing(c_no,f_name,s_name,product,price,quantity,p_No);
        p.C_Purchase_Rep();
        System.out.println(p.getF_name());
    }
}

