/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author ovasae
 */
public class Sallary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        Income I = new Income();
        Tax tX = new Tax();

        System.out.println("PROGRAM MENGHITUNG GAJI KARYAWAN");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Nama : ");
        I.nama = input.next();
        System.out.print("Masukan Golongan : ");
        I.golongan = input.nextInt();
        System.out.print("Masukan Jam Kerja : ");
        I.jamKerja = input.nextInt();

        switch (I.golongan) {
            case 1:
                I.gajiPokok = 1486500;
                I.tunjanganPengabdian = 250000;
                break;
            case 2:
                I.gajiPokok = 1926000;
                I.tunjanganPengabdian = 300000;
                break;
            case 3:
                I.gajiPokok = 2456700;
                I.tunjanganPengabdian = 350000;
                break;
            case 4:
                I.gajiPokok = 2899500;
                I.tunjanganPengabdian = 400000;
                break;
            default:
                I.gajiPokok = 0;
                I.tunjanganPengabdian = 0;
        }

        if (I.jamKerja > 173) {
            I.jamLembur = I.jamKerja - 173;
        } else {
            I.jamLembur = 0;
        }

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        I.gajiLembur = I.jamLembur * 20000;
        tX.pajakGapok = 0.05 * I.gajiPokok;
        tX.pajakLembur = 0.05 * I.gajiLembur;
        tX.totalPajak = tX.pajakGapok + tX.pajakLembur;
        tX.gajiBersih = ((I.gajiPokok + I.tunjanganPengabdian + I.gajiLembur) - tX.totalPajak);

        System.out.println("Nama                 : " + I.nama);
        System.out.println("Gaji Pokok           : " + kursIndonesia.format(I.gajiPokok));
        System.out.println("Gaji Lembur          : " + kursIndonesia.format(I.gajiLembur));
        System.out.println("Pajak Gaji Pokok     : " + kursIndonesia.format(tX.pajakGapok));
        System.out.println("Pajak Lembur         : " + kursIndonesia.format(tX.pajakLembur));
        System.out.println("Total Pajak          : " + kursIndonesia.format(tX.totalPajak));
        System.out.println("Tunjangan Pengabdian : " + kursIndonesia.format(I.tunjanganPengabdian));
        System.out.println("Gaji Diterima        : " + kursIndonesia.format(tX.gajiBersih));

    }
}
