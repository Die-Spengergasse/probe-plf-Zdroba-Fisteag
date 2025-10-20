/**
 *
 * Hier ist die fehlende Logik zu implementieren!
 *
 * Die Testklasse darf unter keinen Umständen modifiziert werden!
 *
 */
public class Array {

    // Der gesuchte "RV" (return-value) ist hier die Summe aller Zahlen in dem
    // übergebenen int Array
    public static int arraySum(int[] arr) {
        int rv = 0;
        for (int i = 0; i < arr.length; i++) {
            rv += arr[i];
        }
        return rv;
    }

    // hier wird das größte Element des Arrays gesucht
    public static int arrayMax(int[] arr) {
        int rv = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] > rv) {
                rv = arr[i];
            } else {
                rv = rv;
            }
        }
        return rv;
    }

    // hier wird das kleinste Element des Arrays gesucht
    public static int arrayMin(int[] arr) {
        int rv = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] < rv) {
                rv = arr[i];
            } else {
                rv = rv;
            }
        }
        return rv;
    }

    // gib ein neues Array zurück, aber in der umgedrehten Reihenfolge!
    public static int[] toReversed(int[] arg) {
        for (int i = arg.length - 1; i < arg.length; i--) {
            int[] arr = new int[i];
        }
        return new int[arg.length];
    }
}
