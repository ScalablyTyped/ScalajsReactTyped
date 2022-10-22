package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.JSXText
  - typingsJapgolly.swcWasm.mod.JSXExpressionContainer
  - typingsJapgolly.swcWasm.mod.JSXSpreadChild
  - typingsJapgolly.swcWasm.mod.JSXElement
  - typingsJapgolly.swcWasm.mod.JSXFragment
*/
trait JSXElementChild extends StObject
object JSXElementChild {
  
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
  
  inline def JSXSpreadChild(expression: Expression, span: Span): typingsJapgolly.swcWasm.mod.JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXSpreadChild]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typingsJapgolly.swcWasm.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXText]
  }
}
