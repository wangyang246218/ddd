package test;

import java.util.Scanner;
import java.util.Random;

public class Lottery {
	public static void main(String[] args) {
		String[] sample = {"iphone X","ipad","XiaoMi","HuaWei"};
		int[] number = {1,1,1,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("输入0开始抽奖");
		while(sc.nextInt()!=-1) {
			int a =(int)(Math.random()*4);
			if(a>=0&&a<1){
				if(number[0]==1) {
					System.out.println("恭喜您获得iphone X");
					number[0]--;
				} else {
					System.out.println("对不起，您抽中的iphone X已没货");
				}
			}
			if(a>=1&&a<2){
				if(number[1]==1) {
					System.out.println("恭喜您获得ipad");
					number[1]--;
				} else {
					System.out.println("对不起，您抽中的ipad已没货");
				}
			}
			if(a>=2&&a<3){
				if(number[2]==1) {
					System.out.println("恭喜您获得XiaoMi");
					number[2]--;
				} else {
					System.out.println("对不起，您抽中的XiaoMi已没货");
				}
			}
			if(a>=3&&a<4){
				if(number[3]==1) {
					System.out.println("恭喜您获得HuaWei");
					number[3]--;
				} else {
					System.out.println("对不起，您抽中的HuaWei已没货");
				}
			}
		}
	}
}

