package typingsJapgolly.reactDates.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDates.AnonDate
import typingsJapgolly.reactDates.AnonFocused
import typingsJapgolly.reactDates.AnonIsVisible
import typingsJapgolly.reactDates.mod.CalendarInfoPositionShape
import typingsJapgolly.reactDates.mod.DayPickerSingleDateControllerCls
import typingsJapgolly.reactDates.mod.DayPickerSingleDateControllerShape
import typingsJapgolly.reactDates.mod.ScrollableOrientationShape
import typingsJapgolly.reactDates.mod.SingleDatePickerPhrases
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

object DayPickerSingleDateController {
  def apply(
    focused: Boolean,
    onDateChange: js.UndefOr[momentObj] => Callback,
    onFocusChange: AnonFocused => Callback,
    calendarInfoPosition: CalendarInfoPositionShape = null,
    date: momentObj = null,
    dayAriaLabelFormat: String = null,
    daySize: Int | Double = null,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined,
    horizontalMonthPadding: Int | Double = null,
    initialVisibleMonth: js.UndefOr[CallbackTo[momentObj]] = js.undefined,
    isDayBlocked: /* day */ js.Any => CallbackTo[Boolean] = null,
    isDayHighlighted: /* day */ js.Any => CallbackTo[Boolean] = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isOutsideRange: /* day */ js.Any => CallbackTo[Boolean] = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    keepOpenOnDateSelect: js.UndefOr[Boolean] = js.undefined,
    monthFormat: String = null,
    navNext: String | Element = null,
    navPrev: String | Element = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onClose: /* final */ AnonDate => Callback = null,
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
    withPortal: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DayPickerSingleDateControllerShape, 
    DayPickerSingleDateControllerCls, 
    Unit, 
    DayPickerSingleDateControllerShape
  ] = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onDateChange")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.reactDates.mod.momentPropTypes.momentObj]) => onDateChange(t0).runNow()))
    __obj.updateDynamic("onFocusChange")(js.Any.fromFunction1((t0: typingsJapgolly.reactDates.AnonFocused) => onFocusChange(t0).runNow()))
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat.asInstanceOf[js.Any])
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKeyboardShortcutsPanel)) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel.asInstanceOf[js.Any])
    if (horizontalMonthPadding != null) __obj.updateDynamic("horizontalMonthPadding")(horizontalMonthPadding.asInstanceOf[js.Any])
    initialVisibleMonth.foreach(p => __obj.updateDynamic("initialVisibleMonth")(p.toJsFn))
    if (isDayBlocked != null) __obj.updateDynamic("isDayBlocked")(js.Any.fromFunction1((t0: /* day */ js.Any) => isDayBlocked(t0).runNow()))
    if (isDayHighlighted != null) __obj.updateDynamic("isDayHighlighted")(js.Any.fromFunction1((t0: /* day */ js.Any) => isDayHighlighted(t0).runNow()))
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (isOutsideRange != null) __obj.updateDynamic("isOutsideRange")(js.Any.fromFunction1((t0: /* day */ js.Any) => isOutsideRange(t0).runNow()))
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOpenOnDateSelect)) __obj.updateDynamic("keepOpenOnDateSelect")(keepOpenOnDateSelect.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* final */ typingsJapgolly.reactDates.AnonDate) => onClose(t0).runNow()))
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDates.mod.DayPickerSingleDateControllerShape, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDates.mod.DayPickerSingleDateControllerCls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDates.mod.DayPickerSingleDateControllerShape])(children: _*)
  }
  @JSImport("react-dates", "DayPickerSingleDateController")
  @js.native
  object componentImport extends js.Object
  
}

