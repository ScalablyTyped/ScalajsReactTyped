package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.inlineCode
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCode
  extends Literal
     with StaticPhrasingContent {
  @JSName("type")
  var type_InlineCode: inlineCode
}

object InlineCode {
  @scala.inline
  def apply(`type`: inlineCode, value: js.Any, data: Data = null, position: Position = null): InlineCode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineCode]
  }
}

