public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        boolean result = false;
        int length = chars.length,check=0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                length--;
            }else if (Character.isUpperCase(chars[i])) {
               check++;
            }
        }
        if(length == 0){
            result=true;
        }else if(check == chars.length){
            result=true;
        }else if(Character.isUpperCase(chars[0] ) && length==1){
            result=true;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        String word="FlaG";
        detectCapitalUse(word);
    }
}
