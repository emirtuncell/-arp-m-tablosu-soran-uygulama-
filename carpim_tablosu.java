package carpim_tablosu;

import java.util.Random;
import java.util.Scanner;

public class carpim_tablosu {
       public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
    	   
	
	int sonuc;
	int dogru=0;
	System.out.println("ÇIKIŞ YAPMAK İÇİN 1 YAZINIZ....");
	
	while (true) {//kullanıcı çıkmak istemezse sonsuza kadar çarpım sorusu döndürecek.
		
		Random random =new Random();
	int a=random.nextInt(10);//sıfırdan 10'a kadar olan rakamların çarpımlarını soracak.
	int b=random.nextInt(10);
	
		System.out.println(a +" x " + b +" sonucu =  ");
		sonuc=scan.nextInt();
		
		if(sonuc == a*b) {
			System.out.println("SONUCUNUZ DOGRU. TEBRIKLER !!!");
			dogru+=1;//doğru değişkenine her doğru cevapta 1 ekledim. Kullanıcıyı motive etmek için kullanacağım.
			if(dogru<= 3) {
			System.out.println("İYİ GİDİYORSUN. DEVAM ET.");
		}
		else if(dogru<7 && dogru > 3) {
			System.out.println("SÜPERSİN...");
		} 
		else 
			System.out.println("SEN ÇARPMA İŞLEMİNİ BİLİYORSUN !!!");
		
		    continue;
		}
		
		
		else if (sonuc !=1 || sonuc == a*b){
			System.out.println("HATALI SONUC. TEKRAR DENEYINIZ !!!");
		}
		
		
		
		if(sonuc == 1) {//kullanıcı çıkış yapmak istiyor.
			System.out.println("ÇIKIŞ YAPILIYOR. LÜTFEN BEKLEYİN. ");
			break;
		}
		
		
		
		
	}
	
	
       }
}
