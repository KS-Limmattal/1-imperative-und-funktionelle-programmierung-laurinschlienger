public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static void hours(int sec0) {
        int sec = 0;
        int min0 = 0;
        int min = 0;
        int hours0 = 0;
        if (sec0 > 60) {
            min0 = sec0 / 60;
            sec = sec0 % 60;
        } else {
            if (sec0 > 9) {
                System.out.println("00:00:" + sec0);
            } else {
                System.out.println("00:00:0" + sec0);
            }
        }
        if (min0 > 0) {
            if (min0 > 60) {
                hours0 = min0 / 60;
                min = min0 % 60;
            } else {
                if (min0 > 9) {
                    if (sec > 9) {
                        System.out.println("00:" + min0 + ":" + sec);
                    } else {
                        System.out.println("00:" + min0 + ":0" + sec);
                    }
                } else {
                    if (sec > 9) {
                        System.out.println("00:0" + min0 + ":" + sec);
                    } else {
                        System.out.println("00:0" + min0 + ":0" + sec);
                    }
                }
            }
        }
        if (hours0 > 0) {
            if (hours0 > 9) {
                if (min > 9) {
                    if (sec > 9) {
                        System.out.println(hours0 + ":" + min + ":" + sec);
                    } else {
                        System.out.println(hours0 + ":" + min + ":0" + sec);
                    }
                } else {
                    if (sec > 9) {
                        System.out.println(hours0 + ":0" + min + ":" + sec);
                    } else {
                        System.out.println(hours0 + ":0" + min + ":0" + sec);
                    }
                }
            } else {
                if (min > 9) {
                    if (sec > 9) {
                        System.out.println(hours0 + ":" + min + ":" + sec);
                    } else {
                        System.out.println(hours0 + ":" + min + ":0" + sec);
                    }
                } else {
                    if (sec > 9) {
                        System.out.println("0" + hours0 + ":0" + min + ":" + sec);
                    } else {
                        System.out.println("0" + hours0 + ":0" + min + ":0" + sec);
                    }
                }
            }
        }
    }

    public static void distance(int x1, int y1, int x2, int y2) {
        int x = 0;
        x = x1 - x2;
        int y = 0;
        y = y1 - y2;
        int distance0 = x * x + y * y;
        int distance = (int) Math.sqrt(distance0);
        System.out.println(distance);

    }

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

    public static void main(String[] args) {
        hours(1000);
        // System.out.println(hours(3));
        // System.out.println(hours(75));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)

        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        distance(25, 20, 20, 20);
        distance(30, 30, 10, 10);
        distance(1, 1, 3, 2);
        distance(1000, 1205, 300, 742);
        System.out.println("Aufgabe c)");
        primfaktor(100);
        primfaktor(725);
        primfaktor(-50);
    }
}
