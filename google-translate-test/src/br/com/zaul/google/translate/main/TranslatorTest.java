package br.com.zaul.google.translate.main;

import java.io.InputStream;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import com.gtranslate.Translator;

public class TranslatorTest {

	public static void main(String[] args) {
		try {
			testTranslateSound();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String translateText(String text, String languageInput, String languageOutput) {
		Translator translator = Translator.getInstance();
		
		return translator.translate(text, languageInput, languageOutput);
		
	}
	
	private static void testTranslateSound() throws Exception {
		String originalText = "Welcome to Service Oriented Architecture For Dummies, 2nd IBM Limited Edition.";
		String translatedText = translateText(originalText, Language.ENGLISH, Language.PORTUGUESE);
		
		Audio audio = Audio.getInstance();
		
		InputStream sound = audio.getAudio(translatedText, Language.PORTUGUESE);
		audio.play(sound);
		
	}
}
