package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.generateCalendarMod.CalendarMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnChange[DateType] extends js.Object {
  var `type`: CalendarMode
  var value: DateType
  def onChange(date: DateType): Unit
  def onTypeChange(`type`: CalendarMode): Unit
}

object AnonOnChange {
  @scala.inline
  def apply[DateType](
    onChange: DateType => Callback,
    onTypeChange: CalendarMode => Callback,
    `type`: CalendarMode,
    value: DateType
  ): AnonOnChange[DateType] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: DateType) => onChange(t0).runNow()))
    __obj.updateDynamic("onTypeChange")(js.Any.fromFunction1((t0: typingsJapgolly.antd.generateCalendarMod.CalendarMode) => onTypeChange(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnChange[DateType]]
  }
}

