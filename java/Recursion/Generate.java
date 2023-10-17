package Recursion;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Generate {
    public static void main(String[] args) {
        ArrayList<String>res=generate("","abc");

        System.out.println(res);
    }
    private static ArrayList<String> generate(String output,String input){



        if (input.length()==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(output);
            return list;
        }

        ArrayList<String>left=generate(output+input.charAt(0),input.substring(1));

        ArrayList<String>right=generate(output,input.substring(1));

        left.addAll(right);

        return left;
    }
}
