import java.util.*;

public class TestScores {
public static void main(String[]args)
{
	double test1;
	double test2;
	double test3;
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Hello Student!\n Please enter the score of your first test:");
	test1= kb.nextDouble();
	System.out.println("Please enter the score of your second test:");
	test2= kb.nextDouble();
	System.out.println("Please enter the score of your third test:");
	test3=kb.nextDouble();
	
	double average= (test1+test2+test3)/3;
	
	if ((average>=90)&&(average<=100))
		{
		System.out.println("Congratulation! You got an A!");
		}
	if ((average>=80)&&(average<=89))
	{
		System.out.println("Good job! You got a B");
	}
	if ((average>=70)&&(average<=79))
	{
		System.out.println("Your grade is a C");
	}
	if ((average>=60)&&(average<=69))
	{
		System.out.println("Your grade is a D");
	}
	if ((average>=50)&&(average<=59))
	{
		System.out.println("You recieved an F...You could do better.");
	}
System.out.println("Your test average is "+average);
}
}

/*
Hello Student!
Please enter the score of your first test:
75
Please enter the score of your second test:
80
Please enter the score of your third test:
100
Good job! You got a B
Your test average is 85.0
*/