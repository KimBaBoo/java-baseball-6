package baseball;

import java.util.List;

public interface GameItem {
    List<Integer> computer();
    void showStrikeAndBall(int strikes, int balls);
    boolean checkForStrikes(List<Integer> numList);
    boolean isDuplicated(List<Integer> numList);
    boolean validateLength(String input);
}