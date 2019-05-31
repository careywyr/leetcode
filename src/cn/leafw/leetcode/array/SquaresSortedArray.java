package cn.leafw.leetcode.array;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 * @author <a href="mailto:wyr95626@95626.cn">CareyWYR</a>
 * @date 2019/5/30
 */
public class SquaresSortedArray {

    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,0,3,10};
        sortedSquares(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

