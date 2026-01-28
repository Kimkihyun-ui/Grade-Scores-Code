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