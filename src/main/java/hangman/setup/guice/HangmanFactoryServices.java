/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import com.google.inject.multibindings.MapBinder;

import hangman.model.English;
import hangman.model.Example;
import hangman.model.ExampleClass;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.gameScore.*;
import hangman.model.dictionary.*;
import hangman.model.French;
import hangman.model.Language;
import hangman.setup.guice.HangmanFactoryServices.GameScoreOption;
import hangman.setup.guice.factories.GameScoreFactory;
import hangman.setup.guice.factories.InputGameScoreFactory;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;


public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
    	bind(Language.class).to(English.class);
        bind(HangmanDictionary.class).to(EnglishDictionaryDataSource.class);
        bind(HangmanPanel.class).to(HangmanStickmanPanel.class);
 
        bind(GameScoreFactory.class).to(InputGameScoreFactory.class);
    	
    	MapBinder<GameScoreOption, GameScore> mapBinderGameScore 
    	= MapBinder.newMapBinder(binder(), GameScoreOption.class, GameScore.class);

    	mapBinderGameScore.addBinding(GameScoreOption.OriginalScore).to(OriginalScore.class);
    	mapBinderGameScore.addBinding(GameScoreOption.PowerScore).to(PowerScore.class);
    	mapBinderGameScore.addBinding(GameScoreOption.BonusScore).to(BonusScore.class);
   
    }
    
    public enum GameScoreOption {
    	OriginalScore, PowerScore, BonusScore;
    }
    
    public enum LanguageOption {
    	English, French, Spanish;
    }
    
    public enum dictionaryOption {
    	EnglishDictionaryDataSource, FrenchDictionaryDataSource, SpanishDictionaryDataSource;
    }
    
    public enum panelOption {
    	HangmanColoridoPanel, HangmanNoviolentoPanel, HangmanStickmanPanel;
    }

}
