# 학점스코어 나눔 
학점 스코어 나눔

package javaFund;

import javax.swing.JOptionPane;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/*
				 * 학생 성적을 국 영 수로 입력 받아서 총점 평균 학점(ABF)를 출력하도록 프로그램
				 * 프로그램이 시작되면 각 과목을 입력 받도록 하는데 입력된 점수는 반드시 0~100점 사이여야함
				 * 만약 이 범위를 벗어나면 해당 과목을 다시 입력 받도록 한다. 다른 과목으로 입력 X
				 * 
				 * 만약 올바른 값이 모두 입력되면 위 결과를 출력 시키세요 
				 * 학점 90점 이상은 A 80 이상은 B 나머진 F처리하는데 switch case로 작성
				 */
		
		int kok, eng, math = 0;
		
		while(true) {
			String input = JOptionPane.showInputDialog("국어 점수를 입력하세요");
			kok = Integer.parseInt(input);
			if (kok >= 0 && kok <= 100) break;
			JOptionPane.showMessageDialog(null,"범위를 벗어났습니다. 다시 입력하세요.");
		}
		while (true) {
            String input = JOptionPane.showInputDialog("영어 점수를 입력하세요(0~100)");
            eng = Integer.parseInt(input);
            if (eng >= 0 && eng <= 100) break;
            JOptionPane.showMessageDialog(null, "범위를 벗어났습니다. 다시 입력하세요.");
        }

        while (true) {
            String input = JOptionPane.showInputDialog("수학 점수를 입력하세요(0~100)");
            math = Integer.parseInt(input);
            if (math >= 0 && math <= 100) break;
            JOptionPane.showMessageDialog(null, "범위를 벗어났습니다. 다시 입력하세요.");
        }
        
         char Agrade, Bgrade, Cgrade;
         
         switch(kok/10) {
         case 10:
         case 9:
        	 Agrade = 'A'; break;
         case 8:
        	 Agrade = 'B'; break;
         default:
        	 Agrade = 'F'; 
        	 break;
			
		}
         switch(eng/10) {
         case 10:
         case 9:
        	 Bgrade = 'A'; break;
         case 8:
        	 Bgrade = 'B'; break;
         default:
        	 Bgrade = 'F';
        	 break;
			
		}
         switch(math/10) {
         case 10:
         case 9:
        	 Cgrade = 'A'; break;
         case 8:
        	 Cgrade = 'B'; break;
         default:
        	 Cgrade = 'F';
        	 break;
			
		}
         
        System.out.println("국어 학점은 : " + Agrade);
        System.out.println("영어 학점은 : " + Bgrade);
        System.out.println("수학 학점은 : " + Cgrade);
	}

}
