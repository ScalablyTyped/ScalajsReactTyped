package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaFeature
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_MediaFeature: typingsJapgolly.cssTree.cssTreeStrings.MediaFeature
  var value: Identifier | NumberNode | Dimension | Ratio | Null
}

object MediaFeature {
  @scala.inline
  def apply(
    name: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.MediaFeature,
    loc: CssLocation = null,
    value: Identifier | NumberNode | Dimension | Ratio = null
  ): MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFeature]
  }
}

