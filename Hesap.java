import java.util.Scanner;

public class Hesap extends Banka{
    
    private int mevcutBakiye = 0;
	private String kisiBilgisi;
	private int[] referansKodu;
	
	static Boolean[][] matrix = new Boolean[3][15];

	public Hesap(int mevcutBakiye, String kisiBilgisi, int[] referansKodu) {
		
		this.mevcutBakiye = mevcutBakiye;
		this.kisiBilgisi = kisiBilgisi;
		this.referansKodu = referansKodu;
	}
	
	 static void IslemYap() {
	
		System.out.println("Bankam�za Ho�geldiniz....");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 15; j++) {
				if (i == 0 && j < 5) {
					matrix[i][j] = true;
				} else if (i == 1 && j < 10) {
					matrix[i][j] = true;
				} else if (i == 2 && j < 15) {
					matrix[i][j] = true;
				} else
					matrix[i][j] = false;
			}
		}
		while (true) {
			System.out.println("��k�� yapmak istiyorsan�z 0'� para yat�rmak i�in 1'i tu�lay�n�z:\n");
			int sayi;
			Scanner scanner = new Scanner(System.in);
			sayi = scanner.nextInt();
			if (sayi == 1) {
				System.out.println("referans kodunuzdan birini giriniz:");
				int girilenreferans = scanner.nextInt();
				
				ReferansKontrol(girilenreferans);
				
				
			} else if (sayi == 0) {
				System.out.println("bankam�z� se�ti�iniz i�in te�ekk�r ederiz.");
				break;
			} else
				System.out.println("Yanl�� bir say� tu�lad�n�z l�tfen tekrar deneyin...");
		}
		
	
	}
	private static void ReferansKontrol(int girilenreferans) {
		int kontrol = 0;
		for (int k = 0; k < 5; k++) {
			if (girilenreferans == referansKodlari1[k]) {
				Birincikullan�c�(matrix[0][k]);
			} else if (girilenreferans == referansKodlari2[k]) {
				ikincikullan�c�(matrix[1][k]);
			} else if (girilenreferans == referansKodlari3[k]) {
				ucuncukullan�c�(matrix[2][k]);
			} else if (girilenreferans != referansKodlari1[k] && girilenreferans != referansKodlari2[k]
					&& girilenreferans != referansKodlari3[k]) {
				kontrol++;
				if (kontrol == 5) {
					System.out.println("girdi�iniz referans kodu hatal�");
				} else
					continue;
			} else {
				continue;
			}

		}
		
	}
	public static void Birincikullan�c�(Boolean matrix) {
		System.out.println("yatr�lacak tutar");
		int para;
		Scanner scanner = new Scanner(System.in);
		para = scanner.nextInt();
		if (matrix) {
			System.out.println(hesap1.getKisiBilgisi() + " isimli hesaba " + para + " para yat�racaks�n�z");
			hesap1.setMevcutBakiye(para);
			System.out.println("mevcut bakiyeniz: " + hesap1.getMevcutBakiye());

		}
	}

	public static void ikincikullan�c�(Boolean matrix) {
		System.out.println("yat�r�lacak para");
		int para;
		Scanner scanner = new Scanner(System.in);
		para = scanner.nextInt();
		if (matrix) {
			System.out.println(hesap2.getKisiBilgisi() + " isimli hesaba " + para + " para yat�racaks�n�z");
			hesap2.setMevcutBakiye(para);
			System.out.println("mevcut bakiyeniz: " +hesap2.getMevcutBakiye());

		}
	}

	public static void ucuncukullan�c�(Boolean matrix) {
		System.out.println("yat�r�lacak para");
		int para;
		Scanner scanner = new Scanner(System.in);
		para = scanner.nextInt();
		if (matrix) {
			System.out.println(hesap3.getKisiBilgisi() + "isimli hesaba " + para + " para yat�racaks�n�z");
			hesap3.setMevcutBakiye(para);
			System.out.println("mevcut bakiyeniz: " +hesap3.getMevcutBakiye());

		}
	}
	public int getMevcutBakiye() {
		return mevcutBakiye;
	}

	public void setMevcutBakiye(int mevcutBakiye) {
		this.mevcutBakiye = mevcutBakiye;
	}

	public String getKisiBilgisi() {
		return kisiBilgisi;
	}

	public void setKisiBilgisi(String kisiBilgisi) {
		this.kisiBilgisi = kisiBilgisi;
	}

	public int[] getReferansKodu() {
		return referansKodu;
	}

	public void setReferansKodu(int[] referansKodu) {
		this.referansKodu = referansKodu;
	}

	public static Boolean[][] getMatrix() {
		return matrix;
	}

	public static void setMatrix(Boolean[][] matrix) {
		Hesap.matrix = matrix;
	}
	

		
		
		
	}

