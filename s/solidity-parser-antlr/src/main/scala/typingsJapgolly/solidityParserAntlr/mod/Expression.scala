package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.solidityParserAntlr.mod.IndexAccess
  - typingsJapgolly.solidityParserAntlr.mod.TupleExpression
  - typingsJapgolly.solidityParserAntlr.mod.BinaryOperation
  - typingsJapgolly.solidityParserAntlr.mod.Conditional
  - typingsJapgolly.solidityParserAntlr.mod.MemberAccess
  - typingsJapgolly.solidityParserAntlr.mod.FunctionCall
  - typingsJapgolly.solidityParserAntlr.mod.PrimaryExpression
*/
trait Expression
  extends StObject
     with ASTNode
object Expression {
  
  inline def BinaryOperation(left: Expression, operator: BinOp, right: Expression): typingsJapgolly.solidityParserAntlr.mod.BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryOperation")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.BinaryOperation]
  }
  
  inline def BooleanLiteral(value: Boolean): typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral]
  }
  
  inline def Conditional(falseExpression: ASTNode, trueExpression: ASTNode): typingsJapgolly.solidityParserAntlr.mod.Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Conditional")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Conditional]
  }
  
  inline def ElementaryTypeNameExpression(typeName: ElementaryTypeName): typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeNameExpression")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression]
  }
  
  inline def FunctionCall(arguments: js.Array[Expression], expression: Expression, names: js.Array[String]): typingsJapgolly.solidityParserAntlr.mod.FunctionCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionCall")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.FunctionCall]
  }
  
  inline def Identifier(name: String): typingsJapgolly.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Identifier]
  }
  
  inline def IndexAccess(base: Expression, index: Expression): typingsJapgolly.solidityParserAntlr.mod.IndexAccess = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexAccess")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.IndexAccess]
  }
  
  inline def MemberAccess(expression: Expression, memberName: String): typingsJapgolly.solidityParserAntlr.mod.MemberAccess = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberAccess")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.MemberAccess]
  }
  
  inline def NumberLiteral(number: String): typingsJapgolly.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.NumberLiteral]
  }
  
  inline def TupleExpression(components: js.Array[Expression], isArray: Boolean): typingsJapgolly.solidityParserAntlr.mod.TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.TupleExpression]
  }
}
