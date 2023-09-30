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

    @Override
    public String toString(){
 		String s= "";

 		s = this.name+"\n"; 

 		for(BankAccount ba:accounts) {
			//s +=
			s = s + ba.getOwner()+"\n";

 		}
 		s+="\n"+super.toString();

    	return s;
    }


}