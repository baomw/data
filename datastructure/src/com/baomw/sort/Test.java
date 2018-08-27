package com.baomw.sort;

/**
 * 描述:
 * 插入排序测试方法
 *
 * @author baomw
 * @create 2018-08-27 下午 10:32
 */
public class Test {


    public static void main(String[] args) throws Exception{

        InsertSort sort = new InsertSort();
        //生成一个100以内的随机数组
        int[] ints = new int[5];
        for (int i=0;i<5;i++){
            ints[i] = (int) (Math.random()*100);
        }

        ints = sort.sortDesc(ints);
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }

    }
}
