package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.JSXText
  - typingsJapgolly.swcCore.typesMod.JSXExpressionContainer
  - typingsJapgolly.swcCore.typesMod.JSXSpreadChild
  - typingsJapgolly.swcCore.typesMod.JSXElement
  - typingsJapgolly.swcCore.typesMod.JSXFragment
*/
trait JSXElementChild extends StObject
object JSXElementChild {
  
  inline def JSXElement(children: js.Array[JSXElementChild], opening: JSXOpeningElement, span: Span): typingsJapgolly.swcCore.typesMod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXElement]
  }
  
  inline def JSXExpressionContainer(expression: JSXExpression, span: Span): typingsJapgolly.swcCore.typesMod.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXExpressionContainer]
  }
  
  inline def JSXFragment(
    children: js.Array[JSXElementChild],
    closing: JSXClosingFragment,
    opening: JSXOpeningFragment,
    span: Span
  ): typingsJapgolly.swcCore.typesMod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXFragment]
  }
  
  inline def JSXSpreadChild(expression: Expression, span: Span): typingsJapgolly.swcCore.typesMod.JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXSpreadChild]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typingsJapgolly.swcCore.typesMod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXText]
  }
}
