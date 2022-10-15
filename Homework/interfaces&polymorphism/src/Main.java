
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager
			= new CustomerManager(new SqlServerCustomerDal());
		
		//customerManager.customerDal = new MySqlCustomerDal();
		//Bir üstteki satýrdaki kod tercih ve tavsiye edilmez.
		
		customerManager.add();
	}

}
