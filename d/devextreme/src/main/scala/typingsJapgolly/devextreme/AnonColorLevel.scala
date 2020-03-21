package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.close
import typingsJapgolly.devextreme.devextremeStrings.high
import typingsJapgolly.devextreme.devextremeStrings.low
import typingsJapgolly.devextreme.devextremeStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorLevel extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[close | high | low | open] = js.undefined
}

object AnonColorLevel {
  @scala.inline
  def apply(color: String = null, level: close | high | low | open = null): AnonColorLevel = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorLevel]
  }
}

