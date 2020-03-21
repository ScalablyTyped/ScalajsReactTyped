package typingsJapgolly.reactDatepicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.dateFns.mod.Locale
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.reactDatepicker.AnonChangeMonth
import typingsJapgolly.reactDatepicker.AnonChildren
import typingsJapgolly.reactDatepicker.AnonCode
import typingsJapgolly.reactDatepicker.mod.HighlightDates
import typingsJapgolly.reactDatepicker.mod.ReactDatePickerProps
import typingsJapgolly.reactDatepicker.mod.default
import typingsJapgolly.reactDatepicker.reactDatepickerStrings.scroll
import typingsJapgolly.reactDatepicker.reactDatepickerStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDatepicker {
  def apply(
    onChange: (js.UndefOr[js.Date | Null], js.UndefOr[ReactEventFrom[Element]]) => Callback,
    adjustDateOnChange: js.UndefOr[Boolean] = js.undefined,
    allowSameDay: js.UndefOr[Boolean] = js.undefined,
    ariaLabelledBy: String = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    calendarClassName: String = null,
    calendarContainer: /* props */ AnonChildren => CallbackTo[Node] = null,
    className: String = null,
    clearButtonTitle: String = null,
    customInput: VdomNode = null,
    customInputRef: String = null,
    dateFormat: String | js.Array[String] = null,
    dateFormatCalendar: String = null,
    dayClassName: /* date */ js.Date => CallbackTo[String | Null] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    dropdownMode: scroll | select = null,
    endDate: js.Date = null,
    excludeDates: js.Array[js.Date] = null,
    excludeTimes: js.Array[js.Date] = null,
    filterDate: /* date */ js.Date => CallbackTo[Boolean] = null,
    fixedHeight: js.UndefOr[Boolean] = js.undefined,
    forceShowMonthNavigation: js.UndefOr[Boolean] = js.undefined,
    formatWeekDay: /* formattedDate */ String => CallbackTo[String] = null,
    formatWeekNumber: /* date */ js.Date => CallbackTo[String | Double] = null,
    highlightDates: js.Array[HighlightDates | js.Date] = null,
    id: String = null,
    includeDates: js.Array[js.Date] = null,
    includeTimes: js.Array[js.Date] = null,
    injectTimes: js.Array[js.Date] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inlineFocusSelectedMonth: js.UndefOr[Boolean] = js.undefined,
    isClearable: js.UndefOr[Boolean] = js.undefined,
    locale: String | Locale = null,
    maxDate: js.Date = null,
    maxTime: js.Date = null,
    minDate: js.Date = null,
    minTime: js.Date = null,
    monthsShown: Int | Double = null,
    name: String = null,
    nextMonthButtonLabel: String = null,
    nextYearButtonLabel: String = null,
    onBlur: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onCalendarClose: js.UndefOr[Callback] = js.undefined,
    onCalendarOpen: js.UndefOr[Callback] = js.undefined,
    onChangeRaw: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onClickOutside: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onDayMouseEnter: /* date */ js.Date => Callback = null,
    onFocus: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onInputClick: js.UndefOr[Callback] = js.undefined,
    onInputError: /* err */ AnonCode => Callback = null,
    onKeyDown: /* event */ ReactKeyboardEventFrom[HTMLDivElement] => Callback = null,
    onMonthChange: /* date */ js.Date => Callback = null,
    onMonthMouseLeave: js.UndefOr[Callback] = js.undefined,
    onSelect: (/* date */ js.Date, /* event */ js.UndefOr[ReactEventFrom[Element]]) => Callback = null,
    onWeekSelect: (/* firstDayOfWeek */ js.Date, /* weekNumber */ String | Double, /* event */ js.UndefOr[ReactEventFrom[Element]]) => Callback = null,
    onYearChange: /* date */ js.Date => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openToDate: js.Date = null,
    peekNextMonth: js.UndefOr[Boolean] = js.undefined,
    placeholderText: String = null,
    popperClassName: String = null,
    popperContainer: /* props */ AnonChildren => CallbackTo[Node] = null,
    popperModifiers: Modifiers = null,
    popperPlacement: String = null,
    popperProps: js.Object = null,
    preventOpenOnFocus: js.UndefOr[Boolean] = js.undefined,
    previousMonthButtonLabel: String = null,
    previousYearButtonLabel: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderCustomHeader: /* params */ AnonChangeMonth => CallbackTo[Node] = null,
    renderDayContents: (/* dayOfMonth */ Double, /* date */ js.UndefOr[js.Date]) => CallbackTo[Node] = null,
    required: js.UndefOr[Boolean] = js.undefined,
    scrollableMonthYearDropdown: js.UndefOr[Boolean] = js.undefined,
    scrollableYearDropdown: js.UndefOr[Boolean] = js.undefined,
    selected: js.Date = null,
    selectsEnd: js.UndefOr[Boolean] = js.undefined,
    selectsStart: js.UndefOr[Boolean] = js.undefined,
    shouldCloseOnSelect: js.UndefOr[Boolean] = js.undefined,
    showDisabledMonthNavigation: js.UndefOr[Boolean] = js.undefined,
    showMonthDropdown: js.UndefOr[Boolean] = js.undefined,
    showMonthYearDropdown: js.UndefOr[Boolean] = js.undefined,
    showMonthYearPicker: js.UndefOr[Boolean] = js.undefined,
    showPopperArrow: js.UndefOr[Boolean] = js.undefined,
    showPreviousMonths: js.UndefOr[Boolean] = js.undefined,
    showQuarterYearPicker: js.UndefOr[Boolean] = js.undefined,
    showTimeInput: js.UndefOr[Boolean] = js.undefined,
    showTimeSelect: js.UndefOr[Boolean] = js.undefined,
    showTimeSelectOnly: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    showYearDropdown: js.UndefOr[Boolean] = js.undefined,
    startDate: js.Date = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    strictParsing: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    timeCaption: String = null,
    timeFormat: String = null,
    timeInputLabel: String = null,
    timeIntervals: Int | Double = null,
    title: String = null,
    todayButton: VdomNode = null,
    useShortMonthInDropdown: js.UndefOr[Boolean] = js.undefined,
    useWeekdaysShort: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    weekLabel: String = null,
    withPortal: js.UndefOr[Boolean] = js.undefined,
    wrapperClassName: String = null,
    yearDropdownItemNumber: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactDatePickerProps, default, Unit, ReactDatePickerProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: js.UndefOr[js.Date | scala.Null], t1: js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]]) => onChange(t0, t1).runNow()))
    if (!js.isUndefined(adjustDateOnChange)) __obj.updateDynamic("adjustDateOnChange")(adjustDateOnChange.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSameDay)) __obj.updateDynamic("allowSameDay")(allowSameDay.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (calendarClassName != null) __obj.updateDynamic("calendarClassName")(calendarClassName.asInstanceOf[js.Any])
    if (calendarContainer != null) __obj.updateDynamic("calendarContainer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDatepicker.AnonChildren) => calendarContainer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearButtonTitle != null) __obj.updateDynamic("clearButtonTitle")(clearButtonTitle.asInstanceOf[js.Any])
    if (customInput != null) __obj.updateDynamic("customInput")(customInput.rawNode.asInstanceOf[js.Any])
    if (customInputRef != null) __obj.updateDynamic("customInputRef")(customInputRef.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateFormatCalendar != null) __obj.updateDynamic("dateFormatCalendar")(dateFormatCalendar.asInstanceOf[js.Any])
    if (dayClassName != null) __obj.updateDynamic("dayClassName")(js.Any.fromFunction1((t0: /* date */ js.Date) => dayClassName(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledKeyboardNavigation)) __obj.updateDynamic("disabledKeyboardNavigation")(disabledKeyboardNavigation.asInstanceOf[js.Any])
    if (dropdownMode != null) __obj.updateDynamic("dropdownMode")(dropdownMode.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (excludeDates != null) __obj.updateDynamic("excludeDates")(excludeDates.asInstanceOf[js.Any])
    if (excludeTimes != null) __obj.updateDynamic("excludeTimes")(excludeTimes.asInstanceOf[js.Any])
    if (filterDate != null) __obj.updateDynamic("filterDate")(js.Any.fromFunction1((t0: /* date */ js.Date) => filterDate(t0).runNow()))
    if (!js.isUndefined(fixedHeight)) __obj.updateDynamic("fixedHeight")(fixedHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShowMonthNavigation)) __obj.updateDynamic("forceShowMonthNavigation")(forceShowMonthNavigation.asInstanceOf[js.Any])
    if (formatWeekDay != null) __obj.updateDynamic("formatWeekDay")(js.Any.fromFunction1((t0: /* formattedDate */ java.lang.String) => formatWeekDay(t0).runNow()))
    if (formatWeekNumber != null) __obj.updateDynamic("formatWeekNumber")(js.Any.fromFunction1((t0: /* date */ js.Date) => formatWeekNumber(t0).runNow()))
    if (highlightDates != null) __obj.updateDynamic("highlightDates")(highlightDates.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (includeDates != null) __obj.updateDynamic("includeDates")(includeDates.asInstanceOf[js.Any])
    if (includeTimes != null) __obj.updateDynamic("includeTimes")(includeTimes.asInstanceOf[js.Any])
    if (injectTimes != null) __obj.updateDynamic("injectTimes")(injectTimes.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineFocusSelectedMonth)) __obj.updateDynamic("inlineFocusSelectedMonth")(inlineFocusSelectedMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearable)) __obj.updateDynamic("isClearable")(isClearable.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (monthsShown != null) __obj.updateDynamic("monthsShown")(monthsShown.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextMonthButtonLabel != null) __obj.updateDynamic("nextMonthButtonLabel")(nextMonthButtonLabel.asInstanceOf[js.Any])
    if (nextYearButtonLabel != null) __obj.updateDynamic("nextYearButtonLabel")(nextYearButtonLabel.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onBlur(t0).runNow()))
    onCalendarClose.foreach(p => __obj.updateDynamic("onCalendarClose")(p.toJsFn))
    onCalendarOpen.foreach(p => __obj.updateDynamic("onCalendarOpen")(p.toJsFn))
    if (onChangeRaw != null) __obj.updateDynamic("onChangeRaw")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChangeRaw(t0).runNow()))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClickOutside(t0).runNow()))
    if (onDayMouseEnter != null) __obj.updateDynamic("onDayMouseEnter")(js.Any.fromFunction1((t0: /* date */ js.Date) => onDayMouseEnter(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onFocus(t0).runNow()))
    onInputClick.foreach(p => __obj.updateDynamic("onInputClick")(p.toJsFn))
    if (onInputError != null) __obj.updateDynamic("onInputError")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.reactDatepicker.AnonCode) => onInputError(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onKeyDown(t0).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1((t0: /* date */ js.Date) => onMonthChange(t0).runNow()))
    onMonthMouseLeave.foreach(p => __obj.updateDynamic("onMonthMouseLeave")(p.toJsFn))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* event */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]]) => onSelect(t0, t1).runNow()))
    if (onWeekSelect != null) __obj.updateDynamic("onWeekSelect")(js.Any.fromFunction3((t0: /* firstDayOfWeek */ js.Date, t1: /* weekNumber */ java.lang.String | scala.Double, t2: /* event */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]]) => onWeekSelect(t0, t1, t2).runNow()))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1((t0: /* date */ js.Date) => onYearChange(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (openToDate != null) __obj.updateDynamic("openToDate")(openToDate.asInstanceOf[js.Any])
    if (!js.isUndefined(peekNextMonth)) __obj.updateDynamic("peekNextMonth")(peekNextMonth.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (popperClassName != null) __obj.updateDynamic("popperClassName")(popperClassName.asInstanceOf[js.Any])
    if (popperContainer != null) __obj.updateDynamic("popperContainer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDatepicker.AnonChildren) => popperContainer(t0).runNow()))
    if (popperModifiers != null) __obj.updateDynamic("popperModifiers")(popperModifiers.asInstanceOf[js.Any])
    if (popperPlacement != null) __obj.updateDynamic("popperPlacement")(popperPlacement.asInstanceOf[js.Any])
    if (popperProps != null) __obj.updateDynamic("popperProps")(popperProps.asInstanceOf[js.Any])
    if (!js.isUndefined(preventOpenOnFocus)) __obj.updateDynamic("preventOpenOnFocus")(preventOpenOnFocus.asInstanceOf[js.Any])
    if (previousMonthButtonLabel != null) __obj.updateDynamic("previousMonthButtonLabel")(previousMonthButtonLabel.asInstanceOf[js.Any])
    if (previousYearButtonLabel != null) __obj.updateDynamic("previousYearButtonLabel")(previousYearButtonLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (renderCustomHeader != null) __obj.updateDynamic("renderCustomHeader")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactDatepicker.AnonChangeMonth) => renderCustomHeader(t0).runNow()))
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(js.Any.fromFunction2((t0: /* dayOfMonth */ scala.Double, t1: /* date */ js.UndefOr[js.Date]) => renderDayContents(t0, t1).runNow()))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollableMonthYearDropdown)) __obj.updateDynamic("scrollableMonthYearDropdown")(scrollableMonthYearDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollableYearDropdown)) __obj.updateDynamic("scrollableYearDropdown")(scrollableYearDropdown.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(selectsEnd)) __obj.updateDynamic("selectsEnd")(selectsEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(selectsStart)) __obj.updateDynamic("selectsStart")(selectsStart.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnSelect)) __obj.updateDynamic("shouldCloseOnSelect")(shouldCloseOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(showDisabledMonthNavigation)) __obj.updateDynamic("showDisabledMonthNavigation")(showDisabledMonthNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthDropdown)) __obj.updateDynamic("showMonthDropdown")(showMonthDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthYearDropdown)) __obj.updateDynamic("showMonthYearDropdown")(showMonthYearDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthYearPicker)) __obj.updateDynamic("showMonthYearPicker")(showMonthYearPicker.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopperArrow)) __obj.updateDynamic("showPopperArrow")(showPopperArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreviousMonths)) __obj.updateDynamic("showPreviousMonths")(showPreviousMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showQuarterYearPicker)) __obj.updateDynamic("showQuarterYearPicker")(showQuarterYearPicker.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeInput)) __obj.updateDynamic("showTimeInput")(showTimeInput.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeSelect)) __obj.updateDynamic("showTimeSelect")(showTimeSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeSelectOnly)) __obj.updateDynamic("showTimeSelectOnly")(showTimeSelectOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(showYearDropdown)) __obj.updateDynamic("showYearDropdown")(showYearDropdown.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(strictParsing)) __obj.updateDynamic("strictParsing")(strictParsing.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (timeCaption != null) __obj.updateDynamic("timeCaption")(timeCaption.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (timeInputLabel != null) __obj.updateDynamic("timeInputLabel")(timeInputLabel.asInstanceOf[js.Any])
    if (timeIntervals != null) __obj.updateDynamic("timeIntervals")(timeIntervals.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (todayButton != null) __obj.updateDynamic("todayButton")(todayButton.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(useShortMonthInDropdown)) __obj.updateDynamic("useShortMonthInDropdown")(useShortMonthInDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(useWeekdaysShort)) __obj.updateDynamic("useWeekdaysShort")(useWeekdaysShort.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (weekLabel != null) __obj.updateDynamic("weekLabel")(weekLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    if (yearDropdownItemNumber != null) __obj.updateDynamic("yearDropdownItemNumber")(yearDropdownItemNumber.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDatepicker.mod.ReactDatePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDatepicker.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDatepicker.mod.ReactDatePickerProps])(children: _*)
  }
  @JSImport("react-datepicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

