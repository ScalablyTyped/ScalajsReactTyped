package typingsJapgolly.gapiCalendar.gapi.client.calendar

import typingsJapgolly.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var etag: typingsJapgolly.gapiCalendar.gapi.client.calendar.etag
  var id: String
  var kind: calendarNumbersigncalendar
  var location: js.UndefOr[String] = js.undefined
  var summary: String
  var timeZone: js.UndefOr[String] = js.undefined
}

object Calendar {
  @scala.inline
  def apply(
    etag: etag,
    id: String,
    kind: calendarNumbersigncalendar,
    summary: String,
    description: String = null,
    location: String = null,
    timeZone: String = null
  ): Calendar = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
}

