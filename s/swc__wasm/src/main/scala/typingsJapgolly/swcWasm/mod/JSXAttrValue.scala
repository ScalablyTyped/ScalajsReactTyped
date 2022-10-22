package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.Literal
  - typingsJapgolly.swcWasm.mod.JSXExpressionContainer
  - typingsJapgolly.swcWasm.mod.JSXElement
  - typingsJapgolly.swcWasm.mod.JSXFragment
*/
trait JSXAttrValue extends StObject
object JSXAttrValue {
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typingsJapgolly.swcWasm.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BigIntLiteral]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typingsJapgolly.swcWasm.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BooleanLiteral]
  }
  
  inline def JSXElement(children: js.Array[JSXElementChild], opening: JSXOpeningElement, span: Span): typingsJapgolly.swcWasm.mod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXElement]
  }
  
  inline def JSXExpressionContainer(expression: JSXExpression, span: Span): typingsJapgolly.swcWasm.mod.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXExpressionContainer]
  }
  
  inline def JSXFragment(
    children: js.Array[JSXElementChild],
    closing: JSXClosingFragment,
    opening: JSXOpeningFragment,
    span: Span
  ): typingsJapgolly.swcWasm.mod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXFragment]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typingsJapgolly.swcWasm.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXText]
  }
  
  inline def NullLiteral(span: Span): typingsJapgolly.swcWasm.mod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typingsJapgolly.swcWasm.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NumericLiteral]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typingsJapgolly.swcWasm.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.RegExpLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typingsJapgolly.swcWasm.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.StringLiteral]
  }
}
