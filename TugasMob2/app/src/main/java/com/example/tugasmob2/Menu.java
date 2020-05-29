package com.example.tugasmob2;

public class Menu {
    private String gambar;
    private String nama;
    private String harga;

    public Menu(String datanama, String dataharga, String datagambar){
        nama = datanama;
        gambar = datagambar;
        harga = dataharga;

    }

    public String getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }
}

