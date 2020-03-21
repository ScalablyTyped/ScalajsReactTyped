package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_SelectorPlain: typingsJapgolly.cssTree.cssTreeStrings.Selector
}

object SelectorPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Selector,
    loc: CssLocation = null
  ): SelectorPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorPlain]
  }
}

