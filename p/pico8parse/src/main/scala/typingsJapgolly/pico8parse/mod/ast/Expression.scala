package typingsJapgolly.pico8parse.mod.ast

import typingsJapgolly.pico8parse.pico8parseStrings.Colon
import typingsJapgolly.pico8parse.pico8parseStrings.Dot
import typingsJapgolly.pico8parse.pico8parseStrings.and
import typingsJapgolly.pico8parse.pico8parseStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pico8parse.mod.ast.FunctionDeclaration
  - typingsJapgolly.pico8parse.mod.ast.Identifier_
  - typingsJapgolly.pico8parse.mod.ast.Literal_
  - typingsJapgolly.pico8parse.mod.ast.TableConstructorExpression_
  - typingsJapgolly.pico8parse.mod.ast.BinaryExpression_
  - typingsJapgolly.pico8parse.mod.ast.LogicalExpression
  - typingsJapgolly.pico8parse.mod.ast.UnaryExpression_
  - typingsJapgolly.pico8parse.mod.ast.MemberExpression_
  - typingsJapgolly.pico8parse.mod.ast.IndexExpression_
  - typingsJapgolly.pico8parse.mod.ast.CallExpression_
  - typingsJapgolly.pico8parse.mod.ast.TableCallExpression_
  - typingsJapgolly.pico8parse.mod.ast.StringCallExpression_
*/
trait Expression
  extends StObject
     with _Node
object Expression {
  
  inline def BinaryExpression_(left: Expression, operator: BinaryOperator | ComparisonOperator, right: Expression): typingsJapgolly.pico8parse.mod.ast.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.BinaryExpression_]
  }
  
  inline def BooleanLiteral(raw: String, value: Boolean): typingsJapgolly.pico8parse.mod.ast.BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.BooleanLiteral]
  }
  
  inline def CallExpression_(arguments: js.Array[Expression], base: Expression): typingsJapgolly.pico8parse.mod.ast.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.CallExpression_]
  }
  
  inline def FunctionDeclaration(body: js.Array[Statement], isLocal: Boolean, parameters: js.Array[Identifier_ | VarargLiteral]): typingsJapgolly.pico8parse.mod.ast.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], identifier = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.FunctionDeclaration]
  }
  
  inline def Identifier_(name: String): typingsJapgolly.pico8parse.mod.ast.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.Identifier_]
  }
  
  inline def IndexExpression_(base: Expression, index: Expression): typingsJapgolly.pico8parse.mod.ast.IndexExpression_ = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.IndexExpression_]
  }
  
  inline def LogicalExpression(left: Expression, operator: or | and, right: Expression): typingsJapgolly.pico8parse.mod.ast.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.LogicalExpression]
  }
  
  inline def MemberExpression_(base: Expression, identifier: Identifier_, indexer: Dot | Colon): typingsJapgolly.pico8parse.mod.ast.MemberExpression_ = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.MemberExpression_]
  }
  
  inline def NilLiteral(raw: String, value: Null): typingsJapgolly.pico8parse.mod.ast.NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NilLiteral")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.NilLiteral]
  }
  
  inline def NumericLiteral(raw: String, value: Double): typingsJapgolly.pico8parse.mod.ast.NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.NumericLiteral]
  }
  
  inline def StringCallExpression_(argument: Expression, base: Expression): typingsJapgolly.pico8parse.mod.ast.StringCallExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringCallExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.StringCallExpression_]
  }
  
  inline def StringLiteral(raw: String, value: String): typingsJapgolly.pico8parse.mod.ast.StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.StringLiteral]
  }
  
  inline def TableCallExpression_(argument: Expression, base: Expression): typingsJapgolly.pico8parse.mod.ast.TableCallExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableCallExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.TableCallExpression_]
  }
  
  inline def TableConstructorExpression_(fields: js.Array[TableKey_ | TableKeyString_ | TableValue_]): typingsJapgolly.pico8parse.mod.ast.TableConstructorExpression_ = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableConstructorExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.TableConstructorExpression_]
  }
  
  inline def UnaryExpression_(argument: Expression, operator: UnaryOperator): typingsJapgolly.pico8parse.mod.ast.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.UnaryExpression_]
  }
  
  inline def VarargLiteral(raw: String, value: String): typingsJapgolly.pico8parse.mod.ast.VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VarargLiteral")
    __obj.asInstanceOf[typingsJapgolly.pico8parse.mod.ast.VarargLiteral]
  }
}
