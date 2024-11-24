package Matematika;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih matematika = new MatematikaCanggih();
        
        int [][] pairs = {
            {15, 2},
            {29, 5},
            {100, 7},
            {123, 10},
            {14, 3}
            
        };
        
        System.out.println("Hasil Penghitungan");
        for (int[] pair : pairs){
            int a = pair[0];
            int b = pair[1];
            
            int resultTambah = matematika.tambah(a, b);
            System.out.println(a + " + " + b + " = " + resultTambah);
            
            int resultKali = matematika.kali(a, b);
            System.out.println(a + " * " + b + " = " + resultKali);
            
            int resultModulus = matematika.modulus(a, b);
            System.out.println(a + " % " + b + " = " + resultModulus);
            
            System.out.println(".......................................");
        }
    }
}
