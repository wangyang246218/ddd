package test;
import java.util.*;   

public class MathDemo {
	  public static void main(String[] args){   
	    int x;  
	    Scanner in = new Scanner(System.in);//����Ӽ�������   
	    System.out.print("������һ��������:");//��ʾ   
	    x = in.nextInt(); //���Ӽ������������ֵ��x   
	    new PrimeSplit(x); //������ʼ��һ�����󣬻��в����Ĺ��캯��   
	  }   
	}   
	class PrimeSplit{   
	  int k = 2; //����С��������ֵ��k   
	  public PrimeSplit(int x){  //С�ڵ���1���������Էֽ�   
	    if(x<=1){   
	      System.out.println(x+"����Ч�ı��ֽ���");   
	    }   
	    else if(x==2){   
	      System.out.println(x+"�ֽ���������Ϊ: 1*"+x);   //������������С����2��   
	    }else {   
	      System.out.print(x+"�ֽ���������Ϊ: 1"); //1�����е�������������   
	      while(k<=x){   //����������Ա�k����   
	        if(x%k==0){   
	          System.out.print("*"+k);           //��k��ӵ������   
	          x = x/k;//������С����������ѭ��   
	          }   
	         else{   
	          k++;   
	          }   
	        }   
	      }   
	    }      
	  }
