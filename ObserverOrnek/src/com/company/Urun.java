package com.company;

import java.util.ArrayList;
import java.util.List;

public class Urun implements Subject{
    private List<Musteri> musteriler;
    private double fiyat;

    public Urun(){
        musteriler = new ArrayList<>();
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
        takipcilereHaberVer();
    }

    @Override
    public void takipciEkle(Musteri takipci) {
        musteriler.add(takipci);
    }

    @Override
    public void takipcilereHaberVer() {
        for(Musteri musteri : musteriler)
            musteri.update("Ürünün yeni fiyatı " + this.fiyat);
    }
}
