package typingsJapgolly.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Statement
  extends StObject
     with _Node
object _Statement {
  
  inline def AssignmentStatement(init: js.Array[Expression], variables: js.Array[IndexExpression | MemberExpression | Identifier]): typingsJapgolly.luaparse.libAstMod.AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.AssignmentStatement]
  }
  
  inline def CallStatement(expression: CallExpression | StringCallExpression | TableCallExpression): typingsJapgolly.luaparse.libAstMod.CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.CallStatement]
  }
  
  inline def DoStatement(body: js.Array[Statement]): typingsJapgolly.luaparse.libAstMod.DoStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.DoStatement]
  }
  
  inline def ForGenericStatement(body: js.Array[Statement], iterators: js.Array[Expression], variables: js.Array[Identifier]): typingsJapgolly.luaparse.libAstMod.ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForGenericStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.ForGenericStatement]
  }
  
  inline def ForNumericStatement(body: js.Array[Statement], end: Expression, start: Expression, variable: Identifier): typingsJapgolly.luaparse.libAstMod.ForNumericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], step = null)
    __obj.updateDynamic("type")("ForNumericStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.ForNumericStatement]
  }
  
  inline def FunctionDeclaration(body: js.Array[Statement], isLocal: Boolean, parameters: js.Array[Identifier | VarargLiteral]): typingsJapgolly.luaparse.libAstMod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], identifier = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.FunctionDeclaration]
  }
  
  inline def GotoStatement(label: Identifier): typingsJapgolly.luaparse.libAstMod.GotoStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GotoStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.GotoStatement]
  }
  
  inline def IfStatement(clauses: js.Array[IfClause | ElseifClause | ElseClause]): typingsJapgolly.luaparse.libAstMod.IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.IfStatement]
  }
  
  inline def LabelStatement(label: Identifier): typingsJapgolly.luaparse.libAstMod.LabelStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabelStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.LabelStatement]
  }
  
  inline def LocalStatement(init: js.Array[Expression], variables: js.Array[Identifier]): typingsJapgolly.luaparse.libAstMod.LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LocalStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.LocalStatement]
  }
  
  inline def RepeatStatement(body: js.Array[Statement], condition: Expression): typingsJapgolly.luaparse.libAstMod.RepeatStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RepeatStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.RepeatStatement]
  }
  
  inline def ReturnStatement(arguments: js.Array[Expression]): typingsJapgolly.luaparse.libAstMod.ReturnStatement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.ReturnStatement]
  }
  
  inline def WhileStatement(body: js.Array[Statement], condition: Expression): typingsJapgolly.luaparse.libAstMod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.WhileStatement]
  }
}
