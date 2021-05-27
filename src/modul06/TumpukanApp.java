package modul06;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(45);
        tumpukan.baca();
        tumpukan.push(56);
        tumpukan.baca();
        tumpukan.push(67);
        tumpukan.baca();
        long nilai1 = tumpukan.pop();
        System.out.println("Nilai1 = " + nilai1);
        System.out.println(" ");
        tumpukan.push(83);
        tumpukan.baca();
        tumpukan.push(27);
        tumpukan.baca();
        long nilai2 = tumpukan.pop();
        System.out.print("Nilai2 + " + nilai2);
        System.out.println(" ");
        long nilai3 = tumpukan.pop();
        System.out.print("Nilai3 + " + nilai3);
        System.out.println(" ");
        tumpukan.baca();
    }
    
}
