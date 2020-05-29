package com.example.gamingstore;

public class Menu {

    private String nama;
    private String des;
    private String gambar;

    public Menu(String datanama, String datades, String datagambar){
        nama=datanama;
        des=datades;
        gambar=datagambar;
    }

    public String getNama() {
        return nama;
    }

    public String getDes() {
        return des;
    }

    public String getGambar() {
        return gambar;
    }
}
}
