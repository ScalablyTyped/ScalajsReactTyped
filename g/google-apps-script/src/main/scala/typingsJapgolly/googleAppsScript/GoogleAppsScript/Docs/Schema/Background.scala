package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var color: js.UndefOr[OptionalColor] = js.undefined
}

object Background {
  @scala.inline
  def apply(color: OptionalColor = null): Background = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

