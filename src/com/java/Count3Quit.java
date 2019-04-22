package com.java;

/**
 * 500个小朋友围成一个圈，第一个小朋友从1开始数数，从1数到3。每个数到3的小朋友退出圆圈。问最后剩下的小朋友原来是在圈里是第几个位置。
 */

public class Count3Quit {

    public static void main(String[] args) {
        boolean[] arr = new boolean[500];
        for (int i = 0; i < 500; i++) {
            arr[i] = true;
        }

        int leftCount = arr.length;
        int countNum = 0;
        int index = 0;

        while(leftCount > 1) {
            if(arr[index] == true) {
                countNum++;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    leftCount--;
                }
            }

            index++;

            if(index == arr.length) {
                index = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i+1);
            }
        }
    }
}

