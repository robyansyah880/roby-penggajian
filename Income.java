/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author ovasae
 */
public class Income {
    

    String nama;
    int golongan;
    int gajiPokok;
    int gajiLembur;
    int jamKerja;
    int jamLembur;
    int tunjanganPengabdian;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getGolongan() {
        return golongan;
    }

    public void setGolongan(Integer golongan) {
        this.golongan = golongan;
    }

    public Integer getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(Integer jamKerja) {
        this.jamKerja = jamKerja;
    }

    public Integer getJamLembur() {
        return jamLembur;
    }

    public void setJamLembur(Integer jamLembur) {
        this.jamLembur = jamLembur;
    }

    public Integer getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(Integer gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public Integer getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(Integer gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public Integer getTunjanganPengabdian() {
        return tunjanganPengabdian;
    }

    public void setTunjanganPengabdian(Integer tunjanganPengabdian) {
        this.tunjanganPengabdian = tunjanganPengabdian;
    }

}
