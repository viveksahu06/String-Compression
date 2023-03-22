public class StringCompressionStringBuilder { 
    public static String stringCompression(String str){
        StringBuilder string=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1; 
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++; 
            i++;
        } 
        string.append(str.charAt(i));  
        if(count>1){
            string.append(count.toString());
        } 
    }  
    return string.toString();
    }
     
    public static void main(String []args){
        String str="aaabbcccd"; 
        System.out.println(stringCompression(str));
    }
}
