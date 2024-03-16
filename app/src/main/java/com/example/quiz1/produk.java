package com.example.quiz1;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class produk implements Parcelable {
    String namapelanggan;
    String namabarang;
    String kodebarang;
    String tipemember;
    double hargaawal;
    double totalharga;
    double jumlahbayar;
    double diskonmembership;
    double diskonbarang;

    double jumlahbarang;

    protected produk(Parcel in) {
        namapelanggan = in.readString();
        namabarang = in.readString();
        kodebarang = in.readString();
        tipemember = in.readString();
        hargaawal = in.readDouble();
        totalharga = in.readDouble();
        jumlahbayar = in.readDouble();
        diskonmembership = in.readDouble();
        diskonbarang = in.readDouble();
        jumlahbarang = in.readDouble();
    }

    public static final Creator<produk> CREATOR = new Creator<produk>() {
        @Override
        public produk createFromParcel(Parcel in) {
            return new produk(in);
        }

        @Override
        public produk[] newArray(int size) {
            return new produk[size];
        }
    };

    public double getJumlahbarang() {
        return jumlahbarang;
    }

    public void setJumlahbarang(double jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }

    public produk() {
    }



    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getTipemember() {
        return tipemember;
    }

    public void setTipemember(String tipemember) {
        this.tipemember = tipemember;
    }

    public double getHargaawal() {
        return hargaawal;
    }

    public void setHargaawal(double hargaawal) {
        this.hargaawal = hargaawal;
    }

    public double getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(double totalharga) {
        this.totalharga = totalharga;
    }

    public double getJumlahbayar() {
        return jumlahbayar;
    }

    public void setJumlahbayar(double jumlahbayar) {
        this.jumlahbayar = jumlahbayar;
    }

    public double getDiskonmembership() {
        return diskonmembership;
    }

    public void setDiskonmembership(double diskonmembership) {
        this.diskonmembership = diskonmembership;
    }

    public double getDiskonbarang() {
        return diskonbarang;
    }

    public void setDiskonbarang(double diskonbarang) {
        this.diskonbarang = diskonbarang;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(namapelanggan);
        dest.writeString(namabarang);
        dest.writeString(kodebarang);
        dest.writeString(tipemember);
        dest.writeDouble(hargaawal);
        dest.writeDouble(totalharga);
        dest.writeDouble(jumlahbayar);
        dest.writeDouble(diskonmembership);
        dest.writeDouble(diskonbarang);
        dest.writeDouble(jumlahbarang);
    }
}
