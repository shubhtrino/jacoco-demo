public class App {

    public String reverseString(String str){
        return  new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str){
        if(str!=null && str.length()>0){
            return  str.equalsIgnoreCase(reverseString(str));
        }
        return false;
    }
}
