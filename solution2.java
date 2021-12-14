class Solution {
    public binarySum(String num1, String num2) {
        int n1 = Integer.parseInt(num1, 2);
        int n2 = Integer.parseInt(num2, 2);
        return Integer.toBinaryString(n1 + n2);
    }
}