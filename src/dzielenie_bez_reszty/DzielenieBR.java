package dzielenie_bez_reszty;

import java.io.*;
public class DzielenieBR {

    public static void main(String[] args)
        throws IOException
    {
        int a, b, wynik;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj liczbę a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("podaj liczbe b: ");
        b = Integer.parseInt(br.readLine());

        wynik = a/b;

        System.out.println("Wynikiem dzielenia (bez reszty) podanych liczb jest: ");
        System.out.print(wynik);

    }
}
