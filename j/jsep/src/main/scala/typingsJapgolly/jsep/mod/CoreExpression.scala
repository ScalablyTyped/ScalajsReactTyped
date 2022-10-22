package typingsJapgolly.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsep.mod.ArrayExpression
  - typingsJapgolly.jsep.mod.BinaryExpression
  - typingsJapgolly.jsep.mod.CallExpression
  - typingsJapgolly.jsep.mod.Compound
  - typingsJapgolly.jsep.mod.ConditionalExpression
  - typingsJapgolly.jsep.mod.Identifier
  - typingsJapgolly.jsep.mod.Literal
  - typingsJapgolly.jsep.mod.MemberExpression
  - typingsJapgolly.jsep.mod.ThisExpression
  - typingsJapgolly.jsep.mod.UnaryExpression
*/
trait CoreExpression extends StObject
object CoreExpression {
  
  inline def ArrayExpression(elements: js.Array[Expression]): typingsJapgolly.jsep.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.ArrayExpression]
  }
  
  inline def BinaryExpression(left: Expression, operator: String, right: Expression): typingsJapgolly.jsep.mod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.BinaryExpression]
  }
  
  inline def CallExpression(arguments: js.Array[Expression], callee: Expression): typingsJapgolly.jsep.mod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.CallExpression]
  }
  
  inline def Compound(body: js.Array[Expression]): typingsJapgolly.jsep.mod.Compound = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Compound")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.Compound]
  }
  
  inline def ConditionalExpression(alternate: Expression, consequent: Expression, test: Expression): typingsJapgolly.jsep.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.ConditionalExpression]
  }
  
  inline def Identifier(name: String): typingsJapgolly.jsep.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.Identifier]
  }
  
  inline def Literal(raw: String): typingsJapgolly.jsep.mod.Literal = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.Literal]
  }
  
  inline def MemberExpression(computed: Boolean, `object`: Expression, property: Expression): typingsJapgolly.jsep.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.MemberExpression]
  }
  
  inline def ThisExpression(): typingsJapgolly.jsep.mod.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.ThisExpression]
  }
  
  inline def UnaryExpression(argument: Expression, operator: String, prefix: Boolean): typingsJapgolly.jsep.mod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typingsJapgolly.jsep.mod.UnaryExpression]
  }
}
