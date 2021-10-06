class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int max = 0;
        while (end > start) {
            int temp = (end - start) * ((height[end] <= height[start]) ? height[end--] : height[start++]);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
