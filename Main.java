class Main{
	
public static void main(String [] args){
	
    Bank bank = new Bank("Lollandsbanken");
    bank.addAccount("Egon", 30000);
    bank.addAccount("Benny", 12);
    bank.addAccount("Kjeld", 1);


   System.out.println(bank.accounts.get(1).getBalance());

  displayBank(bank);

}

  private static void displayBank(Bank bank){
      System.out.println(bank);
 

  }

}