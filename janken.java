package hello.java;
import java.util.Scanner;
public class janken {
	public static void main(String[] args) {
		//グーは１チョキは２パーは３
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

//if((a==0)||(a>=4)) {
//System.out.println("1~3で入力してください！");
//}
//if((b==0)||(b>=4)) {
//System.out.println("1~3で入力してください！");
//}			
//「1~3以外の値」を入力された時の対処法が分かりませんでした・・・

		if(a==1) {
			System.out.println("Aさんはグーを出しました");
		}else if(a==2) {
			System.out.println("Aさんはチョキを出しました");
		}else if(a==3) {
			System.out.println("Aさんはパーを出しました");
		}

		if(b==1) {
			System.out.println("Bさんはグーを出しました");
		}else if(b==2) {
			System.out.println("Bさんはチョキを出しました");
		}else if(b==3) {
			System.out.println("Bさんはパーを出しました");
		}

		if(a==b) {
			System.out.println("あいこです！");
		}else if((a==1)&&(b==2)||(a==2)&&(b==3)
				||(a==3)&&(b==1)){
			System.out.println("Aさんの勝ちです！");
		}else if((a==1)&&(b==3)||(a==2)&&(b==3)
				||(a==3)&&(b==2)){
			System.out.println("Bさんの勝ちです！");
		}
	}
}
//効率が悪いような気がしますが、より良い書き方があればご教授お願いします・・・。
