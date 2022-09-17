package hangman.setup.guice.factories;

import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import hangman.setup.guice.HangmanFactoryServices.panelOption;
import hangman.view.hangmanPanel.HangmanPanel;

@Singleton
public class InputHangmanPanelFactory implements HangmanPanelFactory{
	
	Map<panelOption, HangmanPanel> mapBinderPanel;
	
	@Inject
	public InputHangmanPanelFactory(Map<panelOption, HangmanPanel> mapBinderPanel) {
		this.mapBinderPanel = mapBinderPanel;
	}

	@Override
	public HangmanPanel getHagnmanPanel(String value) {
		HangmanPanel gst = null;
		if(value.equals("CP")){
			gst = mapBinderPanel.get(panelOption.HangmanColoridoPanel);
		}else if (value.equals("NP")){
			gst = mapBinderPanel.get(panelOption.HangmanNoviolentoPanel);
		}else {
			gst = mapBinderPanel.get(panelOption.HangmanStickmanPanel);
		}
		return gst;
	}
	
}
