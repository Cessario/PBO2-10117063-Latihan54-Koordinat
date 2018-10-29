/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan54.koordinat;

/*
Nama : Cessario Sheva L.P.A
Kelas: IF-2
Nim  : 10117063
Deskripsi Program : Menampilkan Koordinat
 */
public class WarnaKoordinat extends Koordinat{
    public String namaWarna;

    public WarnaKoordinat(String namaWarna, int x, int y) {
        super(x, y);
        this.namaWarna = namaWarna;
        
        System.out.println("Warna Koordinat : "+namaWarna);
        System.out.println("Koordinat Sumbu x : " +x+ ", Y : " +y);
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }

    
    
    
}
