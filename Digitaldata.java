 package com.digitalku;

public class Digitaldata {
    public static void main (String[] args){
    LatIfClass ifclass = new LatIfClass();
    
    ifclass.setInputData();
    ifclass.getNama();
    ifclass.getTotbay();
    System.out.println("\n\n  PENJUALAN KUE PADA TOKO KUE LEZAT");
    System.out.println("Jl. Sagu No. 27A Kebagusan, Jakarta Selatan");
    System.out.println("-------------------------------------------");
    System.out.println("Pembeli     : "+ifclass.nama);
    System.out.println("Kode Kue    : "+ifclass.kdkue);
    System.out.println("Nama Kue    : "+ifclass.nmkue);
    System.out.println("Harga       : Rp. "+ifclass.harga);
    System.out.println("Jumlah Beli : "+ifclass.jumbel);
    System.out.println("-------------------------------------------");
    System.out.println("TOTAL       : Rp. "+ifclass.totbay);
    System.out.println("-------------------------------------------");
    
    }
}