package com.company;

public class Musteri implements Takipci {

    private String mail;
    private boolean teklifYaptiMi;

    public Musteri(String mail){
        this.mail = mail;
        this.teklifYaptiMi = false;
    }

    public void teklifYap(Urun urun){
        urun.takipciEkle(this);
        this.teklifYaptiMi = true;
    }

    @Override
    public void update(String message) {
        if(this.teklifYaptiMi)
            System.out.println("E-posta gönderildi " + mail + "-" + message);
    }
}
