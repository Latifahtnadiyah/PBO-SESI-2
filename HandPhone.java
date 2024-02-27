/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package handphone;

/**
 *
 * @author Lenovo
 */
public class HandPhone {
    private String jenisHp;
    private int tahunPembuatan;

    public String setDataHP(String jenisHp, int tahunPembuatan) {
        this.jenisHp = jenisHp;
        this.tahunPembuatan = tahunPembuatan;
        return jenisHp;
    }

    public String getJenisHP() {
        return jenisHp;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Redmi Note 10S",  2021);
        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}