import java.util.*;
class output {

public static void main(String a[]){
String msg = "http://10.123.43.67:80/";
StringTokenizer st = new StringTokenizer(msg,"://");
while(st.hasMoreTokens()){
System.out.print(st.nextToken()+" ");
}
System.out.println();
}
}
