
//Bizim çalýþanýmýz
public class Worker
	implements IWorkable, IEatable, IPayable {

	@Override
	public void work() {
		System.out.println("Company worker works...");
	}

	@Override
	public void eat() {
		System.out.println("Company worker eats...");
	}

	@Override
	public void pay() {
		System.out.println("Company worker has been paid.");
	}
	
}
