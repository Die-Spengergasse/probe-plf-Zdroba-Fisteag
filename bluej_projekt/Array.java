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
        int[] rv = new int[arg.length];
        int l = arg.length;
        for (int i = 0; i < l; i++) {
            rv[l-i-1] = arg[i];
        }
        return rv;
    }
    
    public static int closestToZero(int[] parameter_array) {
        int rv = Integer.MAX_VALUE;  // bisher gefundenes closest
        for (int item: parameter_array) {
            if (Math.abs(item) < Math.abs(rv)) {
                rv = item;
                continue;
            }
            if (Math.abs(item) == Math.abs(rv)) {
                if (item > rv) rv = item;
            }
        }
        return rv;
    }
}
