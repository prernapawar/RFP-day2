package javapractice;

import java.util.Scanner;

public class CalculateSum {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter the Number");
	num=sc.nextInt();
	int i = 1;
	int sum = 0;
	while(i <= num)
	{
		sum += i;
		i++;
	}
	System.out.println("The sum of natural number is" +sum);
}
}
