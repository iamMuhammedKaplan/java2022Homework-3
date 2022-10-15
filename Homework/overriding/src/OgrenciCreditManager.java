
public class OgrenciCreditManager extends BaseCreditManager {
	
	@Override
	public double calculate(double tutar) {
		return tutar * 1.10;
	}
}
