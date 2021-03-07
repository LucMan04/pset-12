import java.util.ArrayList;
import java.util.Arrays;

public class ProblemSet12 {
    public static void main(String[] args) {

    }

    public long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0 ){
            return -1;
        }

        return n * factorial(n - 1);
    }

    public long fibonacci(int n) {
        if (n < 0) {
            return -1;

        } else if (n == 1 || n == 2){
            return 1;

        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public long triangle(int rows) {

        if (rows == 0) {
            return 0;
        } else {
            return (rows + triangle(rows - 1));
        }
    }

    public long sumDigits(int n) {

        if (n < 0) {
            return -1;
        } else if (n == 1 ){
            return 1;
        } else if (n == 0){
            return 0;
        }

        return ((n % 10) + sumDigits(n/10));
    }

    public long powerN(int base, int exponent) {

        if (base < 1 || exponent < 1){
            return -1;
        } else if (exponent == 1){
            return base;
        }

        return (base * powerN(base, exponent-1));
    }

    public String changeXY(String text) {
        char from = 'x';
        char to = 'y';

        if (text == null){
            return null;
        } else if (text.length() < 1){
            return text;
        }
        char begin = from == text.charAt(0) ? to : text.charAt(0);
        return (begin + changeXY(text.substring(1)));
    }

    public int array11(int[] data, int index) {
        if (data == null || index < 0 || (index > data.length)) {
            return -1;
        }
        int count = 0;
        if (index >( data.length -1) ){
            return count;
        }
        if (data[index] == 11) {
            count++;
        }

        return count +  array11(data, index + 1);
    }

    public int strCount(String text, String sub) {

        if (text == null || sub == null || sub.length() == 0){
            return -1;
        }
        int subLength = sub.length();
        if (text.length() == 0 || text.length() < subLength ){
            return 0;
        }

        if (text.substring(0,subLength).equals(sub)){
            return strCount(text.substring(subLength -1), sub) + 1;
        }

        return strCount(text.substring(subLength -1), sub);
    }

    public boolean strCopies(String text, String sub, int n) {
        if (text == null || sub == null || sub.length() == 0 || n < 0){
            return false;
        }

        if (n == 0){
            return true;
        }

        int subLength = sub.length();
        if (text.length() == 0 || text.length() < subLength ){
            return false;
        }

        if (text.substring(0,subLength).equals(sub)){
            return strCopies(text.substring(subLength -1), sub, n - 1);
        } else {
            return strCopies(text.substring(subLength -1), sub, n);
        }

    }

    public int strDist(String text, String sub) {

        if (text == null || sub == null || sub.length() == 0) {
            return -1;
        }

        if (text.indexOf(sub) == -1) {
            return 0;
        }

        if (text.substring(0, sub.length()).equals(sub) && text.substring(text.length()-sub.length()).equals(sub)) {
            return text.length();
        }

        if (!text.substring(0, sub.length()).equals(sub)) {
            return strDist(text.substring(1), sub);
        }

        return strDist(text.substring(0, text.length() - 1), sub);

    }
}