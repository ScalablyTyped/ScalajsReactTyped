package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selector
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Selector: typingsJapgolly.cssTree.cssTreeStrings.Selector
}

object Selector {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Selector,
    loc: CssLocation = null
  ): Selector = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}

