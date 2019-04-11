 package com.digitalku;
import java.util.Scanner;

public class Digitalkue {
    public String nama, nmkue, kdkue;
    public int jumbel, harga, totbay, kode;
    Scanner input = new Scanner (System.in);
    
    
    public void setInputData() {
       System.out.print("Masukkan Nama Pembeli                 : ");
       nama = input.nextLine();
       System.out.print("Masukkan Kode[1/B001][2/C001][3/T001] : ");
       kode = input.nextInt();
       System.out.print("Masukkan Jumlah Beli                  : ");
       jumbel = input.nextInt();
    }     
    public int getNama(){
        if (kode==1)
        { kdkue="B001";
          nmkue="Bolu";
          harga=10000;
        }else
        if (kode==2)
        { kdkue="C001";
          nmkue="Cake";
          harga=20000;
        }
        else
        { kdkue="T001";
          nmkue="Tart";
          harga=15000;
        }
        return kode;      
        }
    
    public int getTotbay()
    { totbay=harga*jumbel;
    return totbay;
    }
    }

