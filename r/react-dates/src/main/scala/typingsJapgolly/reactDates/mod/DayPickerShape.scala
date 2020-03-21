package typingsJapgolly.reactDates.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactDates.AnonIsVisible
import typingsJapgolly.reactDates.mod.momentPropTypes.momentObj
import typingsJapgolly.reactDates.reactDatesNumbers.`0`
import typingsJapgolly.reactDates.reactDatesNumbers.`1`
import typingsJapgolly.reactDates.reactDatesNumbers.`2`
import typingsJapgolly.reactDates.reactDatesNumbers.`3`
import typingsJapgolly.reactDates.reactDatesNumbers.`4`
import typingsJapgolly.reactDates.reactDatesNumbers.`5`
import typingsJapgolly.reactDates.reactDatesNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerShape.jsx
trait DayPickerShape extends js.Object {
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.undefined
  var dayAriaLabelFormat: js.UndefOr[String] = js.undefined
  var daySize: js.UndefOr[Double] = js.undefined
  var enableOutsideDays: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined
  var horizontalMonthPadding: js.UndefOr[Double] = js.undefined
  var initialVisibleMonth: js.UndefOr[js.Function0[momentObj]] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var isRTL: js.UndefOr[Boolean] = js.undefined
  // i18n
  var monthFormat: js.UndefOr[String] = js.undefined
  var navNext: js.UndefOr[String | Element] = js.undefined
  var navPrev: js.UndefOr[String | Element] = js.undefined
  var noBorder: js.UndefOr[Boolean] = js.undefined
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  // accessibility
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.undefined
  var onOutsideClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.undefined
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.undefined
  var phrases: js.UndefOr[SingleDatePickerPhrases] = js.undefined
  var renderCalendarDay: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.undefined
  var renderCalendarInfo: js.UndefOr[js.Function0[String | Element]] = js.undefined
  var renderDayContents: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.undefined
  var renderMonthElement: js.UndefOr[js.Function1[/* props */ AnonIsVisible, String | Element]] = js.undefined
  var renderMonthText: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.undefined
  var showKeyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var verticalHeight: js.UndefOr[Double] = js.undefined
  var weekDayFormat: js.UndefOr[String] = js.undefined
  var withPortal: js.UndefOr[Boolean] = js.undefined
}

object DayPickerShape {
  @scala.inline
  def apply(
    calendarInfoPosition: CalendarInfoPositionShape = null,
    dayAriaLabelFormat: String = null,
    daySize: Int | Double = null,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined,
    horizontalMonthPadding: Int | Double = null,
    initialVisibleMonth: js.UndefOr[CallbackTo[momentObj]] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    monthFormat: String = null,
    navNext: String | Element = null,
    navPrev: String | Element = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onNextMonthClick: /* newCurrentMonth */ momentObj => Callback = null,
    onOutsideClick: /* e */ js.Any => Callback = null,
    onPrevMonthClick: /* newCurrentMonth */ momentObj => Callback = null,
    orientation: ScrollableOrientationShape = null,
    phrases: SingleDatePickerPhrases = null,
    renderCalendarDay: /* day */ momentObj => CallbackTo[String | Element] = null,
    renderCalendarInfo: js.UndefOr[CallbackTo[String | Element]] = js.undefined,
    renderDayContents: /* day */ momentObj => CallbackTo[String | Element] = null,
    renderMonthElement: /* props */ AnonIsVisible => CallbackTo[String | Element] = null,
    renderMonthText: /* day */ momentObj => CallbackTo[String | Element] = null,
    showKeyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    transitionDuration: Int | Double = null,
    verticalHeight: Int | Double = null,
    weekDayFormat: String = null,
    withPortal: js.UndefOr[Boolean] = js.undefined
  ): DayPickerShape = {
    val __obj = js.Dynamic.literal()
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition.asInstanceOf[js.Any])
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat.asInstanceOf[js.Any])
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKeyboardShortcutsPanel)) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel.asInstanceOf[js.Any])
    if (horizontalMonthPadding != null) __obj.updateDynamic("horizontalMonthPadding")(horizontalMonthPadding.asInstanceOf[js.Any])
    initialVisibleMonth.foreach(p => __obj.updateDynamic("initialVisibleMonth")(p.toJsFn))
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onNextMonthClick != null) __obj.updateDynamic("onNextMonthClick")(js.Any.fromFunction1((t0: /* newCurrentMonth */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => onNextMonthClick(t0).runNow()))
    if (onOutsideClick != null) __obj.updateDynamic("onOutsideClick")(js.Any.fromFunction1((t0: /* e */ js.Any) => onOutsideClick(t0).runNow()))
    if (onPrevMonthClick != null) __obj.updateDynamic("onPrevMonthClick")(js.Any.fromFunction1((t0: /* newCurrentMonth */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => onPrevMonthClick(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    if (renderCalendarDay != null) __obj.updateDynamic("renderCalendarDay")(js.Any.fromFunction1((t0: /* day */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => renderCalendarDay(t0).runNow()))
    renderCalendarInfo.foreach(p => __obj.updateDynamic("renderCalendarInfo")(p.toJsFn))
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(js.Any.fromFunction1((t0: /* day */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => renderDayContents(t0).runNow()))
    if (renderMonthElement != null) __obj.updateDynamic("renderMonthElement")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDates.AnonIsVisible) => renderMonthElement(t0).runNow()))
    if (renderMonthText != null) __obj.updateDynamic("renderMonthText")(js.Any.fromFunction1((t0: /* day */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => renderMonthText(t0).runNow()))
    if (!js.isUndefined(showKeyboardShortcuts)) __obj.updateDynamic("showKeyboardShortcuts")(showKeyboardShortcuts.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (verticalHeight != null) __obj.updateDynamic("verticalHeight")(verticalHeight.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerShape]
  }
}

