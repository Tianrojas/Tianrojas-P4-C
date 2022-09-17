package hangman.setup.guice.factories;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import hangman.model.language.Language;
import hangman.setup.guice.HangmanFactoryServices.LanguageOption;
import java.util.Map;

@Singleton
public class InputLanguageFactory implements LanguageFactory{
	
	final Map<LanguageOption, Language> mapBinderLanguage;

	@Inject
	public InputLanguageFactory(Map<LanguageOption, Language> mapBinderLanguage) {
		this.mapBinderLanguage = mapBinderLanguage;
	}
	
	@Override
	public Language getLanguage(String value) {
		Language lan = null;
		if(value.equals("ES")){
			lan = mapBinderLanguage.get(LanguageOption.Spanish);
		}else if (value.equals("FR")){
			lan = mapBinderLanguage.get(LanguageOption.French);
		}else {
			lan = mapBinderLanguage.get(LanguageOption.English);
		}
		return lan;
	}

}

