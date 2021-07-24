# RockPaperScissors

# H04 -  가위바위보 게임하기

다음과 같이 사용자와 컴퓨터가 가위바위보를 하는 프로그램을 만들어라. 
1) 랜덤으로 가위(1), 바위(2), 보(3) 셋 중에 하나를 만든다. 
2) 사용자에게 가위(1), 바위(2), 보(3) 중에 하나를 숫자로 입력받는다. 
3) 사용자가 입력한 것과 컴퓨터가 만들어 낸 것을 비교하여

 컴퓨터가 이기면, "Computer win.."

 사용자가 이기면, "You win!"

 비기면, "Draw!" 으로 출력한다. 

4) 사용자가 0을 입력할 때까지 위 1)부터 3)을 계속 반복하다가, 끝나면 그동안 컴퓨터와 사용자가 이긴 횟수와 진 횟수, 비긴 횟수를 출력하라.


변수는 다음과 같이 사용하라.

int com_finger; // 컴퓨터가 낸 가위(1), 바위(2), 보(3)

int my_finger; //사용자가 낸 가위(1), 바위(2), 보(3)

int score[][] = new int[2][3];//결과 횟수 리스트 [[컴퓨터의 승, 무, 패], [사용자의 승, 무, 패]]

int i, j; // 반복문을 위한 변수

실행 예시
```
Enter Scissors(1) Rock(2) Paper(3) > 1
What the computer has given out is Scissors ---> Draw!
Enter Scissors(1) Rock(2) Paper(3) > 2
What the computer has given out is Scissors ---> You win!
Enter Scissors(1) Rock(2) Paper(3) > 3
What the computer has given out is Rock ---> You win!
Enter Scissors(1) Rock(2) Paper(3) > 3
What the computer has given out is Paper ---> Draw!
Enter Scissors(1) Rock(2) Paper(3) > 2
What the computer has given out is Scissors ---> You win!
Enter Scissors(1) Rock(2) Paper(3) > 1
What the computer has given out is Paper ---> You win!
Enter Scissors(1) Rock(2) Paper(3) > 1
What the computer has given out is Paper ---> You win!
Enter Scissors(1) Rock(2) Paper(3) > 1
What the computer has given out is Rock ---> Computer win..
Enter Scissors(1) Rock(2) Paper(3) > 0
Computer : win - 1, lost - 5, draw - 2
User : win - 5, lost - 1, draw - 2
```