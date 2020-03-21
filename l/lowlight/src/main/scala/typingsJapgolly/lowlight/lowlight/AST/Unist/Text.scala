package typingsJapgolly.lowlight.lowlight.AST.Unist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends Node {
  var value: String
}

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

