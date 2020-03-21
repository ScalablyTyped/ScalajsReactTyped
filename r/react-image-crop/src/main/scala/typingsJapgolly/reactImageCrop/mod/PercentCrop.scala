package typingsJapgolly.reactImageCrop.mod

import typingsJapgolly.reactImageCrop.reactImageCropStrings.Percentsign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PercentCrop extends Crop {
  @JSName("unit")
  var unit_PercentCrop: js.UndefOr[Percentsign] = js.undefined
}

object PercentCrop {
  @scala.inline
  def apply(
    aspect: Int | Double = null,
    height: Int | Double = null,
    unit: Percentsign = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): PercentCrop = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentCrop]
  }
}

