class BankAccount extends Object{
	private int balance;
	private String owner;
	private int id;
	private static int nextCount = 1;
	

	public BankAccount(String owner, int amount){
       this.owner = owner;
       this.balance = amount;
       this.id = nextCount;
       nextCount++;
	}


   public static int getNextCount(){

      return nextCount;

   }
	public String getOwner(){
		return owner;
	}

	public int getBalance(){

		return balance;
	}

	public int getId(){
		return id;
	}
	
	public void setBalance(int amount){
			this.balance = amount;
	}

    public String toString(){

    	String s = this.owner+ " saldo: "+this.balance+ " ID: "+ this.id;

		return s;

    }

	//todo: updateBalance (sætte penge ind og trække penge ud)


}