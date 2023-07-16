public class Classroom{
    public static void FindSubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //recursion
        //Yes choice
        FindSubsets(str, ans+str.charAt(i), i+1);
        //No
        FindSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        FindSubsets(str, "", 0);
    }
}
