package typingsJapgolly.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.solidityParserAntlr.mod.IfStatement
  - typingsJapgolly.solidityParserAntlr.mod.WhileStatement
  - typingsJapgolly.solidityParserAntlr.mod.ForStatement
  - typingsJapgolly.solidityParserAntlr.mod.Block
  - typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement
  - typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement
  - typingsJapgolly.solidityParserAntlr.mod.ContinueStatement
  - typingsJapgolly.solidityParserAntlr.mod.BreakStatement
  - typingsJapgolly.solidityParserAntlr.mod.ReturnStatement
  - typingsJapgolly.solidityParserAntlr.mod.EmitStatement
  - typingsJapgolly.solidityParserAntlr.mod.ThrowStatement
  - typingsJapgolly.solidityParserAntlr.mod.SimpleStatement
  - typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement
*/
trait Statement extends js.Object

object Statement {
  @scala.inline
  def WhileStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode],
    initialValue: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Block,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ReturnStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement,
    expression: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def BreakStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ThrowStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ForStatement(
    body: Statement,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ForStatement,
    conditionExpression: Expression = null,
    initExpression: SimpleStatement = null,
    loc: Location = null,
    loopExpression: ExpressionStatement = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (conditionExpression != null) __obj.updateDynamic("conditionExpression")(conditionExpression.asInstanceOf[js.Any])
    if (initExpression != null) __obj.updateDynamic("initExpression")(initExpression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (loopExpression != null) __obj.updateDynamic("loopExpression")(loopExpression.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ContinueStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IfStatement,
    falseBody: Statement = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (falseBody != null) __obj.updateDynamic("falseBody")(falseBody.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}

