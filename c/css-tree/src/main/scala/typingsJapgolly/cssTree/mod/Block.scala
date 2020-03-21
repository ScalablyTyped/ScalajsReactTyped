package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Block: typingsJapgolly.cssTree.cssTreeStrings.Block
}

object Block {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Block,
    loc: CssLocation = null
  ): Block = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

