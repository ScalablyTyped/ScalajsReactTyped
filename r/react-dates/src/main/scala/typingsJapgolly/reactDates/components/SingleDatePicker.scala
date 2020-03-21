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
import typingsJapgolly.reactDates.mod.AnchorDirectionShape
import typingsJapgolly.reactDates.mod.CalendarInfoPositionShape
import typingsJapgolly.reactDates.mod.DayOfWeekShape
import typingsJapgolly.reactDates.mod.IconPositionShape
import typingsJapgolly.reactDates.mod.OpenDirectionShape
import typingsJapgolly.reactDates.mod.OrientationShape
import typingsJapgolly.reactDates.mod.SingleDatePickerCls
import typingsJapgolly.reactDates.mod.SingleDatePickerPhrases
import typingsJapgolly.reactDates.mod.SingleDatePickerShape
import typingsJapgolly.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SingleDatePicker {
  def apply(
    id: String,
    onDateChange: js.UndefOr[momentObj] => Callback,
    onFocusChange: AnonFocused => Callback,
    anchorDirection: AnchorDirectionShape = null,
    appendToBody: js.UndefOr[Boolean] = js.undefined,
    block: js.UndefOr[Boolean] = js.undefined,
    calendarInfoPosition: CalendarInfoPositionShape = null,
    customCloseIcon: String | Element = null,
    customInputIcon: String | Element = null,
    date: momentObj = null,
    dayAriaLabelFormat: String = null,
    daySize: Int | Double = null,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayFormat: String | js.Function0[String] = null,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: DayOfWeekShape = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined,
    horizontalMargin: Int | Double = null,
    horizontalMonthPadding: Int | Double = null,
    initialVisibleMonth: js.UndefOr[CallbackTo[momentObj]] = js.undefined,
    inputIconPosition: IconPositionShape = null,
    isDayBlocked: /* day */ js.Any => CallbackTo[Boolean] = null,
    isDayHighlighted: /* day */ js.Any => CallbackTo[Boolean] = null,
    isOutsideRange: /* day */ js.Any => CallbackTo[Boolean] = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    keepFocusOnInput: js.UndefOr[Boolean] = js.undefined,
    keepOpenOnDateSelect: js.UndefOr[Boolean] = js.undefined,
    monthFormat: String = null,
    navNext: String | Element = null,
    navPrev: String | Element = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onClose: /* final */ AnonDate => Callback = null,
    onNextMonthClick: /* newCurrentMonth */ momentObj => Callback = null,
    onPrevMonthClick: /* newCurrentMonth */ momentObj => Callback = null,
    openDirection: OpenDirectionShape = null,
    orientation: OrientationShape = null,
    phrases: SingleDatePickerPhrases = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    regular: js.UndefOr[Boolean] = js.undefined,
    renderCalendarDay: /* day */ momentObj => CallbackTo[String | Element] = null,
    renderCalendarInfo: js.UndefOr[CallbackTo[String | Element]] = js.undefined,
    renderDayContents: /* day */ momentObj => CallbackTo[String | Element] = null,
    renderMonthElement: /* props */ AnonIsVisible => CallbackTo[String | Element] = null,
    renderMonthText: /* day */ momentObj => CallbackTo[String | Element] = null,
    reopenPickerOnClearDates: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    screenReaderInputMessage: String = null,
    showClearDate: js.UndefOr[Boolean] = js.undefined,
    showDefaultInputIcon: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    transitionDuration: Int | Double = null,
    verticalHeight: Int | Double = null,
    verticalSpacing: Int | Double = null,
    weekDayFormat: String = null,
    withFullScreenPortal: js.UndefOr[Boolean] = js.undefined,
    withPortal: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SingleDatePickerShape, SingleDatePickerCls, Unit, SingleDatePickerShape] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onDateChange")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.reactDates.mod.momentPropTypes.momentObj]) => onDateChange(t0).runNow()))
    __obj.updateDynamic("onFocusChange")(js.Any.fromFunction1((t0: typingsJapgolly.reactDates.AnonFocused) => onFocusChange(t0).runNow()))
    if (anchorDirection != null) __obj.updateDynamic("anchorDirection")(anchorDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(appendToBody)) __obj.updateDynamic("appendToBody")(appendToBody.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition.asInstanceOf[js.Any])
    if (customCloseIcon != null) __obj.updateDynamic("customCloseIcon")(customCloseIcon.asInstanceOf[js.Any])
    if (customInputIcon != null) __obj.updateDynamic("customInputIcon")(customInputIcon.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat.asInstanceOf[js.Any])
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKeyboardShortcutsPanel)) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel.asInstanceOf[js.Any])
    if (horizontalMargin != null) __obj.updateDynamic("horizontalMargin")(horizontalMargin.asInstanceOf[js.Any])
    if (horizontalMonthPadding != null) __obj.updateDynamic("horizontalMonthPadding")(horizontalMonthPadding.asInstanceOf[js.Any])
    initialVisibleMonth.foreach(p => __obj.updateDynamic("initialVisibleMonth")(p.toJsFn))
    if (inputIconPosition != null) __obj.updateDynamic("inputIconPosition")(inputIconPosition.asInstanceOf[js.Any])
    if (isDayBlocked != null) __obj.updateDynamic("isDayBlocked")(js.Any.fromFunction1((t0: /* day */ js.Any) => isDayBlocked(t0).runNow()))
    if (isDayHighlighted != null) __obj.updateDynamic("isDayHighlighted")(js.Any.fromFunction1((t0: /* day */ js.Any) => isDayHighlighted(t0).runNow()))
    if (isOutsideRange != null) __obj.updateDynamic("isOutsideRange")(js.Any.fromFunction1((t0: /* day */ js.Any) => isOutsideRange(t0).runNow()))
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFocusOnInput)) __obj.updateDynamic("keepFocusOnInput")(keepFocusOnInput.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOpenOnDateSelect)) __obj.updateDynamic("keepOpenOnDateSelect")(keepOpenOnDateSelect.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* final */ typingsJapgolly.reactDates.AnonDate) => onClose(t0).runNow()))
    if (onNextMonthClick != null) __obj.updateDynamic("onNextMonthClick")(js.Any.fromFunction1((t0: /* newCurrentMonth */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => onNextMonthClick(t0).runNow()))
    if (onPrevMonthClick != null) __obj.updateDynamic("onPrevMonthClick")(js.Any.fromFunction1((t0: /* newCurrentMonth */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => onPrevMonthClick(t0).runNow()))
    if (openDirection != null) __obj.updateDynamic("openDirection")(openDirection.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(regular)) __obj.updateDynamic("regular")(regular.asInstanceOf[js.Any])
    if (renderCalendarDay != null) __obj.updateDynamic("renderCalendarDay")(js.Any.fromFunction1((t0: /* day */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => renderCalendarDay(t0).runNow()))
    renderCalendarInfo.foreach(p => __obj.updateDynamic("renderCalendarInfo")(p.toJsFn))
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(js.Any.fromFunction1((t0: /* day */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => renderDayContents(t0).runNow()))
    if (renderMonthElement != null) __obj.updateDynamic("renderMonthElement")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDates.AnonIsVisible) => renderMonthElement(t0).runNow()))
    if (renderMonthText != null) __obj.updateDynamic("renderMonthText")(js.Any.fromFunction1((t0: /* day */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => renderMonthText(t0).runNow()))
    if (!js.isUndefined(reopenPickerOnClearDates)) __obj.updateDynamic("reopenPickerOnClearDates")(reopenPickerOnClearDates.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (screenReaderInputMessage != null) __obj.updateDynamic("screenReaderInputMessage")(screenReaderInputMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearDate)) __obj.updateDynamic("showClearDate")(showClearDate.asInstanceOf[js.Any])
    if (!js.isUndefined(showDefaultInputIcon)) __obj.updateDynamic("showDefaultInputIcon")(showDefaultInputIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (verticalHeight != null) __obj.updateDynamic("verticalHeight")(verticalHeight.asInstanceOf[js.Any])
    if (verticalSpacing != null) __obj.updateDynamic("verticalSpacing")(verticalSpacing.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(withFullScreenPortal)) __obj.updateDynamic("withFullScreenPortal")(withFullScreenPortal.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDates.mod.SingleDatePickerShape, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDates.mod.SingleDatePickerCls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDates.mod.SingleDatePickerShape])(children: _*)
  }
  @JSImport("react-dates", "SingleDatePicker")
  @js.native
  object componentImport extends js.Object
  
}

