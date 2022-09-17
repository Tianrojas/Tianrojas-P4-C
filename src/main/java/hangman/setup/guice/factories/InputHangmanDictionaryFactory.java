package hangman.setup.guice.factories;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import hangman.model.dictionary.HangmanDictionary;
import hangman.setup.guice.HangmanFactoryServices.dictionaryOption;
import java.util.Map;

@Singleton
public class InputHangmanDictionaryFactory implements HangmanDictionaryFactory{
	
	Map<dictionaryOption, HangmanDictionary> mapBinderDictionary ;
	
	@Inject
	public InputHangmanDictionaryFactory(Map<dictionaryOption, HangmanDictionary> mapBinderDictionary) {
		this.mapBinderDictionary = mapBinderDictionary;
	}
	
	@Override
	public HangmanDictionary getHangmanDictionary(String value) {
		HangmanDictionary dic = null;
		if(value.equals("SD")){
			dic = mapBinderDictionary.get(dictionaryOption.SpanishDictionaryDataSource);
		}else if (value.equals("FD")){
			dic = mapBinderDictionary.get(dictionaryOption.FrenchDictionaryDataSource);
		}else {
			dic = mapBinderDictionary.get(dictionaryOption.EnglishDictionaryDataSource);
		}
		return dic;
	}
	
	
}
