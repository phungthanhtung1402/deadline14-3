package baitaptuan5;
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) 
{
		int sum = 0, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap n:");
			n = sc.nextInt();
			sum += n;
			if (sum > 100) break;
			}while (n > 0); 
		
		        System.out.println("Tong cac so la:" + sum);
}
	
}