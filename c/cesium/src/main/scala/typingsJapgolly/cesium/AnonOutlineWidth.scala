package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutlineWidth extends js.Object {
  var color: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Property] = js.undefined
  var outlineWidth: js.UndefOr[Property] = js.undefined
}

object AnonOutlineWidth {
  @scala.inline
  def apply(color: Property = null, outlineColor: Property = null, outlineWidth: Property = null): AnonOutlineWidth = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutlineWidth]
  }
}

