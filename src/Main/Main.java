package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;

import Lexico.LexicoTokenManager;
import Lexico.SimpleCharStream;
import Lexico.Token;

public class Main {
	
	  public static void main(String args []) throws FileNotFoundException
	  {
		Token t;
	    LexicoTokenManager lexer = new LexicoTokenManager(new SimpleCharStream(new FileReader("/home/jyuls/eclipse-workspace/JAVALexico/Input/code.txt")));
	    while((t = lexer.getNextToken()).kind != LexicoTokenManager.EOF)
		{
		}
		System.out.println("\nSuccess");
	  }
}