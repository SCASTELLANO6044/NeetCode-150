package org.example.utils;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area = 0;

        while (i<j){
            int currArea = (j-i+1)*Math.min(height[i],height[j]);
            if (currArea > area){
                area = currArea;
            }
            if (height[i+1] > height[i]){
                i++;
            }else{
                j--;
            }
        }
        return area;
    }
}
