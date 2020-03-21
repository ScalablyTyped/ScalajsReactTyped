package typingsJapgolly.reactDateRange.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeProps
  extends Range
     with CommonCalendarProps {
  /** default: 2 */
  var calendars: js.UndefOr[Double] = js.undefined
  /** default: false */
  var linkedCalendars: js.UndefOr[Boolean] = js.undefined
  /** default: false */
  var rangedCalendars: js.UndefOr[Boolean] = js.undefined
  /** default: none */
  var ranges: js.UndefOr[js.Object] = js.undefined
  /** default: none */
  var specialDays: js.UndefOr[js.Array[DateContainerType]] = js.undefined
  /** default: false */
  var twoStepChange: js.UndefOr[Boolean] = js.undefined
}

object DateRangeProps {
  @scala.inline
  def apply(
    calendars: Int | Double = null,
    endDate: Moment = null,
    firstDayOfWeek: Int | Double = null,
    format: String = null,
    lang: LanguageType = null,
    linkedCalendars: js.UndefOr[Boolean] = js.undefined,
    maxDate: DateInputType = null,
    minDate: DateInputType = null,
    onChange: /* range */ Range => Callback = null,
    onInit: /* range */ Range => Callback = null,
    rangedCalendars: js.UndefOr[Boolean] = js.undefined,
    ranges: js.Object = null,
    specialDays: js.Array[DateContainerType] = null,
    startDate: Moment = null,
    theme: CalendarTheme = null,
    twoStepChange: js.UndefOr[Boolean] = js.undefined
  ): DateRangeProps = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(linkedCalendars)) __obj.updateDynamic("linkedCalendars")(linkedCalendars.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* range */ typingsJapgolly.reactDateRange.mod.Range) => onChange(t0).runNow()))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1((t0: /* range */ typingsJapgolly.reactDateRange.mod.Range) => onInit(t0).runNow()))
    if (!js.isUndefined(rangedCalendars)) __obj.updateDynamic("rangedCalendars")(rangedCalendars.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (specialDays != null) __obj.updateDynamic("specialDays")(specialDays.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(twoStepChange)) __obj.updateDynamic("twoStepChange")(twoStepChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangeProps]
  }
}

