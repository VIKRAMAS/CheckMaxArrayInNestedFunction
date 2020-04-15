// Generated from com\functionvalidate\validate\FunctionTokenizer.g4 by ANTLR 4.7.2
package com.functionvalidate.validate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionTokenizerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionTokenizerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionTokenizerParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(FunctionTokenizerParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionTokenizerParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionTokenizerParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionTokenizerParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(FunctionTokenizerParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionTokenizerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FunctionTokenizerParser.ExprContext ctx);
}