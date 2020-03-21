package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Value: typingsJapgolly.cssTree.cssTreeStrings.Value
}

object Value {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Value,
    loc: CssLocation = null
  ): Value = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

