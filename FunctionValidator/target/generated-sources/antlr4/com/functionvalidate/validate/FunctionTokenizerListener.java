// Generated from com\functionvalidate\validate\FunctionTokenizer.g4 by ANTLR 4.7.2
package com.functionvalidate.validate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionTokenizerParser}.
 */
public interface FunctionTokenizerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionTokenizerParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(FunctionTokenizerParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionTokenizerParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(FunctionTokenizerParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionTokenizerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionTokenizerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionTokenizerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionTokenizerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionTokenizerParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(FunctionTokenizerParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionTokenizerParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(FunctionTokenizerParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionTokenizerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FunctionTokenizerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionTokenizerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FunctionTokenizerParser.ExprContext ctx);
}