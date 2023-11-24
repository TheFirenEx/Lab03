import java.util.Scanner;

public class Main { //nazwa klas (Main) z wielkiej litery

    public static void main(String[] args) {
    //zad1
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        var liczba = in.nextInt();
        System.out.println(JakaLiczba(liczba));
        System.out.println();
    //zad2
        System.out.println("Podaj ile masz lat");
        int wiek = in.nextInt();
        System.out.println(Pelnoletniosc(wiek));
        System.out.println();

    //zad3
        System.out.println("Podaj rok");
        int rok = in.nextInt();
        System.out.println(Przestepnosc(rok));
        System.out.println();
    }

    //zad1
    public static String JakaLiczba(int liczba) {
        if (liczba > 10) {
            return "Liczba " + liczba + " jest większa od 10";
        } else {
            return "Liczba " + liczba + " nie jest większa od 10";
        }
    }

    //zad2
    public static String Pelnoletniosc(int wiek) {
        if (wiek < 18) {
            return "Nie możesz uczestniczyć";
        } else {
            return "Możesz uczestniczyć";
        }
    }

    //zad3
    public static String Przestepnosc(int rok) {
        if (rok % 4 == 0) {
            return ("Ten rok jest przestepny");
        } else {
            return ("Ten rok nie jest przestępny");
        }
    }


}

//    Napisz program, który sprawdzi, czy podany rok jest rokiem przestępnym. Wykorzystaj
//   instrukcję warunkową, aby to określić.