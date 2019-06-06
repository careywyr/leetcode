package cn.leafw.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * <p>
 * 你可以返回满足此条件的任何数组作为答案。
 *
 * @author <a href="mailto:wyr95626@95626.cn">CareyWYR</a>
 * @date 2019/5/31
 */
public class SortByParity {

    public static int[] sortArrayByParityOld(int[] A) {
        List<Integer> JArray = new ArrayList<>();
        List<Integer> OArray = new ArrayList<>();
        for (int num : A) {
            if (num % 2 == 0) {
                OArray.add(num);
            } else {
                JArray.add(num);
            }
        }
        OArray.addAll(JArray);
        int[] array = Arrays.stream(OArray.toArray(new Integer[OArray.size()])).mapToInt(Integer::valueOf).toArray();
        return array;
    }

    public static int[] sortArrayByParity(int[] A) {
        if (A.length == 1) {
            return A;
        }
        int lastIndex = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                continue;
            }
            while (lastIndex > i && A[lastIndex] % 2 == 1) {
                lastIndex --;
            }
            if(lastIndex > i){
                int temp = A[lastIndex];
                A[lastIndex] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2};
        sortArrayByParity(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

