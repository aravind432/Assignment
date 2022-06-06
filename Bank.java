package assignment;

public class Bank implements Cibil, PNB {
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("maximumLoanAmount");

	}

	public void creditScore() {
		// TODO Auto-generated method stub
	System.out.println("creditScore");

	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("minimumBalance");
	}


	public void cibilscore() {
		// TODO Auto-generated method stub
		System.out.println("cibilscore");
	}

public static void main(String[] args) {
			// TODO Auto-generated method stub


		Bank obj=new Bank();
		obj.maximumLoanAmount();
		obj.creditScore();
		obj.minimumBalance();
		obj.cibilscore();

		Cibil obj1= new Bank();
		obj1.cibilscore();
		    


	}

}
