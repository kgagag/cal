package net.cal.sort;

/**
 * 冒泡
 * 
 * @version 0.1
 * @author wangxm
 *
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] intarr = new int[] {
            1, -2, 0, -1
        };

        for (int i = 0; i < intarr.length; i++) {
            for (int j = 0; j < intarr.length; j++) {
                if (intarr[i] < intarr[j]) {
                    int tmp = intarr[i];
                    intarr[i] = intarr[j];
                    intarr[j] = tmp;
                }
            }
        }

    }
}
