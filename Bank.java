import java.util.ArrayList;


class Bank{
	public ArrayList<BankAccount> accounts = new ArrayList<>();

    private String name;



	public Bank(String name){
        
        this.name = name;

	} 
   

    public void addAccount(String name, int startAmount){
    	BankAccount b = new BankAccount(name, startAmount);
         accounts.add(b);
    }

    //TODO: override toString method


}