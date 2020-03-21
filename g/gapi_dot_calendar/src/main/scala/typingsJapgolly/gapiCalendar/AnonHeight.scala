package typingsJapgolly.gapiCalendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiCalendar.gapi.client.calendar.GadgetDisplayMode
import typingsJapgolly.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var display: js.UndefOr[GadgetDisplayMode] = js.undefined
  var height: js.UndefOr[integer] = js.undefined
  var iconLink: String
  var link: String
  var title: String
  var `type`: String
  var width: js.UndefOr[integer] = js.undefined
  def preferences(key: String): String
}

object AnonHeight {
  @scala.inline
  def apply(
    iconLink: String,
    link: String,
    preferences: String => CallbackTo[String],
    title: String,
    `type`: String,
    display: GadgetDisplayMode = null,
    height: Int | Double = null,
    width: Int | Double = null
  ): AnonHeight = {
    val __obj = js.Dynamic.literal(iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("preferences")(js.Any.fromFunction1((t0: java.lang.String) => preferences(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

