import java.util.Arrays;

public class LargestNumberAfterMutating {
    public static String maximumNumber(String num, int[] change) {
        char[] input = num.toCharArray();
        boolean isChanged = false;
        for(int i=0; i<input.length; i++){
            char ch = input[i];
            int a = Character.getNumericValue(ch);
            if(change[a] == a){

            }else if(change[a] > a){
                isChanged = true;
                a = change[a];
            }else{
                if(!isChanged){
                    continue;
                }else{
                    break;
                }
            }
            input[i] = Integer.toString(a).charAt(0);
        }
        return new String(input);
    }

    public static void main(String[] args) {
        int[] nums = {0,9,2,3,3,2,5,5,5,5};
        System.out.println(maximumNumber("334111",nums));
    }


}
