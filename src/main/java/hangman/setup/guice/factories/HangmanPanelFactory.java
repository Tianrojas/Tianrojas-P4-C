package hangman.setup.guice.factories;

import com.google.inject.ImplementedBy;
import hangman.view.hangmanPanel.HangmanPanel;

@ImplementedBy(InputHangmanPanelFactory.class)
public interface HangmanPanelFactory {
	public HangmanPanel getHagnmanPanel(String value);
}
