package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoElementSelector
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode] | Null
  var name: String
  @JSName("type")
  var type_PseudoElementSelector: typingsJapgolly.cssTree.cssTreeStrings.PseudoElementSelector
}

object PseudoElementSelector {
  @scala.inline
  def apply(
    name: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.PseudoElementSelector,
    children: List[CssNode] = null,
    loc: CssLocation = null
  ): PseudoElementSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementSelector]
  }
}

