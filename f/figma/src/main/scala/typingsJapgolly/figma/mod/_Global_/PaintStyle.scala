package typingsJapgolly.figma.mod._Global_

import japgolly.scalajs.react.Callback
import typingsJapgolly.figma.figmaStrings.PAINT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaintStyle extends BaseStyle {
  var paints: js.Array[Paint]
  @JSName("type")
  var type_PaintStyle: PAINT
}

object PaintStyle {
  @scala.inline
  def apply(
    description: String,
    id: String,
    key: String,
    name: String,
    paints: js.Array[Paint],
    remote: Boolean,
    remove: Callback,
    `type`: PAINT
  ): PaintStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paints = paints.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaintStyle]
  }
}

