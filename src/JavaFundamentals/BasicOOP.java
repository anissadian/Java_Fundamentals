package JavaFundamentals;

//Encapsulation example
//Class Declaration
class Account {
	// Instance Variables
	private int account_number;
    private int account_balance;
    String name;

    // method 1
    //public void show Data() {
    public String getInfo() {
    	return ("Name: "+name+"\nAccount Number: "+account_number);
    }
    
    // method 2
    public void deposit(int a) {
        if (a < 0) {
            //show error 
        } else
            account_balance = account_balance + a;
    }
    
    // getter method 3
 	public int getBalance() {
         return this.account_balance;
     }
 	
     // setter method 4
 	public void setNumber(int num) {
         this.account_number = num;
     }
}

public class BasicOOP {
	public static void main(String[] args) {
		Account user = new Account();
        user.name="Andi";
        user.setNumber(100213);
        user.deposit(200);
        System.out.println(user.getInfo());
        System.out.println("Balance: "+user.getBalance());
	}

}
