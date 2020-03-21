package typingsJapgolly.grommet

import typingsJapgolly.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorRadius extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var radius: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object AnonColorRadius {
  @scala.inline
  def apply(color: ColorType = null, radius: String = null, width: String = null): AnonColorRadius = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorRadius]
  }
}

