
public class Banka {
	
	 static int referansKodlari1[]= {463543,46374,6786,90586,8598};
	 static int referansKodlari2[]= {23452,675865,765865};
	 static int referansKodlari3[]= {353464,8796,9807,567};
	
	 
	  static Hesap hesap1 = new Hesap(0,"öykü parlak", referansKodlari1);
	  static Hesap hesap2 = new Hesap(500,"arzu durlanık", referansKodlari2);
	  static Hesap hesap3 = new Hesap(8000,"selin kumru", referansKodlari3);
				
	  static void HesapOlustur() {
						
		Hesap[] hesaplar = new Hesap[3];

		hesaplar[0] = hesap1;
		hesaplar[1] = hesap2;
		hesaplar[2] = hesap3;		System.out.println("hesaplar güncel..");
		
		}
	
	
	
	}
	 

