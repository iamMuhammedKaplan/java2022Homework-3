
public class BaseCreditManager {
	
	public double calculate(double tutar) {
		return tutar * 1.18;
	}
	
	public final void cancel() {
		System.out.println("��leminiz iptal edildi.");
	}
	
	/*
	 * 	Java'da miras ili�kisi bulunan s�n�flarda ata s�n�flar�n
	 * metotlar�, varsay�lan olarak overrideable'd�r.
	 * 	Bunun olmas�n� istemedi�imiz durumlarda ise;
	 * yapmam�z gereken �ey, override edilmesini istemedi�imiz
	 * metotlar�n eri�im belirleyicisinden sonra "final"
	 * anahtar s�zc���n� getirmektir.
	 * 	�rne�in bu class i�indeki calculate metodu alt s�n�flarda
	 * override edilebilme �zelli�ine sahipken, cancel metodunun
	 * t�m di�er miras alan s�n�flarda da bir kat� kural olarak
	 * bu s�n�fta oldu�u gibi ayn� �ekilde �al��mas� istenmi�tir.
	 */
}
