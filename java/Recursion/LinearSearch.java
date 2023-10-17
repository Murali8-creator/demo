package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {

        int []arr=new int[]{1,8,4,3,6,7,8,2,4,5,8,0,8};

        int target=8;

        System.out.println(findIndex(arr,target,0));

        System.out.println(findIndexList(arr,target,0));
    }

    private static int findIndex(int []arr,int target,int index){

        if (index==arr.length)
             return -1;

        if (arr[index]==target)
            return index;

        return findIndex(arr,target,index+1);

    }

    private static ArrayList<Integer> findIndexList(int []arr,int target,int index){

        ArrayList<Integer>list=new ArrayList<>();

        if (index==arr.length)
            return list;


        if (arr[index]==target)
            list.add(index);


       ArrayList<Integer>ans=findIndexList(arr,target,index+1);

        list.addAll(ans);

        return list;
    }
}
