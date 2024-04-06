package com.company;

public class Main {

    public static void main(String[] args) {
	    Urun urun = new Urun();
        Musteri musteri1 = new Musteri("phezcsgo@gmail.com");
        Musteri musteri2 = new Musteri("phez1csgo@gmail.com");

        musteri1.teklifYap(urun);
        urun.setFiyat(100);

        musteri2.teklifYap(urun);
        urun.setFiyat(200);
    }
}
