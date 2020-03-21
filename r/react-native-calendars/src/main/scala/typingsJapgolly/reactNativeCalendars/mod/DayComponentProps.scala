package typingsJapgolly.reactNativeCalendars.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsBooleans.`false`
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings._empty
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.disabled
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.selected
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.today
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayComponentProps extends js.Object {
  var date: DateObject
  var marking: `false` | js.Array[Marking]
  var state: _empty | selected | disabled | today
  var theme: CalendarTheme
  def onLongPress(date: DateObject): js.Any
  def onPress(date: DateObject): js.Any
}

object DayComponentProps {
  @scala.inline
  def apply(
    date: DateObject,
    marking: `false` | js.Array[Marking],
    onLongPress: DateObject => CallbackTo[js.Any],
    onPress: DateObject => CallbackTo[js.Any],
    state: _empty | selected | disabled | today,
    theme: CalendarTheme
  ): DayComponentProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], marking = marking.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeCalendars.mod.DateObject) => onLongPress(t0).runNow()))
    __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeCalendars.mod.DateObject) => onPress(t0).runNow()))
    __obj.asInstanceOf[DayComponentProps]
  }
}

