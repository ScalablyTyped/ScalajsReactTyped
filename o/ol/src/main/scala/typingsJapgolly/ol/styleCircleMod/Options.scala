package typingsJapgolly.ol.styleCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fill: js.UndefOr[typingsJapgolly.ol.fillMod.default] = js.undefined
  var radius: Double
  var stroke: js.UndefOr[typingsJapgolly.ol.strokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    radius: Double,
    fill: typingsJapgolly.ol.fillMod.default = null,
    stroke: typingsJapgolly.ol.strokeMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

