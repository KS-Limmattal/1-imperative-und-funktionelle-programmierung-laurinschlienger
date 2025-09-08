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

    public static void main(String[] args) {
        hours(1000);
        // System.out.println(hours(3));
        // System.out.println(hours(75));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
}
