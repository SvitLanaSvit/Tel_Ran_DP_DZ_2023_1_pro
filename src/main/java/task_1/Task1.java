package task_1;

public class Task1 {
    public static void main(String[] args) {
        String val = "0001000111001100";
        long count = val.chars()
               .filter(i -> i == '1')
               .count();
        System.out.println(count);
        System.out.println(fromBinaryToDecimal(val));
    }

    static int fromBinaryToDecimal(String str){
        int number = 0;
        int length = str.length();
        int pow = length - 1;
        for (int i = 0; i < length; i++) {
            number += Character.getNumericValue(str.charAt(i)) * Math.pow(2,pow--);
        }
        return number;
    }
}
