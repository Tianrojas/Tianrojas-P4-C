package hangman.setup.guice.factories;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import hangman.model.gameScore.GameScore;
import hangman.setup.guice.HangmanFactoryServices.GameScoreOption;
import java.util.Map;

@Singleton
public class InputGameScoreFactory implements GameScoreFactory{
	
	Map<GameScoreOption, GameScore> mapBinderGameScore;
	
	@Inject
	public InputGameScoreFactory(Map<GameScoreOption, GameScore> mapBinderGameScore) {
		this.mapBinderGameScore = mapBinderGameScore;
	}
	
	@Override
	public GameScore getGameScore(String value) {
		if(value.equals("BS")){
			return mapBinderGameScore.get(GameScoreOption.BonusScore);
		}else if (value.equals("PS")){
			return mapBinderGameScore.get(GameScoreOption.PowerScore);
		}else {
			return mapBinderGameScore.get(GameScoreOption.OriginalScore);
		}
	}
	
}
