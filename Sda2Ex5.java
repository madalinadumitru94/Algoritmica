package SDA2.Ex5;

import java.util.ArrayList;

public class Sda2Ex5 {

    //5. Scrie o functie care primeste un array si un numar n.
    //Returneaza decate ori apare numarul n in array.
    //Acum transforma functia in felul urmator: functia va primi un array, un numar n si in plus si un numar k.
    // Returneaza index-ul celei de-a k aparitii a numarului n in array.
    // De exemplu, pentru 19 14 17 15 17, indexul celei de-a 2-a aparitii a lui 17 in array este 5.

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        int n = 3;
        int k = 2;
        try {
            System.out.println(getIndexOfKthOccurence(numbers, k, n));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getIndexOfKthOccurence(ArrayList<Integer> numbers, int k, int n) throws Exception{
        int count = 0;
        //parcurgi un array
//        for (Integer number: numbers){
//            if (number == n){
//                count++;
//                if (count == k){
//                    return numbers.indexOf(number);
//                }
//            }
//        }
        // Problema: rezultatul era 2. Din debug si chatGPT am aflat ca indexOf returneaza doar prima aparitie a numarului n si nu merge mai departe

        int index = 0;
        for (int number : numbers) {
            if (number == n) {
                count++;
                if (count == k) {
                    return index;
                }
            }
            index++;
        }
        throw new Exception(k + "the occurence of " + n + "don't exist");
    }
}
