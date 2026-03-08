import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArraysBasics {

    public static void main(String[] args) {
        System.out.println("=-=-==-=-=-= Zadanie 1 =-=-==-=-=-=\n");


        //Przypadek 1: Jeżeli wiemy ile jest liczb (tablica)
        System.out.println("Przypadek 1: Stala liczba elementów w tablicy ---");
        int[] testTab = new int[5];

        testTab[0] = 10;
        testTab[1] = 25;
        testTab[2] = -4;
        testTab[3] = 42;
        testTab[4] = 17;

        System.out.println("Tablica Array.toStrinng(testTab): " + Arrays.toString(testTab));

        System.out.println("Tablica (pętla for): ");
        for (int i = 0; i < testTab.length; i++) {
            System.out.print(testTab[i] + " ");
        }

        System.out.println("Tablica (pętla for-each): ");
        for(int liczba : testTab) {
            System.out.println(liczba + " ");
        }
        System.out.println("\n");

        //Przypadek 2: Gdy elementy są usuwane/dodawane dynamicznie (LISTA)
        System.out.println("--- Przypadek 2: Dynamiczne dodawnie i usuwanie (lista) ---");
        List<Integer> testList = new ArrayList<>();

        System.out.println("Status listy po dodaniu elementów: ");
        testList.add(5);
        System.out.println("Po dodaniu 5: " + testList);
        testList.add(20);
        System.out.println("Po dodaniu 20: " + testList);
        testList.add(30);
        System.out.println("Po dodaniu 30: " + testList);
        testList.add(41);
        System.out.println("Po dodaniu 41: " + testList);
        testList.add(17);
        System.out.println("Po dodaniu 17: " + testList);

        System.out.println("\nUsuwanie elementów z listy:");
        Integer usuniety = testList.remove(1);
        System.out.println("usunięty został element o indeksie 1 (wartość " + usuniety + "): " + testList);

        boolean czyUsunieta = testList.remove(Integer.valueOf(41));
        System.out.println("Czy usunięto 41? " + czyUsunieta + ": " + testList);

        System.out.println("\nKońcowa lista: " + testList);
        System.out.println("Rozmiar listy: " + testList.size());
    }
}
