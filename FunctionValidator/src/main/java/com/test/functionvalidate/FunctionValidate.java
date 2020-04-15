package com.test.functionvalidate;


/**
 * @author VIKRAM A S
 */

import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.functionvalidate.validate.FunctionTokenizerLexer;
import com.functionvalidate.validate.FunctionTokenizerParser;
import com.functionvalidate.validate.FunctionTokenizerParser.FunctionContext;
import com.test.functionvalidate.VerboseListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;



public class FunctionValidate {


	public static void main(String[] args) {
		try {
			String input = "(mul(add(input[\"data\"][0][\"name\"][][\"node\"],input[\"data\"][0]),\"input[\"data\"][0][\"name\"][][\"node\"]\")";
			ANTLRInputStream str = new ANTLRInputStream(input);
			FunctionTokenizerLexer lexer = new FunctionTokenizerLexer(str);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			FunctionTokenizerParser parser = new FunctionTokenizerParser(tokens);
			parser.removeErrorListeners(); // remove ConsoleErrorListener 
			parser.addErrorListener(new VerboseListener());
			 FunctionContext tree = parser.function();
			FunctionValidateVisitorImpl visitor = new FunctionValidateVisitorImpl();
			visitor.visit(tree);
			System.out.println("-->"+tree.toStringTree( parser ));
			AST ast=new AST(tree);
			System.out.println( "Improved ParseTree:\n" + ast.toString() );
			JFrame frame = new JFrame("Antlr AST");
			JPanel panel = new JPanel();
			TreeViewer viewr = new TreeViewer(Arrays.asList(
			parser.getRuleNames()),tree);
			viewr.setScale(1.5);
			panel.add(viewr);
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,500);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	


}
