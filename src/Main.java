public class Main {
    public static void main(String[] args) {

        char[] chars = "J@va the be$t!123".toCharArray();
        int left = 0;
        int right = chars.length -1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        System.out.println(new String(chars));
    }
}
