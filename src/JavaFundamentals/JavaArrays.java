package JavaFundamentals;
import java.util.ArrayList;


public class JavaArrays {

	public static void main(String[] args) {
		//basicArray();
		//setArray(); //passByRefference example
		//multidimensionalArray();
		//objectArray();
		arrayLists();
	}
	public static void basicArray() {
		//Array declaration and construction combined
		int array[] = new int[7];
		
		//Initialize an array
        for (int count=0;count<7;count++){
           array[count]=count+1;
        }
        
        for (int count=0;count<7;count++){
           System.out.println("array["+count+"] = "+array[count]);
        }
      
        System.out.println("Length of Array  =  "+array.length);
        //array[8] =10;
	}
	
	//Example: To understand Array are passed by reference
	public static void passByReference(String a[]){
	     a[0] = "Changed";
	}
	
	public static void setArray(){
	     String []b={"Apple","Mango","Orange"};
	     System.out.println("Before Function Call    "+b[0]);
	     for (int count=0;count<3;count++){
           System.out.println("b["+count+"] = "+b[count]);
	     }
	     
	     JavaArrays.passByReference(b);
	     System.out.println("After Function Call    "+b[0]);
	     for (int count=0;count<3;count++){
           System.out.println("b["+count+"] = "+b[count]);
	     }
	}

	public static void multidimensionalArray(){
	    // Create 2-dimensional array.
	    int[][] twoD = new int[4][4];
	
	    // Assign three elements in it.
	    twoD[0][0] = 1;
	    twoD[1][1] = 2;
	    twoD[3][2] = 3;
	    System.out.print("Multidimensi Array [0][0]: "+twoD[0][0]);
	}
	
	public static void objectArray(){
		Accounts obj[] = new Accounts[2] ;
		obj[0] = new Accounts();
		obj[1] = new Accounts();
		obj[0].setData(1,2);
		obj[1].setData(3,4);
		System.out.println("For Array Element 0");
		obj[0].showData();
		System.out.println("For Array Element 1");
		     obj[1].showData();
	}
	
	public static void arrayLists() {
		//Creating a generic ArrayList
		  ArrayList<String> arlTest = new ArrayList<String>();
		  //Size of arrayList
		  System.out.println("Size of ArrayList at creation: " + arlTest.size());
		  //Lets add some elements to it
		  arlTest.add("D");
		  arlTest.add("U");
		  arlTest.add("K");
		  arlTest.add("E");

		  //Recheck the size after adding elements
		  System.out.println("Size of ArrayList after adding elements: " + arlTest.size());

		  //Display all contents of ArrayList
		  System.out.println("List of all elements: " + arlTest);

		  //Remove some elements from the list
		  arlTest.remove("D");
		  System.out.println("See contents after removing one element: " + arlTest);

		  //Remove element by index
		  arlTest.remove(2);
		  System.out.println("See contents after removing element by index: " + arlTest);

		  //Check size after removing elements
		  System.out.println("Size of arrayList after removing elements: " + arlTest.size());
		  System.out.println("List of all elements after removing elements: " + arlTest);

		  //Check if the list contains "K"
		  System.out.println(arlTest.contains("K"));
	}
	
}


class Accounts{
	  int a;
	  int b;
	  public void setData(int c,int d){
		  a=c;
		  b=d;
	  }
	  public void showData(){
		  System.out.println("Value of a ="+a);
		  System.out.println("Value of b ="+b);
	  }
}
