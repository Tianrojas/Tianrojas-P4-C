package hangman.model;

import java.util.ArrayList;

public class ExampleClass implements Example {

	@Override
	public int methodExample(ArrayList<Integer> positions) {
		int gameScore = 0;
		if(positions.size() == 0){
            gameScore -= 5;
        }
		return gameScore;
	}
}
