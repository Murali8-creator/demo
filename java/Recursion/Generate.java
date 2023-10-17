package Recursion;

public class Generate {
    public static void main(String[] args) {
        generate("","abc",0);
    }
    private static void generate(String output,String input){

        if (input.length()==0){
            System.out.println(output);
            return;
        }

        generate(output+input.charAt(1),input.substring(1));

        generate(output,input.substring(1));
    }
}
