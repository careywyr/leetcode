package cn.leafw.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，
 * 则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 * @author <a href="mailto:wyr95626@95626.cn">CareyWYR</a>
 * @date 2019/6/6
 */
public class CommonChars {

    public static List<String> commonChars(String[] A) {
        List<String> arraylist = new ArrayList<>();
        String firstStr = A[0];
        for (int i = 0; i < firstStr.length(); i++) {
            for (int j = 1; j < A.length; j++) {
                String s = A[j];
                if(s.contains(firstStr.substring(i,i+1))){
                    arraylist.add(firstStr.substring(i,i+1));
                }
            }

        }
        return arraylist;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"bella","label","roller"};
        List<String> arrayList = commonChars(strs);
        arrayList.forEach(e -> System.out.println(e));
    }
}

