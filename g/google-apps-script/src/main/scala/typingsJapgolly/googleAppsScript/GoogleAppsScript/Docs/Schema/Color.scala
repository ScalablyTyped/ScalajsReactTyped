package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var rgbColor: js.UndefOr[RgbColor] = js.undefined
}

object Color {
  @scala.inline
  def apply(rgbColor: RgbColor = null): Color = {
    val __obj = js.Dynamic.literal()
    if (rgbColor != null) __obj.updateDynamic("rgbColor")(rgbColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

