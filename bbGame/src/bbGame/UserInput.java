package bbGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
	 public List<Integer> userInput(){
	        System.out.println("3자리숫자를 입력해주세요");
	        Scanner sc = new Scanner(System.in);
	        List<Integer> playerNum = new ArrayList<>();
	        String input = sc.next();

	        for(String number: input.split("")){
	            playerNum.add(Integer.parseInt(number));
	        }
	        return playerNum;
	    }
}

//sacnner.next()로 입력받은 값은 string타입으로
//split을 통해 3자리로 분리 -> parseint를 통해int타입으로 바꿔줌
//이 값을 배열값에 담는다.