package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Statement extends StObject
object Statement {
  
  inline def Block(statements: js.Array[Statement]): typingsJapgolly.solidityParserAntlr.mod.Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Block]
  }
  
  inline def BreakStatement(): typingsJapgolly.solidityParserAntlr.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.BreakStatement]
  }
  
  inline def ContinueStatement(): typingsJapgolly.solidityParserAntlr.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ContinueStatement]
  }
  
  inline def DoWhileStatement(body: Statement, condition: Expression): typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement]
  }
  
  inline def EmitStatement(eventCall: FunctionCall): typingsJapgolly.solidityParserAntlr.mod.EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmitStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.EmitStatement]
  }
  
  inline def ExpressionStatement(expression: Expression): typingsJapgolly.solidityParserAntlr.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ExpressionStatement]
  }
  
  inline def ForStatement(body: Statement): typingsJapgolly.solidityParserAntlr.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ForStatement]
  }
  
  inline def IfStatement(condition: Expression, trueBody: Statement): typingsJapgolly.solidityParserAntlr.mod.IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.IfStatement]
  }
  
  inline def InlineAssemblyStatement(body: AssemblyBlock, language: String): typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InlineAssemblyStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement]
  }
  
  inline def ReturnStatement(): typingsJapgolly.solidityParserAntlr.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal(expression = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ReturnStatement]
  }
  
  inline def ThrowStatement(): typingsJapgolly.solidityParserAntlr.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ThrowStatement]
  }
  
  inline def VariableDeclarationStatement(variables: js.Array[ASTNode]): typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarationStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement]
  }
  
  inline def WhileStatement(): typingsJapgolly.solidityParserAntlr.mod.WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.WhileStatement]
  }
}
