// Generated from kangaroo.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link kangarooParser}.
 */
public interface kangarooListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link kangarooParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(kangarooParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(kangarooParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(kangarooParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(kangarooParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(kangarooParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(kangarooParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(kangarooParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(kangarooParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(kangarooParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(kangarooParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(kangarooParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(kangarooParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(kangarooParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(kangarooParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(kangarooParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(kangarooParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(kangarooParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(kangarooParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#operate}.
	 * @param ctx the parse tree
	 */
	void enterOperate(kangarooParser.OperateContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#operate}.
	 * @param ctx the parse tree
	 */
	void exitOperate(kangarooParser.OperateContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(kangarooParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(kangarooParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link kangarooParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(kangarooParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link kangarooParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(kangarooParser.AssignmentContext ctx);
}