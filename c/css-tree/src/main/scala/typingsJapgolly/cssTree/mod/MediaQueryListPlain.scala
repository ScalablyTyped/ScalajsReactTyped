package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryListPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_MediaQueryListPlain: typingsJapgolly.cssTree.cssTreeStrings.MediaQueryList
}

object MediaQueryListPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.MediaQueryList,
    loc: CssLocation = null
  ): MediaQueryListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryListPlain]
  }
}

