package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.StringLiteral_
  - typingsJapgolly.babelTypes.mod.NumericLiteral_
  - typingsJapgolly.babelTypes.mod.NullLiteral_
  - typingsJapgolly.babelTypes.mod.BooleanLiteral_
  - typingsJapgolly.babelTypes.mod.BigIntLiteral_
  - typingsJapgolly.babelTypes.mod.JSXAttribute_
  - typingsJapgolly.babelTypes.mod.JSXClosingElement_
  - typingsJapgolly.babelTypes.mod.JSXElement_
  - typingsJapgolly.babelTypes.mod.JSXExpressionContainer_
  - typingsJapgolly.babelTypes.mod.JSXSpreadChild_
  - typingsJapgolly.babelTypes.mod.JSXOpeningElement_
  - typingsJapgolly.babelTypes.mod.JSXText_
  - typingsJapgolly.babelTypes.mod.JSXFragment_
  - typingsJapgolly.babelTypes.mod.JSXOpeningFragment_
  - typingsJapgolly.babelTypes.mod.JSXClosingFragment_
  - typingsJapgolly.babelTypes.mod.DecimalLiteral_
*/
trait Immutable
  extends StObject
     with _Node
object Immutable {
  
  inline def BigIntLiteral_(value: String): typingsJapgolly.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BigIntLiteral_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typingsJapgolly.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BooleanLiteral_]
  }
  
  inline def DecimalLiteral_(value: String): typingsJapgolly.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DecimalLiteral_]
  }
  
  inline def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_): typingsJapgolly.babelTypes.mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXAttribute_]
  }
  
  inline def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): typingsJapgolly.babelTypes.mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXClosingElement_]
  }
  
  inline def JSXClosingFragment_(): typingsJapgolly.babelTypes.mod.JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXClosingFragment_]
  }
  
  inline def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typingsJapgolly.babelTypes.mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_
  ): typingsJapgolly.babelTypes.mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null, end = null, innerComments = null, leadingComments = null, loc = null, selfClosing = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXElement_]
  }
  
  inline def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_): typingsJapgolly.babelTypes.mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXExpressionContainer_]
  }
  
  inline def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typingsJapgolly.babelTypes.mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_
  ): typingsJapgolly.babelTypes.mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXFragment_]
  }
  
  inline def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean
  ): typingsJapgolly.babelTypes.mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXOpeningElement_]
  }
  
  inline def JSXOpeningFragment_(): typingsJapgolly.babelTypes.mod.JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXOpeningFragment_]
  }
  
  inline def JSXSpreadChild_(expression: Expression): typingsJapgolly.babelTypes.mod.JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXSpreadChild_]
  }
  
  inline def JSXText_(value: String): typingsJapgolly.babelTypes.mod.JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXText_]
  }
  
  inline def NullLiteral_(): typingsJapgolly.babelTypes.mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typingsJapgolly.babelTypes.mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NumericLiteral_]
  }
  
  inline def StringLiteral_(value: String): typingsJapgolly.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.StringLiteral_]
  }
}
