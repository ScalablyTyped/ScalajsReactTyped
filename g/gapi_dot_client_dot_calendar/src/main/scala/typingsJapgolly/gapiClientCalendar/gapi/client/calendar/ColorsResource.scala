package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCalendar.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsResource extends js.Object {
  /** Returns the color definitions for calendars and events. */
  def get(request: AnonPrettyPrint): Request_[Colors]
}

object ColorsResource {
  @scala.inline
  def apply(get: AnonPrettyPrint => CallbackTo[Request_[Colors]]): ColorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonPrettyPrint) => get(t0).runNow()))
    __obj.asInstanceOf[ColorsResource]
  }
}

