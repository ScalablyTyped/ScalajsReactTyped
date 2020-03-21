package typingsJapgolly.lowlight.lowlight.AST

import typingsJapgolly.lowlight.lowlight.AST.Unist.Data
import typingsJapgolly.lowlight.lowlight.AST.Unist.Location
import typingsJapgolly.lowlight.lowlight.HastNode
import typingsJapgolly.lowlight.lowlightStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment
  extends typingsJapgolly.lowlight.lowlight.AST.Unist.Text
     with HastNode {
  @JSName("type")
  var type_Comment: comment
}

object Comment {
  @scala.inline
  def apply(`type`: comment, value: String, data: Data = null, position: Location = null): Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

