package com.baomw.search;

/**
 * 描述:
 * 二分查找
 *
 * @author baomw
 * @create 2018-08-28 下午 12:09
 */
public class searchDemo {

    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5,6,12,45,67,221};

        int s = 0;
        int e = ints.length-1;
        int m = 0;

        int tagNum = 455;

        while (s<=e){
            m = (s+e)/2;
            if (tagNum == ints[m]){
                System.out.println("找到了，   "+tagNum+ "     的位置是第  "+m+"   位！");
                return;
            }else if(tagNum > ints[m]){
                s = m+1;
            }else{
                e = m-1;
            }
        }
        System.out.println("找不到！");
    }

}
