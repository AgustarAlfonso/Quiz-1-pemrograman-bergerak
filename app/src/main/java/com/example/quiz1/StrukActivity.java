package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;


public class StrukActivity extends AppCompatActivity {

    public static final String KEY_DATA = "key_data";

    @SuppressLint("StringFormatInvalid")
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


        String namapelanggans = getString(R.string.selamat_datang ,produk.getNamapelanggan());
        String memberships = getString(R.string.tipe_pelanggan, produk.getTipemember());
        String kodebarangs = getString(R.string.kode_barang, produk.getKodebarang());
        String namabarangs = getString(R.string.nama_barang, produk.getNamabarang());
        String hargaawals = getString(R.string.harga_barang, format.format(produk.getHargaawal()));
        String totalhargas = getString(R.string.total_harga, format.format(produk.getTotalharga()));
        String diskonbarangs = getString(R.string.diskon_harga, format.format(produk.getDiskonbarang()));
        String diskonmembers = getString(R.string.diskon_member, format.format(produk.getDiskonmembership()));
        String jumlahbayars = getString(R.string.jumlah_bayar, format.format(produk.getJumlahbayar()));

        namapelanggan.setText(namapelanggans);
        membership.setText(memberships);
        kodebarang.setText(kodebarangs);
        namabarang.setText(namabarangs);
        hargaawal.setText(hargaawals);
        totalharga.setText(totalhargas);
        diskonbarang.setText(diskonbarangs);
        diskonmember.setText(diskonmembers);
        jumlahbayar.setText(jumlahbayars);


        namapelanggan.setText(namapelanggans);
        membership.setText(memberships);
        kodebarang.setText(kodebarangs);
        namabarang.setText(namabarangs);
        hargaawal.setText(hargaawals);
        totalharga.setText(totalhargas);
        diskonbarang.setText(diskonbarangs);
        diskonmember.setText(diskonmembers);
        jumlahbayar.setText(jumlahbayars);

        btnshare.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String shareMessage = "Halo " + produk.getNamapelanggan() + "! Anda telah membeli " + produk.getNamabarang() + " Sebanyak " + format.format(produk.getJumlahbarang())+  " buah dengan harga Rp" + format.format(produk.getJumlahbayar());
            intent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(intent, "Bagikan melalui"));
        });




    }
}