package test;
import java.util.Scanner;  

public class CharNumber {
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        int abcCount=0;//Ӣ����ĸ����  
	        int spaceCount=0;//�ո������  
	        int numCount=0;//���ָ���  
	        int otherCount=0;//�����ַ�����  
	        Scanner scan=new Scanner(System.in);  
	        String str=scan.nextLine();  
	        char[] ch = str.toCharArray();  
	        for(int i=0;i<ch.length;i++){  
	        if(Character.isLetter(ch[i])){  
	        //�ж��Ƿ���ĸ  
	        abcCount++;  
	        }  
	        else if(Character.isDigit(ch[i])){  
	        //�ж��Ƿ�����  
	        numCount++;  
	        }  
	        else if(Character.isSpaceChar(ch[i])){  
	        //�ж��Ƿ�ո��  
	        spaceCount++;  
	        }  
	        else{  
	        //���϶���������Ϊ�������ַ�  
	        otherCount++;  
	        }  
	        }  
	        System.out.println("��ĸ������"+abcCount);  
	        System.out.println("���ָ�����"+numCount);  
	        System.out.println("�ո������"+spaceCount);  
	        System.out.println("�����ַ�������"+otherCount);  
	        }  
	  
	}

