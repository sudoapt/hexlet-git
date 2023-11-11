import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

//import org.apache.commons.lang3.ArrayUtils;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        String res = getHiddenCard("2034399002121100", 2);
//        String res1 = getHiddenCard("2034399002121100");
//        System.out.println(res);
//        System.out.println(res1);
//        boolean res = isPalindrome("Aha");
//        System.out.println(res);
//        System.out.println(isLeapYear(2016));
//        System.out.println(convertStr(""));
//        System.out.println(getNumberExplanation(666));
//        System.out.println(wtf(4));
//        System.out.println(printNumbers(4));
//        System.out.println(reverseStr("Yara"));
//        System.out.println(joinNumbersFromRange(1,5));
//        System.out.println(countChars("Yara", 'a'));
//        System.out.println(encrypt("IRONS"));
//        String[] lads = {"1", "2", "3"};
//        returnFromArray(lads);
//        System.out.println(Arrays.toString(getWeekends("short")));
//        int[] arr = new int[3];
//        System.out.println(Arrays.toString(arr));
//        int[] numbers2 = {1,-2,3,-4,5,6,7,8};
//        System.out.println(Arrays.toString(getSameParity(numbers2)));
//        String[] banknotes = {"eur 10", "usd 1", "usd 10", "rub 50", "usd 5"};
//        System.out.println(getTotalAmount(banknotes, "usd"));  // Outputs: 16
//        int[][] scores = {{3,3}, {4,4}, {0,0}};
//        System.out.println(getSuperSeriesWinner(scores));
//        String[][] definitions = {{"Блямба", "Выпуклость, утолщения на поверхности чего-либо"},
//                {"Бобр", "Животное из отряда грызунов"},};
//        System.out.println(buildDefinitionList(definitions));
//        var text1 = "When you play the game of thrones, you win or you die";
//        String[] stopWords1 = {"die", "play"};
//        System.out.println(makeCensored(text1, stopWords1));
//        System.out.println(countUniqChars("porshe"));
        System.out.println(Arrays.toString(getIntersectionOfSortedArrays(new int[]{10, 10, 13, 14, 18, 24, 24, 30},
                new int[]{10, 10, 11, 24, 24})));
    }



    public static String getHiddenCard(String text, int digitsToHide) {
        text = text.substring(12);
        return "*".repeat(digitsToHide) + text;
    }

    public static String getHiddenCard(String text) {
        text = text.substring(12);
        return "*".repeat(4) + text;

    }

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase();
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);


    }

    public static String convertStr(String text) {
        if (text.isEmpty()) {
            return "";
        } else if (Character.isUpperCase(text.charAt(0))) {
            return text;
        } else {
            return new StringBuilder(text).reverse().toString();
        }

    }

    public static String getNumberExplanation(int num) {
        return switch (num) {
            case 666 -> "devil number";
            case 42 -> "answer for everything";
            case 7 -> "prime number";
            default -> "just a number";
        };
    }

    public static int wtf(int num) {
        num -= 8 - num;
        return num;
    }

    public static String printNumbers(int num) {
        while (num > 0) {
            System.out.println(num--);
        }
        return "finished!";
    }

    public static String reverseStr(String str) {
        var i = 0;
        var reversedStr = "";
        while (i <= str.length() - 1) {
            reversedStr = str.charAt(i) + reversedStr;
            i++;
        }
        return reversedStr;
    }

    public static String joinNumbersFromRange(int beginNum, int endNum) {
        StringBuilder resultString = new StringBuilder();
        for (int i = beginNum; i <= endNum; i++) {
            resultString.append(i);
        }
        return resultString.toString();
    }

    public static int countChars(String text, char letter) {
        var count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.toLowerCase(text.charAt(i)) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }

    public static String encrypt(String text) {
        StringBuilder encryptedStr = new StringBuilder();
        int i = 0;
        for (; i < text.length() - 1; i += 2) {
            encryptedStr.append(text.charAt(i + 1)).append(text.charAt(i));
        }
        if (i < text.length()) {
//            if the string has an odd length
//            then there will be one char left
//            after length()-1, that we simply append
            encryptedStr.append(text.charAt(i));
        }
        return encryptedStr.toString();
    }

    public static void returnFromArray(String[] array) {
        for (String i : array
        ) {
            System.out.println(i);

        }
    }

    public static String[] getWeekends(String format) {
        String[] longDays = {"saturday", "sunday"};
        String[] shortDays = {"sat", "sun"};

        if (format.equals("short")) {
            return shortDays;
        }
        return longDays;
    }

    public static int[] getSameParity(int[] nums) {
        if (nums.length == 0) return new int[0]; // Return an empty array if the input array is empty

//        setting up the pattern to match against
        boolean isEven = nums[0] % 2 == 0;
        int[] newArr = new int[nums.length];
        int j = 0;

        for (int num : nums
        ) {
//            check if the number has the same parity as the first number
//            if the 0th element is odd and num is odd, or vice versa we add it to the newArr
            if ((Math.abs(num) % 2 == 0) == isEven) {
                newArr[j] = num;
                j++;
            }
        }
        return Arrays.copyOfRange(newArr, 0, j);
    }

    public static int getTotalAmount(String[] wallet, String currency) {
        int total = 0;
        for (String sum : wallet
        ) {
            String[] currencies = sum.split(" "); // empty space is a delimiter
            if (currencies[0].equals(currency)) {
                total += Integer.parseInt(currencies[1]);
            }
        }
        return total;
    }

    public static String getSuperSeriesWinner(int[][] games) {
        int teamOneGamesWonTotal = 0;
        int teamTwoGamesWonTotal = 0;

        for (var game : games
        ) {
            if (game[0] > game[1]) {
                teamOneGamesWonTotal++;
            } else if (game[0] < game[1]) {
                teamTwoGamesWonTotal++;
            }
        }
        if (teamOneGamesWonTotal > teamTwoGamesWonTotal) {
            return "canada";
        } else if (teamOneGamesWonTotal < teamTwoGamesWonTotal) {
            return "ussr";
        }
        return "draw";
    }

    public static String buildDefinitionList(String[][] definitions) {
        var resultingString = new StringBuilder("<dl><dt>");
        if (definitions.length == 0) {
            return "";
        }
        for (var def : definitions
        ) {
            resultingString
                    .append(def[0])
                    .append("</dt><dd>")
                    .append(def[1])
                    .append("</dd><dt>");
        }
        resultingString.delete(resultingString.length()-9, resultingString.length());
        resultingString.append("</dd></dl>");

        return resultingString.toString();
    }

    public static String makeCensored(String text, String[] stopWords){
        var mask = "$#%!";
        var words = text.split(" ");
        var result = new StringJoiner(" ");
        for(var word: words){
            for(var stopW:stopWords){
                if (word.equals(stopW)){
                    word=mask;
                }
            }
            result.add(word);
        }
        return result.toString();
    }

    public static long countUniqChars(String text){
        return text.chars().distinct().count();
    }

//    public static int[] getIntersectionOfSortedArrays(int[]arr1, int[]arr2){
//        int[] resArr = new int[arr1.length-1];
//        int r = 0;
//        for (int i:arr1
//             ) {
//            for (int j:arr2
//                 ) {
//                if(i==j){
//                    resArr[r] = i;
//                    r++;
//                }
//            }
//        }
//        return resArr;
//    }

    public static int[] getIntersectionOfSortedArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        Integer lastIntersection = null; // int can't be null, and we can have 0 to compare against
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if(lastIntersection == null || arr1[i] != lastIntersection){
                    list.add(arr1[i]);
                    lastIntersection = arr1[i]; // no we check against this one
                }
                i++;
                j++;
            }
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }


}
