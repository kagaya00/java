
import java.math.*;
import java.util.*;
public class JavaKadai051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		 
		while(true) {
			System.out.print("整数値を入力してくださいーー＞");
		  int num1 = sc.nextInt();
		  if(num1 %7 != 0 && num1 < 0) {
			  System.out.println("正の数で７の倍数でありません");
			    
		  }
		  if (num1 == 0) {
			  System.out.println("0 です");
		  }
		  else if (num1 <0) {
			  System.out.println("負の数です");
		  }
		 
		 
		}
			
		
		
		
	}

}
