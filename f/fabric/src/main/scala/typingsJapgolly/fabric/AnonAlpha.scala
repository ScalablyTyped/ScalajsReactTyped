package typingsJapgolly.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object AnonAlpha {
  @scala.inline
  def apply(alpha: Int | Double = null, color: String = null, mode: String = null): AnonAlpha = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlpha]
  }
}

