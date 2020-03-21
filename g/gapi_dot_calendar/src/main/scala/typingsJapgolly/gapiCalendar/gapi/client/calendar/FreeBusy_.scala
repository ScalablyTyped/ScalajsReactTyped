package typingsJapgolly.gapiCalendar.gapi.client.calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiCalendar.AnonBusy
import typingsJapgolly.gapiCalendar.AnonCalendars
import typingsJapgolly.gapiCalendar.gapiCalendarStrings.calendarNumbersignfreeBusy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusy_ extends js.Object {
  var kind: calendarNumbersignfreeBusy
  var timeMax: datetime
  var timeMin: datetime
  def calendars(key: String): AnonBusy
  def groups(key: String): AnonCalendars
}

object FreeBusy_ {
  @scala.inline
  def apply(
    calendars: String => CallbackTo[AnonBusy],
    groups: String => CallbackTo[AnonCalendars],
    kind: calendarNumbersignfreeBusy,
    timeMax: datetime,
    timeMin: datetime
  ): FreeBusy_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.updateDynamic("calendars")(js.Any.fromFunction1((t0: java.lang.String) => calendars(t0).runNow()))
    __obj.updateDynamic("groups")(js.Any.fromFunction1((t0: java.lang.String) => groups(t0).runNow()))
    __obj.asInstanceOf[FreeBusy_]
  }
}

