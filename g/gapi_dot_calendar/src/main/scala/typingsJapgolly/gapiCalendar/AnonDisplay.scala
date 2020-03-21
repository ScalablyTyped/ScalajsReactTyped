package typingsJapgolly.gapiCalendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiCalendar.gapi.client.calendar.GadgetDisplayMode
import typingsJapgolly.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplay extends js.Object {
  var display: js.UndefOr[GadgetDisplayMode] = js.undefined
  var height: integer
  var iconLink: String
  var link: String
  var title: String
  var `type`: String
  var width: integer
  def preferences(key: String): String
}

object AnonDisplay {
  @scala.inline
  def apply(
    height: integer,
    iconLink: String,
    link: String,
    preferences: String => CallbackTo[String],
    title: String,
    `type`: String,
    width: integer,
    display: GadgetDisplayMode = null
  ): AnonDisplay = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("preferences")(js.Any.fromFunction1((t0: java.lang.String) => preferences(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplay]
  }
}

