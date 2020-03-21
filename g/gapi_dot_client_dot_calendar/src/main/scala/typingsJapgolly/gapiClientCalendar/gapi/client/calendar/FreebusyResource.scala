package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCalendar.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreebusyResource extends js.Object {
  /** Returns free/busy information for a set of calendars. */
  def query(request: AnonPrettyPrint): Request_[FreeBusyResponse]
}

object FreebusyResource {
  @scala.inline
  def apply(query: AnonPrettyPrint => CallbackTo[Request_[FreeBusyResponse]]): FreebusyResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonPrettyPrint) => query(t0).runNow()))
    __obj.asInstanceOf[FreebusyResource]
  }
}

