package typingsJapgolly.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpacing extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object AnonSpacing {
  @scala.inline
  def apply(height: Int | Double = null, spacing: Int | Double = null, textColor: String = null): AnonSpacing = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpacing]
  }
}

