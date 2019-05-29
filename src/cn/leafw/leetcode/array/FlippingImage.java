package cn.leafw.leetcode.array;

/**
 * 832. 翻转图像
 *
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 *
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 *
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *
 * @author <a href="mailto:wyr95626@95626.cn">CareyWYR</a>
 * @date 2019/5/29
 */
public class FlippingImage {

    public static int[][] flipAndInvertImage(int[][] arr) {
        for (int[] col : arr) {
            revertArr(col);
        }
        return arr;
    }

    private static int[] revertArr(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - i - 1]==1?0:1 ;
            arr[arr.length - i - 1] = arr[i]==1?0:1;
            arr[i] = temp;
        }
        if(arr.length % 2 == 1){
            arr[arr.length/2] = arr[arr.length/2]==1?0:1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1,0}, {1,0,1}, {0,0,0}};
        System.out.println("-----> before");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println(" ");
        }
        flipAndInvertImage(arr);
        System.out.println("-----> after");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println(" ");
        }
    }
}

