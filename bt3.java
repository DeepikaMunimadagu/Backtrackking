public class Classroom{
    public static void FindPermutations(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion call
        //yes choice
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            FindPermutations(newstr, ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        FindPermutations(str, "");
    }
}
