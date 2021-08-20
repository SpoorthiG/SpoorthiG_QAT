
public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount ca =new CurrentAccount();
		SavingsAccount sa =new SavingsAccount();
		ca.checkBankBalance();
		ca.validateUser();
		sa.checkBankBalance();
		sa.validateUser();

	}

}
