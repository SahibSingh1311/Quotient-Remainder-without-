import java.util.*;

public class Division{
	public static void main(String[] args){
	int numerator=100,denominator=5;
	doDiv(numerator,denominator);
}
static void doDiv(int divident, int divisor){
	if(divident<divisor){
		System.out.println("Incorrect Input!!");
	}else{
	int penultimate = divident-divisor;
	int quotient = 0;
	while(divident>=divisor*quotient){
			if(penultimate<divisor*quotient){
				break;
			}
			quotient++;
		}
	int remainder=divident-(divisor*quotient);
	System.out.println("Quotient : "+quotient);
	System.out.println("Remainder : "+remainder);
	
	}
}
}