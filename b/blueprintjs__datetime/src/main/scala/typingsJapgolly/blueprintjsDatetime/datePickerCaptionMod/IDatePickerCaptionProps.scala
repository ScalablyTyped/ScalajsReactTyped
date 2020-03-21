package typingsJapgolly.blueprintjsDatetime.datePickerCaptionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactDayPicker.commonMod.ClassNames
import typingsJapgolly.reactDayPicker.propsMod.CaptionElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerCaptionProps extends CaptionElementProps {
  var maxDate: js.Date
  var minDate: js.Date
  /** Callback invoked when the month or year `<select>` is changed. */
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Double, Unit]] = js.undefined
  var onYearChange: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.undefined
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
}

object IDatePickerCaptionProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    date: js.Date,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    maxDate: js.Date,
    minDate: js.Date,
    months: js.Array[String] = null,
    onClick: ReactMouseEventFrom[HTMLElement] => Callback = null,
    onDateChange: /* date */ js.Date => Callback = null,
    onMonthChange: /* month */ Double => Callback = null,
    onYearChange: /* year */ Double => Callback = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
  ): IDatePickerCaptionProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1((t0: /* date */ js.Date) => onDateChange(t0).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1((t0: /* month */ scala.Double) => onMonthChange(t0).runNow()))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1((t0: /* year */ scala.Double) => onYearChange(t0).runNow()))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerCaptionProps]
  }
}

