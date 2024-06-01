package prob2;

public class prob2 {
    public static char findChar(String str, int index, char currentMin) {
        if (index == str.length()) {
            return currentMin;
        } else {
            char currentChar = str.charAt(index);
            if (currentChar < currentMin) {
                currentMin = currentChar;
            }
            return findChar(str, index + 1, currentMin);
        }
    }

    public static void main(String[] args) {
        String str = "cat";
        char minChar = findChar(str, 0, str.charAt(0));
        System.out.println("Minimum character is: " + minChar);
    }
}

