package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika faisal = new Matematika(2,4);
        
        System.out.println("Hasil Penjumlahan : "+faisal.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+faisal.setPengurangan());
        System.out.println("Hasil Perkalian : "+faisal.setPerkalian());
        System.out.println("Hasil Pembagian : "+faisal.setPembagian());
    }
}