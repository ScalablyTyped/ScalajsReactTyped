package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParenthesesPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_ParenthesesPlain: typingsJapgolly.cssTree.cssTreeStrings.Parentheses
}

object ParenthesesPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Parentheses,
    loc: CssLocation = null
  ): ParenthesesPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParenthesesPlain]
  }
}

