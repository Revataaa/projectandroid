package com.example.gamingstore;

public class Menu {

    private String nama;
    private String harga;
    private String gambar;

    public Menu(String datanama, String dataharga, String datagambar){
        nama=datanama;
        harga=dataharga;
        gambar=datagambar;
    }

    public String getNama() {
        return nama;
    }

    public String getharga() {
        return harga;
    }

    public String getGambar() { return gambar;}

}

