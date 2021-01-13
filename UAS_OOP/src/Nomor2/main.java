
package Nomor2;


public class main {

    
    public static void main(String[] args) {
      bangundatar bd = new bangundatar();
      bd.HitungLuas();
      bd.HitungKeliling();
      
      System.out.println("NIM SAYA 201969040024");
      System.out.println("==========================");
      System.out.println("===> LUAS DAN KELILING SEGITIGA <===");
      
      segitiga st = new segitiga();
      st.HitungLuas();
      System.out.println("=============");
      st.HitungKeliling();
      
      System.out.println("=============");
      System.out.println("=============");
      System.out.println("=============");
      
      System.out.println("LUAS DAN KELILING PERSEGI");
      persegi kotak = new persegi();
      kotak.HitungLuas();
      System.out.println("=============");
      kotak.HitungKeliling();
      
      System.out.println("=============");
      System.out.println("=============");
      System.out.println("=============");
      
      System.out.println("LUAS DAN KELILING LINGKARAN");
      lingkaran bunder = new lingkaran();
      bunder.HitungLuas();
      System.out.println("=============");
      bunder.HitungKeliling();
    }
    
}
