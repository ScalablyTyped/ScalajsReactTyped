package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: js.UndefOr[Property] = js.undefined
  var image: js.UndefOr[Property] = js.undefined
  var repeat: js.UndefOr[Property] = js.undefined
  var transparent: js.UndefOr[Property] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(
    color: Property = null,
    image: Property = null,
    repeat: Property = null,
    transparent: Property = null
  ): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (transparent != null) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

