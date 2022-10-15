
public class BaseCreditManager {
	
	public double calculate(double tutar) {
		return tutar * 1.18;
	}
	
	public final void cancel() {
		System.out.println("Ýþleminiz iptal edildi.");
	}
	
	/*
	 * 	Java'da miras iliþkisi bulunan sýnýflarda ata sýnýflarýn
	 * metotlarý, varsayýlan olarak overrideable'dýr.
	 * 	Bunun olmasýný istemediðimiz durumlarda ise;
	 * yapmamýz gereken þey, override edilmesini istemediðimiz
	 * metotlarýn eriþim belirleyicisinden sonra "final"
	 * anahtar sözcüðünü getirmektir.
	 * 	Örneðin bu class içindeki calculate metodu alt sýnýflarda
	 * override edilebilme özelliðine sahipken, cancel metodunun
	 * tüm diðer miras alan sýnýflarda da bir katý kural olarak
	 * bu sýnýfta olduðu gibi ayný þekilde çalýþmasý istenmiþtir.
	 */
}
