
public class Function1 {

	 public static void addition(){
		 int x= 10;
		 int y= 20;
		 int z= x+ y;
		 System.out.println(z);
	 }
	 public static void addNumbers(int num1, int num2){
		 int num= num1+num2;
		 System.out.println("the addition of these numbers are:" +num);
	 }
	 public static void table1(int n){
		 for(int i=0;i<20;i++){
			 System.out.println(n*i);
		 }
	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         addition();// generally calling function
         addNumbers(45,55);// passing in the form of an arguments
         table1(3);
	}

}
