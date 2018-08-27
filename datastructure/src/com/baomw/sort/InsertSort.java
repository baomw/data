package com.baomw.sort;

/**
 * 描述:
 * 插入排序算法
 *
 * @author baomw
 * @create 2018-08-27 下午 10:32
 */
public class InsertSort {


    private int[] ints = null;
    /**
     * 无参构造
      */
    public InsertSort(){
    }

    /**
     * 构造函数
     * @param n
     * @param random
     */
    public InsertSort(int n,int random){
        //生成一个100以内的随机数组
        ints = new int[n];
        for (int i=0;i<n;i++){
            ints[i] = (int) (Math.random()*random);
        }
    }
    /**
     * 插入排序入口，传入无序数组，传出顺序数组(从小到大排序)
     * @param paramInts
     * @return
     */
    public int[] sortAsc(int[] paramInts){
        //第一层循环，遍历所有元素
        for (int i=1;i<paramInts.length;i++){
            if (paramInts[i]<paramInts[i-1]){
                //第二层遍历，确定插入位置
                for (int j=0;j<i;j++){
                    if (paramInts[i]<paramInts[j]){
                        int tempNum = paramInts[i];
                        //第三层遍历，中间元素依次后移
                        for (int k=i;k>0;k--){
                            paramInts[k] = paramInts[k-1];
;                        }
                        paramInts[j] = tempNum;
                        break;
                    }
                }
            }
        }
        return paramInts;
    }
    /**
     * 插入排序入口，传入无序数组，传出顺序数组（从大到小排序）
     * @param paramInts
     * @return
     */
    public int[] sortDesc(int[] paramInts){
        //第一层循环，遍历所有元素
        for (int i=1;i<paramInts.length;i++){
            if (paramInts[i]>paramInts[i-1]){
                //第二层遍历，确定插入位置
                for (int j=0;j<i;j++){
                    if (paramInts[i]>paramInts[j]){
                        int tempNum = paramInts[i];
                        //第三层遍历，中间元素依次后移
                        for (int k=i;k>0;k--){
                            paramInts[k] = paramInts[k-1];
                            ;                        }
                        paramInts[j] = tempNum;
                        break;
                    }
                }
            }
        }
        return paramInts;
    }
    /**
     * 插入排序入口，传入无序数组，传出顺序数组(从小到大排序)
     * @return
     */
    public int[] sortAsc() throws Exception{
        if (ints == null)
            throw new Exception("illegal construction,please put params in it.");
        return sortAsc(ints);
    }
    /**
     * 插入排序入口，传入无序数组，传出顺序数组（从大到小排序）
     * @return
     */
    public int[] sortDesc()throws Exception{
        if (ints == null)
            throw new Exception("illegal construction,please put params in it.");
        return sortDesc(ints);
    }
}
