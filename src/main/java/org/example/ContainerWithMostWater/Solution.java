package org.example.ContainerWithMostWater;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        int minHeight = 0;
        int area = 0;
        while (left < right) {

            if (height[left] < height[right]) {
                minHeight = height[left];
                left++;
            } else {
                minHeight = height[right];
                right--;
            }

            area = minHeight * (right - left + 1);
            if (area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }
}



