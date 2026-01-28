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
----------------------------------------------------------------------------------------------
2차원배열
package javaFund;

import javax.swing.JOptionPane;

public class ScoreTwo {

	public static void main(String[] args) {
		String[][] data = new String[3][2];

		while (true) {
			String input = JOptionPane.showInputDialog("국어 점수를 입력하세요");
			int score = Integer.parseInt(input);
			if (score >= 0 && score <= 100) {
				data[0][0] = input; // 점수 저장

				switch (score / 10) {
				case 10:
				case 9:
					data[0][1] = "A";
					break;
				case 8:
					data[0][1] = "B";
					break;
				default:
					data[0][1] = "F";
					break;
				}
				break;
			}
			JOptionPane.showMessageDialog(null, "다시 입력하세요.");
		}

		while (true) {
			String input = JOptionPane.showInputDialog("영어 점수를 입력하세요");
			int score = Integer.parseInt(input);
			if (score >= 0 && score <= 100) {
				data[1][0] = input; // 점수 저장 (1행 0열)
				switch (score / 10) {
				case 10:
				case 9:
					data[1][1] = "A";
					break;
				case 8:
					data[1][1] = "B";
					break;
				default:
					data[1][1] = "F";
					break;
				}
				break;
			}
		}

		while (true) {
			String input = JOptionPane.showInputDialog("수학 점수를 입력하세요");
			int score = Integer.parseInt(input);
			if (score >= 0 && score <= 100) {
				data[2][0] = input; // 점수 저장 (2행 0열)
				switch (score / 10) {
				case 10:
				case 9:
					data[2][1] = "A";
					break;
				case 8:
					data[2][1] = "B";
					break;  
				default:
					data[2][1] = "F";
					break;
				}
				break;
			}
		}
		System.out.println("국어: " + data[0][0] + "점, 학점: " + data[0][1]);
		System.out.println("영어: " + data[1][0] + "점, 학점: " + data[1][1]);
		System.out.println("수학: " + data[2][0] + "점, 학점: " + data[2][1]);
	}
}
-----------------------------------------------------------------------------------------------------------
3명에게 3과목 총점 평균 학점

package javaFund;
import java.util.*;

public class ScoreThree {

    public static void main(String[] args) {
        String[] subject = {"국어", "영어", "수학"};
        int[][] scores = new int[3][subject.length + 1];
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + (i + 1) + "번 학생 점수 입력");
            
            for (int j = 0; j < subject.length; j++) {
                do {
                    System.out.print(subject[j] + " 점수를 입력하세요: ");
                    scores[i][j] = sc.nextInt();
                } while (scores[i][j] < 0 || scores[i][j] > 100);
                
                scores[i][subject.length] += scores[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            int total = scores[i][subject.length];
            double avg = total / 3.0;
            char grade;

            switch ((int)avg / 10) {
                case 10: case 9: grade = 'A'; break;
                case 8: grade = 'B'; break;
                default: grade = 'F'; break;
            }

            System.out.print((i + 1) + "번 학생 : ");
            System.out.print("총점:" + total + ", ");
            System.out.printf("평균:%.2f, ", avg);
            System.out.println("학점:" + grade);
        }
        
        sc.close(); 
    }
}
