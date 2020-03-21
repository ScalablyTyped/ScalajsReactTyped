package typingsJapgolly.reactDateRange.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends CommonCalendarProps {
  /** default: today */
  var date: DateInputType
}

object CalendarProps {
  @scala.inline
  def apply(
    date: DateInputType,
    firstDayOfWeek: Int | Double = null,
    format: String = null,
    lang: LanguageType = null,
    maxDate: DateInputType = null,
    minDate: DateInputType = null,
    onChange: /* range */ Range => Callback = null,
    onInit: /* range */ Range => Callback = null,
    theme: CalendarTheme = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* range */ typingsJapgolly.reactDateRange.mod.Range) => onChange(t0).runNow()))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1((t0: /* range */ typingsJapgolly.reactDateRange.mod.Range) => onInit(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

