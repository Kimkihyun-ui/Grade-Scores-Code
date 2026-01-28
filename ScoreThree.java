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