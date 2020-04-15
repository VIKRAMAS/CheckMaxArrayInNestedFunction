package com.test.functionvalidate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import com.functionvalidate.validate.FunctionTokenizerBaseVisitor;
import com.functionvalidate.validate.FunctionTokenizerParser;

public class FunctionValidateVisitorImpl  extends FunctionTokenizerBaseVisitor<String>  {
	
	
	@Override
	public String visitParse(FunctionTokenizerParser.ParseContext ctx) {
		
		System.err.println("visitParse======================================");
		return "true";
		
	}
	
	
	@Override
	public String visitFunction(FunctionTokenizerParser.FunctionContext ctx) {
		ParseTree name = ctx.getChild(0);
		System.err.println("visitFunction======================================"+name);
		if (name instanceof FunctionTokenizerParser.FunctionContext) {
			String v = visit(name);
			System.err.println("if===========================");
		}
		else {
			String v = visit(name);
			System.err.println("else==========================="+v);
		}
		return "true";
	}
	
	
	@Override
	public String visitExpr_list(FunctionTokenizerParser.Expr_listContext ctx) {
		System.err.println("visitExpr_list======================================");
		return "true";
	}
	
	@Override
	public String visitExpr(FunctionTokenizerParser.ExprContext ctx) {
		System.err.println("visitExpr======================================");
		return "true";
	}
	
	
	
}
