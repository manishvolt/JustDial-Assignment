package StepDefs;

public class test {

	public static void main(String[] args) {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// compare strings		
		
		String names[]={"adi", "manish", "adi"};
		
		for(int i=0; i<names.length; i++){
			for(int j=i+1; j<names.length; j++){
				if(names[i].equals(names[j])){
					System.out.println(names[i]);
				}
			}
		}
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// count characters in string		
		
		
		
	String word="i am learning automation";
	
	int count=0;
	for(int i=0; i<word.length(); i++){
		if(word.charAt(i)!=' '){
			count++;
		}
	}
	
	System.out.println(count);
	
	
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// reverse a number		
		
		
		int number=123456;
		
		StringBuffer a=new StringBuffer(String.valueOf(number));
		
		System.out.println(a.reverse());
		

		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//swap 2 numbers without using third variable		
		int x=10; int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("after swappin " + x + " " + y);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// sort array descending		
		
		/*int number1[]={1,2,3,4,5,6};
		int temp=0;
		
		for(int i=0; i<number1.length; i++){
			for(int j=1+1; j<number1.length; j++){
				if(number1[i]<number1[j]){
					temp=number1[i];
					number1[i]=number1[j];
					number1[j]=temp;
				}
			}
		}
		
		System.out.println("after sort = ");
		for(int i=0; i<number1.length; i++){
		System.out.println(number1[i] + " ");
		}*/
	
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// fibnocci series	
		
	int num1=0;
	int num2=1;
	int Temp;
	int sum=0;
	int i=0;
	
	System.out.println(num1);
	while(i<10){
	System.out.println(num1+num2);
	sum=num1+num2;
	Temp=num2;
	num2=sum;
	num1=Temp;
	i++;
	}
		
	
	
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//sort array descending	
		
		int number1[]={10,12,15,2,6,7};
		int temp=0;
		
		for(int k=0; k<number1.length; k++){
			for(int c=k+1; c<number1.length; c++){
				if(number1[k]<number1[c]){
					temp=number1[c];        //10 goes in 3rd variable   
					number1[c]=number1[k];  //12 goes in 10              
					number1[k]=temp;        // 10 goes in 12            
				}
			}
		}
		
		for(int k=0; k<number1.length; k++){
			System.out.println(number1[k]);
		}
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//print only last 4 characters of string
		
		String characters="hi i am learning automation";
		
		char arr[]=characters.toCharArray();             // it converts string into character array
		for(int z=arr.length-4; z<arr.length; z++){      // 
			System.out.print(" " + arr[z]);
		}
		

// Check string is palandrome
		
		
		String s="pop";
		String reverse="";
		
		for(int q=s.length()-1; q>=0; q--){
			reverse=reverse+s.charAt(i);
		}
		
		if(reverse.equals(s)){
			System.out.println("String is palandrome ");
		}
		else{
			System.out.println("string not palandrome");
		}
		
	}
	
}


