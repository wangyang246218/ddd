package test;

import java.util.Scanner;
import java.util.Random;

public class Lottery {
	public static void main(String[] args) {
		String[] sample = {"iphone X","ipad","XiaoMi","HuaWei"};
		int[] number = {1,1,1,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("����0��ʼ�齱");
		while(sc.nextInt()!=-1) {
			int a =(int)(Math.random()*4);
			if(a>=0&&a<1){
				if(number[0]==1) {
					System.out.println("��ϲ�����iphone X");
					number[0]--;
				} else {
					System.out.println("�Բ��������е�iphone X��û��");
				}
			}
			if(a>=1&&a<2){
				if(number[1]==1) {
					System.out.println("��ϲ�����ipad");
					number[1]--;
				} else {
					System.out.println("�Բ��������е�ipad��û��");
				}
			}
			if(a>=2&&a<3){
				if(number[2]==1) {
					System.out.println("��ϲ�����XiaoMi");
					number[2]--;
				} else {
					System.out.println("�Բ��������е�XiaoMi��û��");
				}
			}
			if(a>=3&&a<4){
				if(number[3]==1) {
					System.out.println("��ϲ�����HuaWei");
					number[3]--;
				} else {
					System.out.println("�Բ��������е�HuaWei��û��");
				}
			}
		}
	}
}

