package typingsJapgolly.estree.mod

import typingsJapgolly.estree.estreeStrings.`var`
import typingsJapgolly.estree.estreeStrings.const
import typingsJapgolly.estree.estreeStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.ExpressionStatement
  - typingsJapgolly.estree.mod.BlockStatement
  - typingsJapgolly.estree.mod.StaticBlock
  - typingsJapgolly.estree.mod.EmptyStatement
  - typingsJapgolly.estree.mod.DebuggerStatement
  - typingsJapgolly.estree.mod.WithStatement
  - typingsJapgolly.estree.mod.ReturnStatement
  - typingsJapgolly.estree.mod.LabeledStatement
  - typingsJapgolly.estree.mod.BreakStatement
  - typingsJapgolly.estree.mod.ContinueStatement
  - typingsJapgolly.estree.mod.IfStatement
  - typingsJapgolly.estree.mod.SwitchStatement
  - typingsJapgolly.estree.mod.ThrowStatement
  - typingsJapgolly.estree.mod.TryStatement
  - typingsJapgolly.estree.mod.WhileStatement
  - typingsJapgolly.estree.mod.DoWhileStatement
  - typingsJapgolly.estree.mod.ForStatement
  - typingsJapgolly.estree.mod.ForInStatement
  - typingsJapgolly.estree.mod.ForOfStatement
  - typingsJapgolly.estree.mod.Declaration
*/
trait Statement extends StObject
object Statement {
  
  inline def BlockStatement(body: js.Array[Statement]): typingsJapgolly.estree.mod.BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.BlockStatement]
  }
  
  inline def BreakStatement(): typingsJapgolly.estree.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.BreakStatement]
  }
  
  inline def ClassDeclaration(body: ClassBody): typingsJapgolly.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ClassDeclaration]
  }
  
  inline def ContinueStatement(): typingsJapgolly.estree.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ContinueStatement]
  }
  
  inline def DebuggerStatement(): typingsJapgolly.estree.mod.DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.DebuggerStatement]
  }
  
  inline def DoWhileStatement(body: Statement, test: Expression): typingsJapgolly.estree.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.DoWhileStatement]
  }
  
  inline def EmptyStatement(): typingsJapgolly.estree.mod.EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.EmptyStatement]
  }
  
  inline def ExpressionStatement(expression: Expression): typingsJapgolly.estree.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ExpressionStatement]
  }
  
  inline def ForInStatement(body: Statement, left: VariableDeclaration | Pattern, right: Expression): typingsJapgolly.estree.mod.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ForInStatement]
  }
  
  inline def ForOfStatement(await: Boolean, body: Statement, left: VariableDeclaration | Pattern, right: Expression): typingsJapgolly.estree.mod.ForOfStatement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ForOfStatement]
  }
  
  inline def ForStatement(body: Statement): typingsJapgolly.estree.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ForStatement]
  }
  
  inline def FunctionDeclaration(body: BlockStatement, params: js.Array[Pattern]): typingsJapgolly.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.FunctionDeclaration]
  }
  
  inline def IfStatement(consequent: Statement, test: Expression): typingsJapgolly.estree.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.IfStatement]
  }
  
  inline def LabeledStatement(body: Statement, label: Identifier): typingsJapgolly.estree.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.LabeledStatement]
  }
  
  inline def ReturnStatement(): typingsJapgolly.estree.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ReturnStatement]
  }
  
  inline def StaticBlock(body: js.Array[Statement]): typingsJapgolly.estree.mod.StaticBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.StaticBlock]
  }
  
  inline def SwitchStatement(cases: js.Array[SwitchCase], discriminant: Expression): typingsJapgolly.estree.mod.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.SwitchStatement]
  }
  
  inline def ThrowStatement(argument: Expression): typingsJapgolly.estree.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ThrowStatement]
  }
  
  inline def TryStatement(block: BlockStatement): typingsJapgolly.estree.mod.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.TryStatement]
  }
  
  inline def VariableDeclaration(declarations: js.Array[VariableDeclarator], kind: `var` | let | const): typingsJapgolly.estree.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.VariableDeclaration]
  }
  
  inline def WhileStatement(body: Statement, test: Expression): typingsJapgolly.estree.mod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.WhileStatement]
  }
  
  inline def WithStatement(body: Statement, `object`: Expression): typingsJapgolly.estree.mod.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.WithStatement]
  }
}
