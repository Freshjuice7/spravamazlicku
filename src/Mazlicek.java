import java.util.Scanner;
public class Mazlicek {
    static Scanner sc = new Scanner(System.in);
    private String jmeno;
    private String druh;
    private int vek;
    private double vaha;



    Mazlicek() {

        System.out.println("Zadej jméno mazlíčka");
        this.jmeno = sc.next();
        System.out.println("Zadej druh mazlíčka");
        this.druh = sc.next();
        System.out.println("Zadej vek mazlicka");
        this.vek = sc.nextInt();
        System.out.println("Zadej vahu mazlicka");
        this.vaha = sc.nextDouble();
    }



    @Override
    public String toString() {
        System.out.println("Jméno:" + jmeno + ",Druh:" + druh + ",Vek:" + vek + ",Vaha:" + vaha);
        return null;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }
}
