package hangman.model.gameScore;

public class OriginalScore implements GameScore {
	
	private int gameScore = 100;
	private int penalty = 10;
	
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		return gameScore-(incorrectCount*penalty);
	}

}
