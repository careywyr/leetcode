package cn.leafw.leetcode.array;

import java.util.Arrays;

/**
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 *
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 *
 * @author <a href="mailto:wyr95626@95626.cn">CareyWYR</a>
 * @date 2019/9/16
 */
public class TransposeMatrix {

    private static int[][] transpose(int[][] A){
        int[][] b = new int[A[0].length][A.length];
        for (int i = 0; i < b.length; i++) {
            int[] row = b[i];
            for (int j = 0; j < row.length; j++) {
                b[i][j] = A[j][i];
            }
        }
        return b;
    }
}

