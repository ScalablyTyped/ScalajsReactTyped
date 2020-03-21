package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "jSXElement")
@js.native
object jSXElement extends js.Object {
  def apply(): JSXElement_ = js.native
  def apply(openingElement: JSXOpeningElement_): JSXElement_ = js.native
  def apply(openingElement: JSXOpeningElement_, closingElement: JSXClosingElement_): JSXElement_ = js.native
  def apply(
    openingElement: JSXOpeningElement_,
    closingElement: JSXClosingElement_,
    children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
  ): JSXElement_ = js.native
  def apply(
    openingElement: JSXOpeningElement_,
    closingElement: JSXClosingElement_,
    children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
    selfClosing: Boolean
  ): JSXElement_ = js.native
}

