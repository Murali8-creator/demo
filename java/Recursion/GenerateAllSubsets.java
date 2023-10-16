package Recursion;

public class GenerateAllSubsets{



    public static void main(String[] args) {
        generate("abc","",0);

    }

    private static void generate(String input,String output,int index){



        if (index==input.length()){
            System.out.println(output);
            return;
        }


        generate(input,output+input.charAt(index),index+1);

        generate(input,output,index+1);



    }
}