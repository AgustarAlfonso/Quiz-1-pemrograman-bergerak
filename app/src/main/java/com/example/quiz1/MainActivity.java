package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText namapelanggan = findViewById(R.id.et1);
        EditText kodebarang = findViewById(R.id.et2);
        EditText jumlahbarang = findViewById(R.id.et3);
        RadioButton gold = findViewById(R.id.rb1);
        RadioButton silver = findViewById(R.id.rb2);
        RadioButton biasa = findViewById(R.id.rb3);
        Button hitung = findViewById(R.id.bt1);

        hitung.setOnClickListener(v ->{
            if (kodebarang.getText().toString().equals("IPX") || kodebarang.getText().toString().equals("ipx"))
            {
                double jumlah = Double.parseDouble(jumlahbarang.getText().toString());
                double hargaawal = 5725300;
                double diskonbarang = 0;
                double totalharga = hargaawal * jumlah;
                double jumlahbayar = totalharga;
                double diskonmembership = 0;
                if(jumlahbayar>9999999)
                {
                    diskonbarang = 100000;
                    jumlahbayar -= diskonbarang;
                }

                String membership ="";
                if(gold.isChecked())
                {
                    diskonmembership = jumlahbayar * 0.1;
                    jumlahbayar -= diskonmembership;
                    membership = "gold";
                } else if (silver.isChecked()) {
                    diskonmembership = jumlahbayar * 0.05;
                    jumlahbayar -= diskonmembership;
                    membership = "silver";
                } else if (biasa.isChecked()) {
                    diskonmembership = jumlahbayar * 0.02;
                    jumlahbayar -= diskonmembership;
                    membership = "biasa";
                }

                produk produk = new produk();
                produk.setNamapelanggan(namapelanggan.getText().toString());
                produk.setNamabarang("Iphone X");
                produk.setKodebarang("IPX");
                produk.setHargaawal(hargaawal);
                produk.setTotalharga(totalharga);
                produk.setDiskonbarang(diskonbarang);
                produk.setDiskonmembership(diskonmembership);
                produk.setJumlahbayar(jumlahbayar);
                produk.setTipemember(membership);
                produk.setJumlahbarang(jumlah);

                Intent intent = new Intent(this, StrukActivity.class);
                intent.putExtra(StrukActivity.KEY_DATA, produk);
                startActivity(intent);

            } else if (kodebarang.getText().toString().equals("PCO") || kodebarang.getText().toString().equals("pco"))
            {
                double jumlah = Double.parseDouble(jumlahbarang.getText().toString());
                double hargaawal = 2730551;
                double diskonbarang = 0;
                double totalharga = hargaawal * jumlah;
                double jumlahbayar = totalharga;
                double diskonmembership = 0;
                if(jumlahbayar>9999999)
                {
                    diskonbarang = 100000;
                    jumlahbayar -= diskonbarang;
                }

                String membership ="";
                if(gold.isChecked())
                {
                    diskonmembership = jumlahbayar * 0.1;
                    jumlahbayar -= diskonmembership;
                    membership = "gold";
                } else if (silver.isChecked()) {
                    diskonmembership = jumlahbayar * 0.05;
                    jumlahbayar -= diskonmembership;
                    membership = "silver";
                } else if (biasa.isChecked()) {
                    diskonmembership = jumlahbayar * 0.02;
                    jumlahbayar -= diskonmembership;
                    membership = "biasa";
                }

                produk produk = new produk();
                produk.setNamapelanggan(namapelanggan.getText().toString());
                produk.setNamabarang("POCO M3");
                produk.setKodebarang("PCO");
                produk.setHargaawal(hargaawal);
                produk.setTotalharga(totalharga);
                produk.setDiskonbarang(diskonbarang);
                produk.setDiskonmembership(diskonmembership);
                produk.setJumlahbayar(jumlahbayar);
                produk.setTipemember(membership);
                produk.setJumlahbarang(jumlah);

                Intent intent = new Intent(this, StrukActivity.class);
                intent.putExtra(StrukActivity.KEY_DATA, produk);
                startActivity(intent);
            } else if (kodebarang.getText().toString().equals("OAS") || kodebarang.getText().toString().equals("oas") )
            {
                double jumlah = Double.parseDouble(jumlahbarang.getText().toString());
                double hargaawal = 1989123;
                double diskonbarang = 0;
                double totalharga = hargaawal * jumlah;
                double jumlahbayar = totalharga;
                double diskonmembership = 0;
                if(jumlahbayar>9999999)
                {
                    diskonbarang = 100000;
                    jumlahbayar -= diskonbarang;
                }

                String membership ="";
                if(gold.isChecked())
                {
                    diskonmembership = jumlahbayar * 0.1;
                    jumlahbayar -= diskonmembership;
                    membership = "gold";
                } else if (silver.isChecked()) {
                    diskonmembership = jumlahbayar * 0.05;
                    jumlahbayar -= diskonmembership;
                    membership = "silver";
                } else if (biasa.isChecked()) {
                    diskonmembership = jumlahbayar * 0.02;
                    jumlahbayar -= diskonmembership;
                    membership = "biasa";
                }

                produk produk = new produk();
                produk.setNamapelanggan(namapelanggan.getText().toString());
                produk.setNamabarang("Oppo a5s");
                produk.setKodebarang("OAS");
                produk.setHargaawal(hargaawal);
                produk.setTotalharga(totalharga);
                produk.setDiskonbarang(diskonbarang);
                produk.setDiskonmembership(diskonmembership);
                produk.setJumlahbayar(jumlahbayar);
                produk.setTipemember(membership);
                produk.setJumlahbarang(jumlah);

                Intent intent = new Intent(this, StrukActivity.class);
                intent.putExtra(StrukActivity.KEY_DATA, produk);
                startActivity(intent);
            }


        });


    }
}