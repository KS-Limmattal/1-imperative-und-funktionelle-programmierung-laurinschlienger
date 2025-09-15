public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static void primfaktor(int zahl) {
        System.out.println("Primfaktoren:");
        int faktor = 2;
        while (zahl != 1) {
        if (zahl % faktor == 0){
            System.out.print(faktor);
            System.out.print(",");
            zahl = zahl / faktor;
        } else {
            faktor = faktor + 1;
        }

        }

}
    public static void pi(int stellen) {
        int k = 0;
        double pi = 0;
        for (int i = 0; i <= stellen ; i++){
            double Nenner = Math.pow(-1, k);
            double zähler = 2*k + 1;
            double digits = Nenner / zähler;
            pi = pi + digits;
        }
        System.err.println(4*pi);
    }
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        primfaktor(100);
        primfaktor(35);
        primfaktor(326);
        primfaktor(725);
        primfaktor(-13075);
        primfaktor(-15);
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        /*System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println(); */
    }
}
