import java.util.Scanner;


public class duplicatess {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]){
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0'){
				System.out.print(String.valueOf(ch[i]));
			}
		}
		
	}

}
