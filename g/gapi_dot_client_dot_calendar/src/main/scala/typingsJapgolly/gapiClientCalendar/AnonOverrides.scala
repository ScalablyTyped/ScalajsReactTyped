package typingsJapgolly.gapiClientCalendar

import typingsJapgolly.gapiClientCalendar.gapi.client.calendar.EventReminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverrides extends js.Object {
  /**
    * If the event doesn't use the default reminders, this lists the reminders specific to the event, or, if not set, indicates that no reminders are set for
    * this event. The maximum number of override reminders is 5.
    */
  var overrides: js.UndefOr[js.Array[EventReminder]] = js.undefined
  /** Whether the default reminders of the calendar apply to the event. */
  var useDefault: js.UndefOr[Boolean] = js.undefined
}

object AnonOverrides {
  @scala.inline
  def apply(overrides: js.Array[EventReminder] = null, useDefault: js.UndefOr[Boolean] = js.undefined): AnonOverrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefault)) __obj.updateDynamic("useDefault")(useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverrides]
  }
}

