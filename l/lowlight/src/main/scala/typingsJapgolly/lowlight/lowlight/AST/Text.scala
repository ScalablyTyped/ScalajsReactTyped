package typingsJapgolly.lowlight.lowlight.AST

import typingsJapgolly.lowlight.lowlight.AST.Unist.Data
import typingsJapgolly.lowlight.lowlight.AST.Unist.Location
import typingsJapgolly.lowlight.lowlight.HastNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends typingsJapgolly.lowlight.lowlight.AST.Unist.Text
     with HastNode

object Text {
  @scala.inline
  def apply(`type`: String, value: String, data: Data = null, position: Location = null): Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

