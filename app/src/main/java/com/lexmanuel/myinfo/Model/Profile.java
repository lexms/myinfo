package com.lexmanuel.myinfo.Model;
/*
 * Tanggal Pengerjaan    : 16/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */
public class Profile {
    String foto,nim,nama,kelas,deskripsi;

    public Profile() {

    }

    public Profile(String foto, String nim, String nama, String kelas, String deskripsi) {
        this.foto = foto;
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.deskripsi = deskripsi;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
