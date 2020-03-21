package typingsJapgolly.babelTypes

import typingsJapgolly.babelTypes.mod.JSXElement_
import typingsJapgolly.babelTypes.mod.JSXEmptyExpression_
import typingsJapgolly.babelTypes.mod.JSXExpressionContainer_
import typingsJapgolly.babelTypes.mod.JSXFragment_
import typingsJapgolly.babelTypes.mod.JSXSpreadChild_
import typingsJapgolly.babelTypes.mod.JSXText_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
  ]
}

object AnonChildren {
  @scala.inline
  def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
    ]
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}

