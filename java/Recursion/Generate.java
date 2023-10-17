package Recursion;

public class Generate {
    public static void main(String[] args) {
        generate("","abc",0);
    }
    private static void generate(String output,String input,int index){

        if (input.length()==0){
            System.out.println(output);
            return;
        }

        generate(output+input.charAt(index),input.substring(index+1),index);

        generate(output,input.substring(index+1),index);
    }
}
