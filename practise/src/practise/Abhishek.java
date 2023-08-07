package practise;

public class Abhishek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=153,number,temp,total=0;
 number=num;
 for(number=num;number!=0;number/=10) {
	 temp=number%10;
	 total=total+temp*temp*temp;}
 if(total==num)
	 System.out.println(num+" Is Armstrong num");
 
	else
	
		System.out.println(num + " IS not ArmStrong num");
	
    	
    }

	}