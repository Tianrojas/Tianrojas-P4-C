package hangman.setup.guice.factories;

import com.google.inject.ImplementedBy;
import hangman.model.gameScore.GameScore;

@ImplementedBy(InputGameScoreFactory.class)
public interface GameScoreFactory {
	public GameScore getGameScore(String value);
}
