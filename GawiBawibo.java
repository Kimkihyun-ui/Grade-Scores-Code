package javaFund;

import javax.swing.JOptionPane;
// 클래스랑 정의해서 위에다 만들어 놓고 밑에서 가져다 쓰이는 방식
class GBG{
	private int win = 0;
	private int lose = 0;
	private int draw = 0;
	
	public String getShape(int choice) {
		if (choice == 1) return "가위";
		if (choice == 2) return "바위";
		if (choice == 3) return "보";
		return "에러";
	}
	
	public String play(int human, int com) {
		if (human == com) {
			draw++;
			return "비겼고만";
		} else if ((human == 1 && com == 3) || (human == 	2 && com == 1) || (human == 3 && com == 2)) {
           win++;
           return "역시 인간의 승리!";
        } else {
        	lose++;
        	return "네모난 상자 승...";
        }
	}
	public void Result() {
		int total = win + lose + draw;
        double winRate = (total == 0) ? 0 : (double) win / total * 100;
        System.out.println("전적: " + total + "전 " + win + "승 " + draw + "무 " + lose + "패");
        System.out.printf("승률: %.2f%%\n", winRate);
    }
}
public class GawiBawibo {
	
    public static void main(String[] args) {
    	GBG game = new GBG();
 
    	while (true) {
            String input = JOptionPane.showInputDialog("가위(1), 바위(2), 보(3)!");
            if (input == null) break; // 취소 버튼 처리
            
            int human = Integer.parseInt(input);
            if (human < 1 || human > 3) {
                System.out.println("숫자 똑바로 써라");
                break;
            }

            int com = (int)(Math.random() * 3) + 1;

            System.out.print("컴퓨터: " + game.getShape(com) + ", ");
            System.out.println("당신: " + game.getShape(human));
            
            String result = game.play(human, com);
            System.out.println(result);

            String retry = JOptionPane.showInputDialog("다시 하시겠습니까? (y/n)");
            if (retry == null || retry.equalsIgnoreCase("n")) {
                break;
            }
        }

        game.Result();
        System.out.println("게임 시마이");
    }
}







       /*
        * 사용자는 가위 바위 보 대신 1,2,3을 값으로 낼 수 있습니다.
        * 그럼 프로그램은 이 값을 분석해서 랜덤한 컴퓨터의 값(Math.random())
        * 으로 게임을 진행 시키고, 결과를 다음처럼 출력 시키세요
        * 컴 : 가위, 당신 : 보, 
        * 컴 숭리!
        * 
        * 위처럼 결과를 출력 후 게임을 다시 할 건지를 물어봅니다.
        * ex) 게임을 다시 하시겠습니까? 이때 사용자는 y or n를 입력하게 되고 이에 따라서 게임이 계속 되거나 끝나거나
        * 단 게임이 끝날 때는 총 전적, 숭, 패, 무, 승률(소수점 2자리까지)를 
        * 출력 시키고 게임을 종료시킨다.
        *  
        */
       
//       String d = "1";
//       if (d.equals(input  )) { //1과 같은지를 비교하는 의미 객체에 담겨져 있기 때문에 두 객체가 같은 객체인지? 놉 -> equals
//    	   System.out.println("같은 값입니다.");
//       }
	



