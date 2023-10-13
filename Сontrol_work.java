
import java.util.Arrays;

public class Сontrol_work {
    public static void main(String[] args) {
        String str = "Hello, 2, world, :-)";
        getNewString(str);
        
    }
    public static void getNewString(String str) {
        String cleanString = str.replace(",", "");
        String[] newString = cleanString.split(" ");
        int count = 0;
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].length() <= 3)
                count++;
        }
        String[] result = new String[count];
        int j = 0;
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].length() <= 3) {
                result[j] = newString[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newString) + " -> " + Arrays.toString(result));

    }


}
