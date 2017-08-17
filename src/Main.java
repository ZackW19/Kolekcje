import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
private static  List<String> listOfNames;   //deklaracja poza metodami daje nam mozliwość dostępu do elementów z innych metod wew. Main
private static Scanner scanner;


    public static void main(String[] args) {
       /*
         List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Oskar");  //add dodanie elementu do kolekcji
        listOfNames.add("Tomek");
        listOfNames.add("Dorota");

        for (String listOfName : listOfNames){

         System.out.println(listOfName);
*/

       listOfNames = new ArrayList<>();
       scanner = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {                                    //petla while
            printMenu();                        //metoda printMenu drukuje menu
            choice = Integer.parseInt(scanner.nextLine());  //musimy zachować typ czyli albo nextInt albo nextLine,
                                                            // dlatego parsujemy int do nextLine, ponieważ w skanerze case 1 nextLine odczytuje imię
            parseChoice(choice);                            //metoda parseChoice sprawdza wybor usera
        } while (choice != 3);
    }


    private static void printMenu(){
            System.out.println("------------------------------------------------");
            System.out.println("Wpisz: ");
            System.out.println("1 - aby dodać nowę imię");
            System.out.println("2 - aby wyświetlić wszystkie imiona");
            System.out.println("3 - aby wyjść");

            System.out.println("Twój wybór: ");

            System.out.println("------------------------------------------------");

        }

    private static void parseChoice(int choice) {
        switch (choice){
            case 1: {

                System.out.print("Wpisz imię: ");
                listOfNames.add(scanner.nextLine());
                System.out.println("Dodałem imię");
                break;
            }
            case 2: {
                System.out.println("Lista imion:");

                for (String listOfName : listOfNames) {  //petla for each
                    System.out.println(listOfName);
                }
                break;
            }

            case 3:{
                break;
            }

            default: {
                System.out.println("Nie znam takiej komendy!");

            }
            }
        }
    }





