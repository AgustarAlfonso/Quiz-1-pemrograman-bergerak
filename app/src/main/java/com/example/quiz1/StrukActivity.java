package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;


public class StrukActivity extends AppCompatActivity {

    public static final String KEY_DATA = "key_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);

        TextView namapelanggan = findViewById(R.id.tv1);
        TextView membership = findViewById(R.id.tv2);
        TextView kodebarang= findViewById(R.id.tv3);
        TextView namabarang = findViewById(R.id.tv4);
        TextView hargaawal = findViewById(R.id.tv5);
        TextView totalharga = findViewById(R.id.tv6);
        TextView diskonbarang = findViewById(R.id.tv7);
        TextView diskonmember = findViewById(R.id.tv8);
        TextView jumlahbayar = findViewById(R.id.tv9);
        Button btnshare = findViewById(R.id.bt2);

        DecimalFormat format = new DecimalFormat("#,###.##");

        produk produk;
        if (Build.VERSION.SDK_INT > 33)
        {
            produk = getIntent().getParcelableExtra(KEY_DATA, produk.class);
        } else {
            produk = getIntent().getParcelableExtra(KEY_DATA);
        }


        namapelanggan.setText("Selamat datang " + produk.getNamapelanggan());
        membership.setText("Tipe member " + produk.getTipemember());
        kodebarang.setText("Kode barang: " + produk.getKodebarang());
        namabarang.setText("Nama barang: " + produk.getNamabarang());
        hargaawal.setText("Harga barang: Rp" + format.format(produk.getHargaawal()));
        totalharga.setText("Total Harga barang: Rp" + format.format(produk.getTotalharga()));
        diskonbarang.setText("Diskon Harga: Rp" + format.format(produk.getDiskonbarang()));
        diskonmember.setText("Diskon Membership: Rp" + format.format(produk.getDiskonmembership()));
        jumlahbayar.setText("Jumlah bayar: Rp" + format.format(produk.getJumlahbayar()));

        btnshare.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String shareMessage = "Halo " + produk.getNamapelanggan() + "! Anda telah membeli " + produk.getNamabarang() + " Sebanyak " + format.format(produk.getJumlahbarang())+  " buah dengan harga Rp" + format.format(produk.getJumlahbayar());
            intent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(intent, "Bagikan melalui"));
        });




    }
}