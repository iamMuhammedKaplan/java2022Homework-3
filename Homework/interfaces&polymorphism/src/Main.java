
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager
			= new CustomerManager(new SqlServerCustomerDal());
		
		//customerManager.customerDal = new MySqlCustomerDal();
		//Bir �stteki sat�rdaki kod tercih ve tavsiye edilmez.
		
		customerManager.add();
	}

}
