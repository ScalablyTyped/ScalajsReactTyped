package typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStyle extends js.Object {
  var iconName: js.UndefOr[String] = js.undefined
  var iconStyler: js.UndefOr[StyleFunction] = js.undefined
}

object PointStyle {
  @scala.inline
  def apply(iconName: String = null, iconStyler: StyleFunction = null): PointStyle = {
    val __obj = js.Dynamic.literal()
    if (iconName != null) __obj.updateDynamic("iconName")(iconName.asInstanceOf[js.Any])
    if (iconStyler != null) __obj.updateDynamic("iconStyler")(iconStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointStyle]
  }
}

