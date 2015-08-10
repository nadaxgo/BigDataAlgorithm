package Unit1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ndy on 2015/8/10.
 */
public class InsertSort {

    public static void main(String[] args){
        Double[] arrays={2.54,3.87,1.52,-1.55,9.99,1.52,2.78,4.89};
        sort(arrays);
        for(Double i:arrays) {
            System.out.print(i + " ");

        }

    }
    //插入算法的流程
    //1.从第1个开始因为第0个是默认插入的。
    //2.嵌套循环，最坏情况为逆序排序好的情况
    //3.这里需要注意的是内层循环的 J判断必须放前面，不然会越界
    //4.如果插入的数据比前面都小，自动往后移动
    //5.直到找到比他小的。停止
    public static void sort(Double[] arrays){
        if(null == arrays || arrays.length<=1) {
            return;
        }
       else{
             int j;
            for(int i=1;i<arrays.length;++i){
                Double tmp = arrays[i];
                for( j=i; j>0&&arrays[j-1]>tmp;j--){
                    arrays[j]=arrays[j-1];
                }
               arrays[j]=tmp;
            }
        }




    }

}
