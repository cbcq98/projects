import java.util.Scanner;
import java.text.DecimalFormat;

public class BillCalc {
public static void main(String[]args)
{
	Scanner Kb=  new Scanner(System.in);
	DecimalFormat df = new
			DecimalFormat("$#0.00");
	
	double meal, tax, tip, total;
	
	System.out.println("Hello Welcome to CBCQ's BBQ Grill!\nEnter your meal price please\n$: ");

	meal = Kb.nextInt();
	
	tax = meal * .0675;
	tip = meal * .15;
	total = meal+tax+tip;
	
	System.out.println("Date: September 29, 2016\n Time:11:54 a.m\nMeal: ");
	System.out.println(df.format(meal));
	System.out.println("Tax: ");
	System.out.println(df.format(tax));
	System.out.println("Tip:");
	System.out.println(df.format(tip));
	System.out.println("Total:");
	System.out.println(df.format(total));
	System.out.println("Thank for eating here at Christian's BBQ Grill! Come Again!");
	
}
}

/*Hello Welcome to Christian's BBQ Grill!
Enter your meal price please
5
Date: September 29, 2016
 Time:11:54 a.m
Meal: 
$5.00
Tax: 
$0.34
Tip:
$0.75
Total:
$6.09
Thank for eating here at Christian's BBQ Grill! Come Again!
*/