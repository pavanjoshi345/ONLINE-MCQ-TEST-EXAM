package Test_exam_application;
import java.util.*;

public class Text_client_app {

	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     Test_exp tt=new Test_exp();
	     int id;
	     String name = null,email,ch;
	     String cname,sname = null,smail;
	     int pass,pin,spass = 0;
	     String dt;
	     do
	     {
	    	 System.out.println("--------WELCOME TO MCQ TEST_APPLICATION---------------");
	       System.out.println("Do You want to continue then press yes or YES");
	       dt=sc.next();
	       if(dt.equals("yes") || dt.equals("YES"))
	       {
	    	   
	     System.out.println("Enter the Email or Username of Student");
	     email=sc.next();
	     System.out.println("Enter the Password of Email/Username");
	     pass=sc.nextInt();
	     if(email.equals(sname) && pass==spass)
	     {
	    	 System.out.println("Login Is Successfully..............\n\n");
	    	 System.out.printf("......Welcome To %s......\n",name);
	    	 int choice;
//	    	 System.out.println("Enter the Your Choice");
	    	 System.out.println("Are Comfatable for GIVE THE MCQ TEST..!");
	    	 String tst=sc.next();
	    	 if(tst.equals("YES") || tst.equals("yes"))
	    	 {
	    		 int count=0,tru=0,fa=0;
	    		 int ans;
	    		 System.out.println("---------------------------------------------------------------------------------------------");
	    		 System.out.println("TEST STARTED.............");
	    		 System.out.println("Q 1. Who is the father of C language?");
	    		 System.out.println("1) Steve Jobs");
	    		 System.out.println("2) James Gosling");
	    		 System.out.println("3) Dennis Ritchie");
	    		 System.out.println("4) Rasmus Lerdorf");
	    		 ans=sc.nextInt();
	    		 if(ans>=1 && ans<=4)
	    		 {
	    			if(ans==3) { tru++;}else {fa++; }
	    		 }
	    		 else
	    		 {
	    			  System.out.println("INVALID CHOICE...(Pleas try give the answer between 1 to 4 option)");
	    		 }
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		 
	    		 
	    		 
	    		 System.out.println("Q 2. Which of the following is not a valid C variable name?");
	    		 System.out.println("1) int number");
	    		 System.out.println("2) float rate");
	    		 System.out.println("3) int variable_count");
	    		 System.out.println("4) int main");
	    		 ans=sc.nextInt();
	    		 if(ans>=1 && ans<=4)
	    		 {
	    			 if(ans==4) { tru++;}else {fa++; }
	    		 }
	    		 else
	    		 {
	    			  System.out.println("INVALID CHOICE...(Pleas try give the answer between 1 to 4 option)");
	    		 }
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		
	    		  
	    		 
	    		 System.out.println("Q 3. All keywords in C are in ____________");
	    		 System.out.println("1) LowerCase letters");
	    		 System.out.println("2) UpperCase letters");
	    		 System.out.println("3) CamelCase letters");
	    		 System.out.println("4) None of the mentioned");
	    		 ans=sc.nextInt();
	    		 if(ans>=1 && ans<=4)
	    		 {
	    			 if(ans==1) { tru++;}else {fa++; }
	    		 }
	    		 else
	    		 {
	    			  System.out.println("INVALID CHOICE...(Pleas try give the answer between 1 to 4 option)");
	    		 }
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		
	    		  
	    		 
	    		 System.out.println("Q 4.Which of the following cannot be a variable name in C?");
	    		 System.out.println("1) volatile");
	    		 System.out.println("2)  true");
	    		 System.out.println("3) friend");
	    		 System.out.println("4) export");
	    		 ans=sc.nextInt();
	    		 if(ans>=1 && ans<=4)
	    		 {
	    			 if(ans==1) { tru++;}else {fa++; }
	    		 }
	    		 else
	    		 {
	    			  System.out.println("INVALID CHOICE...(Pleas try give the answer between 1 to 4 option)");
	    		 }
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		
	    		  
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		 
	    		  
	    		 
	    		 System.out.println("Q 5.What is the result of logical or relational expression in C?");
	    		 System.out.println("1) True or False");
	    		 System.out.println("2) 0 or 1");
	    		 System.out.println("3) 0 if an expression is false and any positive number if an expression is true");
	    		 System.out.println("4) None of the mentionedn");
	    		 ans=sc.nextInt();
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		 if(ans==2) { tru++;}else {fa++; }
	    		  
	    		 
	    		 System.out.println("Q 6.Functions in C Language are always _________");
	    		 System.out.println("1) Internal");
	    		 System.out.println("2) Both Internal and External");
	    		 System.out.println("3)  External");
	    		 System.out.println("4) External and Internal are not valid terms for functions");
	    		 ans=sc.nextInt();
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		 if(ans==3) { tru++;}else {fa++; }
	    		  
	    		 
	    		 System.out.println("Q 7.What is #include <stdio.h>?");
	    		 System.out.println("1)  Inclusion directive");
	    		 System.out.println("2) File inclusion directive");
	    		 System.out.println("3) Preprocessor directive");
	    		 System.out.println("4) None of the above");
	    		 ans=sc.nextInt();
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		 if(ans==3) { tru++;}else {fa++; }
	    		  
	    		 
	    		 System.out.println("Q 8. What is an example of iteration in C?");
	    		 System.out.println("1) for");
	    		 System.out.println("2) while");
	    		 System.out.println("3) do-while");
	    		 System.out.println("4) All of the above");
	    		 ans=sc.nextInt();
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		 if(ans==4) { tru++;}else {fa++; }
	    		  
	    		 
	    		 System.out.println("Q 9.Which of the following is not possible statically in C language");
	    		 System.out.println("1) Jagged Array");
	    		 System.out.println("2) Rectangular Array");
	    		 System.out.println("3) Cuboidal Array");
	    		 System.out.println("4) Multidimensional Array");
	    		 ans=sc.nextInt();
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		 if(ans==1) { tru++;}else {fa++; }
	    		  
	    		 
	    		 System.out.println("Q 10. Which of the following is not an operator in C?");
	    		 System.out.println("1) ,");
	    		 System.out.println("2) sizeof()");
	    		 System.out.println("3)  None of the mentioned");
	    		 System.out.println("4)  ~");
	    		 ans=sc.nextInt();
	    		 System.out.println("--------------------------------------------------------------------------------------------");
	    		 if(ans==3) { tru++;}else {fa++; }
	    		  
	    		 int result=tru*2;
	    		 if(result>=8)
	    		 {
	    			 System.out.println("------- CONGRATULATIONS .........>");
	    			 System.out.println("-----PASS-----");
	    			 System.out.println("YOUR TOTAL MARKS IS:"+result);
	    		 }
	    		 else {
	    			  System.out.println("FAIL...(Please Improve Yourself...)");
	    			  System.out.println("Your TOTAL MARKS IS:"+result);
	    		 }
	    		 
//	    		 System.out.println("Write Answer IS:"+tru);
//	    		 System.out.println("----------------------------------------------------------------------------------");
//	    		 System.out.println("Wronge Answer IS:"+fa);
	    		 System.out.println("TEST IS SUBMITED......@!");
	    		 System.exit(0);
	    	 }
	     }
	     else {
	    	 System.out.println("Invalid Login......");
	    	 System.out.println("Please Sign Up Student Data");
	    		 System.out.println("Do You Want Sing UP Student Data then press YES or yes");
		    	 ch=sc.next();
		    	 if(ch.equals("YES") || ch.equals("yes"))
		    	 {
		    		 System.out.println("Enter the Student Full Name");
		    		 name=sc.next();
		    		 System.out.println("Enter the College Name");
		    		 cname=sc.next();
		    		 System.out.println("Enter the PIN");
		    		 pin=sc.nextInt();
		    		 System.out.println("Enter the Email and User Name of Student");
		    		 sname=sc.next();
		    		 System.out.println("Enter the Password of Email");
		    		 spass=sc.nextInt();
		    	 }
		    	 else {
		    		  System.out.println("SORRY PLEASE...REGEISTED AFTER TRY");
		    	 }
		   
	     }
	       }
	       else {
	    	    System.out.println("It's OK....");
	    	    System.exit(0);
	       }
	     }while(true);
	     
	} 

}
