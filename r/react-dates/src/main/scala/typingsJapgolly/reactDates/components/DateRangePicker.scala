package typingsJapgolly.reactDates.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDates.AnonEndDate
import typingsJapgolly.reactDates.AnonIsVisible
import typingsJapgolly.reactDates.AnonStartDate
import typingsJapgolly.reactDates.mod.AnchorDirectionShape
import typingsJapgolly.reactDates.mod.CalendarInfoPositionShape
import typingsJapgolly.reactDates.mod.DateRangePickerCls
import typingsJapgolly.reactDates.mod.DateRangePickerPhrases
import typingsJapgolly.reactDates.mod.DateRangePickerShape
import typingsJapgolly.reactDates.mod.DayOfWeekShape
import typingsJapgolly.reactDates.mod.DisabledShape
import typingsJapgolly.reactDates.mod.FocusedInputShape
import typingsJapgolly.reactDates.mod.IconPositionShape
import typingsJapgolly.reactDates.mod.OpenDirectionShape
import typingsJapgolly.reactDates.mod.OrientationShape
import typingsJapgolly.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRangePicker {
  def apply(
    endDateId: String,
    startDateId: String,
    onDatesChange: AnonEndDate => Callback,
    onFocusChange: js.UndefOr[FocusedInputShape] => Callback,
    anchorDirection: AnchorDirectionShape = null,
    appendToBody: js.UndefOr[Boolean] = js.undefined,
    block: js.UndefOr[Boolean] = js.undefined,
    calendarInfoPosition: CalendarInfoPositionShape = null,
    customArrowIcon: String | Element = null,
    customCloseIcon: String | Element = null,
    customInputIcon: String | Element = null,
    dayAriaLabelFormat: String = null,
    daySize: Int | Double = null,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    disabled: DisabledShape = null,
    displayFormat: String | js.Function0[String] = null,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    endDate: momentObj = null,
    endDatePlaceholderText: String = null,
    firstDayOfWeek: DayOfWeekShape = null,
    focusedInput: FocusedInputShape = null,
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
    maxDate: momentObj = null,
    minDate: momentObj = null,
    minimumNights: Int | Double = null,
    monthFormat: String = null,
    navNext: String | Element = null,
    navPrev: String | Element = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onClose: /* final */ AnonStartDate => Callback = null,
    onNextMonthClick: /* newCurrentMonth */ momentObj => Callback = null,
    onPrevMonthClick: /* newCurrentMonth */ momentObj => Callback = null,
    openDirection: OpenDirectionShape = null,
    orientation: OrientationShape = null,
    phrases: DateRangePickerPhrases = null,
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
    showClearDates: js.UndefOr[Boolean] = js.undefined,
    showDefaultInputIcon: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    startDate: momentObj = null,
    startDatePlaceholderText: String = null,
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
  ): UnmountedWithRoot[DateRangePickerShape, DateRangePickerCls, Unit, DateRangePickerShape] = {
    val __obj = js.Dynamic.literal(endDateId = endDateId.asInstanceOf[js.Any], startDateId = startDateId.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onDatesChange")(js.Any.fromFunction1((t0: typingsJapgolly.reactDates.AnonEndDate) => onDatesChange(t0).runNow()))
    __obj.updateDynamic("onFocusChange")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.reactDates.mod.FocusedInputShape]) => onFocusChange(t0).runNow()))
    if (anchorDirection != null) __obj.updateDynamic("anchorDirection")(anchorDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(appendToBody)) __obj.updateDynamic("appendToBody")(appendToBody.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition.asInstanceOf[js.Any])
    if (customArrowIcon != null) __obj.updateDynamic("customArrowIcon")(customArrowIcon.asInstanceOf[js.Any])
    if (customCloseIcon != null) __obj.updateDynamic("customCloseIcon")(customCloseIcon.asInstanceOf[js.Any])
    if (customInputIcon != null) __obj.updateDynamic("customInputIcon")(customInputIcon.asInstanceOf[js.Any])
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat.asInstanceOf[js.Any])
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (endDatePlaceholderText != null) __obj.updateDynamic("endDatePlaceholderText")(endDatePlaceholderText.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (focusedInput != null) __obj.updateDynamic("focusedInput")(focusedInput.asInstanceOf[js.Any])
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
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minimumNights != null) __obj.updateDynamic("minimumNights")(minimumNights.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* final */ typingsJapgolly.reactDates.AnonStartDate) => onClose(t0).runNow()))
    if (onNextMonthClick != null) __obj.updateDynamic("onNextMonthClick")(js.Any.fromFunction1((t0: /* newCurrentMonth */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => onNextMonthClick(t0).runNow()))
    if (onPrevMonthClick != null) __obj.updateDynamic("onPrevMonthClick")(js.Any.fromFunction1((t0: /* newCurrentMonth */ typingsJapgolly.reactDates.mod.momentPropTypes.momentObj) => onPrevMonthClick(t0).runNow()))
    if (openDirection != null) __obj.updateDynamic("openDirection")(openDirection.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
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
    if (!js.isUndefined(showClearDates)) __obj.updateDynamic("showClearDates")(showClearDates.asInstanceOf[js.Any])
    if (!js.isUndefined(showDefaultInputIcon)) __obj.updateDynamic("showDefaultInputIcon")(showDefaultInputIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startDatePlaceholderText != null) __obj.updateDynamic("startDatePlaceholderText")(startDatePlaceholderText.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (verticalHeight != null) __obj.updateDynamic("verticalHeight")(verticalHeight.asInstanceOf[js.Any])
    if (verticalSpacing != null) __obj.updateDynamic("verticalSpacing")(verticalSpacing.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(withFullScreenPortal)) __obj.updateDynamic("withFullScreenPortal")(withFullScreenPortal.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDates.mod.DateRangePickerShape, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDates.mod.DateRangePickerCls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDates.mod.DateRangePickerShape])(children: _*)
  }
  @JSImport("react-dates", "DateRangePicker")
  @js.native
  object componentImport extends js.Object
  
}

