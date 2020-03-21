package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorDefinition extends js.Object {
  /** The background color associated with this color definition. */
  var background: js.UndefOr[String] = js.undefined
  /** The foreground color that can be used to write on top of a background with 'background' color. */
  var foreground: js.UndefOr[String] = js.undefined
}

object ColorDefinition {
  @scala.inline
  def apply(background: String = null, foreground: String = null): ColorDefinition = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (foreground != null) __obj.updateDynamic("foreground")(foreground.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorDefinition]
  }
}

