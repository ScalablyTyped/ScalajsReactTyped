package typingsJapgolly.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightSpacing extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_HeightSpacing {
  @scala.inline
  def apply(height: Int | Double = null, spacing: Int | Double = null, textColor: String = null): Anon_HeightSpacing = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightSpacing]
  }
}

