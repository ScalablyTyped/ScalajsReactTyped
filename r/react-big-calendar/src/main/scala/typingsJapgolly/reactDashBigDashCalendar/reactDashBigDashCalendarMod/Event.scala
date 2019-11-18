package typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var allDay: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[js.Date] = js.undefined
  var resource: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[js.Date] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    allDay: js.UndefOr[Boolean] = js.undefined,
    end: js.Date = null,
    resource: js.Any = null,
    start: js.Date = null,
    title: String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

