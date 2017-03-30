package main;

public class CalcClassic {
	 public String getP(int Sum, double bet, int time){ 
		 double fPay = 0;
		 String str;  
		 fPay = (Sum*bet)/time;
		                       
		 fPay = fPay * 100; 
		                       
		 int i = (int) Math.round(fPay); 
		                
		 fPay = (double)i / 100; 
		                
		 str = Double.toString(fPay); 
		                       
		 return str;

		}
}

