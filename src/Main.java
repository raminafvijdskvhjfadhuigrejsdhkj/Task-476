public class Main {


    public static class Solution {
        public static int findComplement(int num) {

            int mask = (1 << Integer.toBinaryString(num).length()) - 1;

            return num ^ mask;
        }
    }

    public static void main(String[] args) {
        int num = 999;

        System.out.println(Solution.findComplement(num));
    }
}
