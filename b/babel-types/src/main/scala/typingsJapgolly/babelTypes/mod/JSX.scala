package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.JSXAttribute_
  - typingsJapgolly.babelTypes.mod.JSXClosingElement_
  - typingsJapgolly.babelTypes.mod.JSXElement_
  - typingsJapgolly.babelTypes.mod.JSXEmptyExpression_
  - typingsJapgolly.babelTypes.mod.JSXExpressionContainer_
  - typingsJapgolly.babelTypes.mod.JSXIdentifier_
  - typingsJapgolly.babelTypes.mod.JSXMemberExpression_
  - typingsJapgolly.babelTypes.mod.JSXNamespacedName_
  - typingsJapgolly.babelTypes.mod.JSXOpeningElement_
  - typingsJapgolly.babelTypes.mod.JSXSpreadAttribute_
  - typingsJapgolly.babelTypes.mod.JSXText_
*/
trait JSX extends StObject
object JSX {
  
  inline def JSXAttribute_(end: Double, loc: SourceLocation, name: JSXIdentifier_ | JSXNamespacedName_, start: Double): typingsJapgolly.babelTypes.mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXAttribute_]
  }
  
  inline def JSXClosingElement_(end: Double, loc: SourceLocation, name: JSXIdentifier_ | JSXMemberExpression_, start: Double): typingsJapgolly.babelTypes.mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXClosingElement_]
  }
  
  inline def JSXElement_(
    children: js.Array[typingsJapgolly.babelTypes.mod.JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double
  ): typingsJapgolly.babelTypes.mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXElement_]
  }
  
  inline def JSXEmptyExpression_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXEmptyExpression_]
  }
  
  inline def JSXExpressionContainer_(end: Double, expression: Expression, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXExpressionContainer_]
  }
  
  inline def JSXIdentifier_(end: Double, loc: SourceLocation, name: String, start: Double): typingsJapgolly.babelTypes.mod.JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXIdentifier_]
  }
  
  inline def JSXMemberExpression_(
    end: Double,
    loc: SourceLocation,
    `object`: typingsJapgolly.babelTypes.mod.JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    start: Double
  ): typingsJapgolly.babelTypes.mod.JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXMemberExpression_]
  }
  
  inline def JSXNamespacedName_(end: Double, loc: SourceLocation, name: JSXIdentifier_, namespace: JSXIdentifier_, start: Double): typingsJapgolly.babelTypes.mod.JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXNamespacedName_]
  }
  
  inline def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_],
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    selfClosing: Boolean,
    start: Double
  ): typingsJapgolly.babelTypes.mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXOpeningElement_]
  }
  
  inline def JSXSpreadAttribute_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXSpreadAttribute_]
  }
  
  inline def JSXText_(end: Double, loc: SourceLocation, start: Double, value: String): typingsJapgolly.babelTypes.mod.JSXText_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXText_]
  }
}
