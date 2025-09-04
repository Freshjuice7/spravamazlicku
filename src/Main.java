import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


int i =0;
        ArrayList<Mazlicek> list = new ArrayList ();

        while(i <= 0){
            System.out.println("Co chceš dělat?");
            System.out.println("1. přidat mazlíčka");
            System.out.println("2. Vypsat mazlíčky");

            switch (sc.nextInt()){
                case 1: {Mazlicek mazlicek = new Mazlicek();
                    list.add(mazlicek);}
                break;
                case 2:{
                    list.forEach(mazlicek -> mazlicek.toString());
                }
                break;

                default: {System.err.println("špatná hodnota zadaná");}
            }











        }






    }
}