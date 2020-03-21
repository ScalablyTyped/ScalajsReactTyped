package typingsJapgolly.primereact.calendarCalendarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.primereact.AnonOriginalEventEvent
import typingsJapgolly.primereact.AnonOriginalEventValue
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  var baseZIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearButtonStyleClass: js.UndefOr[String] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var dateTemplate: js.UndefOr[js.Function1[/* dateMeta */ DateMetaData, Node]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  var disabledDays: js.UndefOr[js.Array[Double]] = js.undefined
  var footerTemplate: js.UndefOr[js.Function0[Node]] = js.undefined
  var headerTemplate: js.UndefOr[js.Function0[Node]] = js.undefined
  var hideOnDateTimeSelect: js.UndefOr[Boolean] = js.undefined
  var hourFormat: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[js.Object] = js.undefined
  var locale: js.UndefOr[LocaleSettings] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var maxDateCount: js.UndefOr[Double] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var monthNavigator: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ AnonOriginalEventEvent, Unit]] = js.undefined
  var onClearButtonClick: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInput: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ AnonOriginalEventValue, Unit]] = js.undefined
  var onTodayButtonClick: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onViewDateChange: js.UndefOr[js.Function1[/* e */ AnonOriginalEventValue, Unit]] = js.undefined
  var panelClassName: js.UndefOr[String] = js.undefined
  var panelStyle: js.UndefOr[js.Object] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnlyInput: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var selectOtherMonths: js.UndefOr[Boolean] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var shortYearCutoff: js.UndefOr[String] = js.undefined
  var showButtonBar: js.UndefOr[Boolean] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  var showOtherMonths: js.UndefOr[Boolean] = js.undefined
  var showSeconds: js.UndefOr[Boolean] = js.undefined
  var showTime: js.UndefOr[Boolean] = js.undefined
  var showWeek: js.UndefOr[Boolean] = js.undefined
  var stepHour: js.UndefOr[Double] = js.undefined
  var stepMinute: js.UndefOr[Double] = js.undefined
  var stepSecond: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var timeOnly: js.UndefOr[Boolean] = js.undefined
  var todayButtonClassName: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var touchUI: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var viewDate: js.UndefOr[js.Date] = js.undefined
  var yearNavigator: js.UndefOr[Boolean] = js.undefined
  var yearRange: js.UndefOr[String] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    ariaLabelledBy: String = null,
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    baseZIndex: Int | Double = null,
    className: String = null,
    clearButtonStyleClass: String = null,
    dateFormat: String = null,
    dateTemplate: /* dateMeta */ DateMetaData => CallbackTo[Node] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[js.Date] = null,
    disabledDays: js.Array[Double] = null,
    footerTemplate: js.UndefOr[CallbackTo[Node]] = js.undefined,
    headerTemplate: js.UndefOr[CallbackTo[Node]] = js.undefined,
    hideOnDateTimeSelect: js.UndefOr[Boolean] = js.undefined,
    hourFormat: String = null,
    icon: String = null,
    id: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputClassName: String = null,
    inputId: String = null,
    inputStyle: js.Object = null,
    locale: LocaleSettings = null,
    maxDate: js.Date = null,
    maxDateCount: Int | Double = null,
    minDate: js.Date = null,
    monthNavigator: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    numberOfMonths: Int | Double = null,
    onBlur: /* event */ Event_ => Callback = null,
    onChange: /* e */ AnonOriginalEventEvent => Callback = null,
    onClearButtonClick: /* event */ Event_ => Callback = null,
    onFocus: /* event */ Event_ => Callback = null,
    onInput: /* event */ Event_ => Callback = null,
    onSelect: /* e */ AnonOriginalEventValue => Callback = null,
    onTodayButtonClick: /* event */ Event_ => Callback = null,
    onViewDateChange: /* e */ AnonOriginalEventValue => Callback = null,
    panelClassName: String = null,
    panelStyle: js.Object = null,
    placeholder: String = null,
    readOnlyInput: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    selectOtherMonths: js.UndefOr[Boolean] = js.undefined,
    selectionMode: String = null,
    shortYearCutoff: String = null,
    showButtonBar: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    showOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showSeconds: js.UndefOr[Boolean] = js.undefined,
    showTime: js.UndefOr[Boolean] = js.undefined,
    showWeek: js.UndefOr[Boolean] = js.undefined,
    stepHour: Int | Double = null,
    stepMinute: Int | Double = null,
    stepSecond: Int | Double = null,
    style: js.Object = null,
    tabIndex: String = null,
    timeOnly: js.UndefOr[Boolean] = js.undefined,
    todayButtonClassName: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    touchUI: js.UndefOr[Boolean] = js.undefined,
    value: js.Date | js.Array[js.Date] = null,
    view: String = null,
    viewDate: js.Date = null,
    yearNavigator: js.UndefOr[Boolean] = js.undefined,
    yearRange: String = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearButtonStyleClass != null) __obj.updateDynamic("clearButtonStyleClass")(clearButtonStyleClass.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateTemplate != null) __obj.updateDynamic("dateTemplate")(js.Any.fromFunction1((t0: /* dateMeta */ typingsJapgolly.primereact.calendarCalendarMod.DateMetaData) => dateTemplate(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    footerTemplate.foreach(p => __obj.updateDynamic("footerTemplate")(p.toJsFn))
    headerTemplate.foreach(p => __obj.updateDynamic("headerTemplate")(p.toJsFn))
    if (!js.isUndefined(hideOnDateTimeSelect)) __obj.updateDynamic("hideOnDateTimeSelect")(hideOnDateTimeSelect.asInstanceOf[js.Any])
    if (hourFormat != null) __obj.updateDynamic("hourFormat")(hourFormat.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxDateCount != null) __obj.updateDynamic("maxDateCount")(maxDateCount.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(monthNavigator)) __obj.updateDynamic("monthNavigator")(monthNavigator.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOriginalEventEvent) => onChange(t0).runNow()))
    if (onClearButtonClick != null) __obj.updateDynamic("onClearButtonClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClearButtonClick(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInput(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOriginalEventValue) => onSelect(t0).runNow()))
    if (onTodayButtonClick != null) __obj.updateDynamic("onTodayButtonClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onTodayButtonClick(t0).runNow()))
    if (onViewDateChange != null) __obj.updateDynamic("onViewDateChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOriginalEventValue) => onViewDateChange(t0).runNow()))
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (panelStyle != null) __obj.updateDynamic("panelStyle")(panelStyle.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnlyInput)) __obj.updateDynamic("readOnlyInput")(readOnlyInput.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (shortYearCutoff != null) __obj.updateDynamic("shortYearCutoff")(shortYearCutoff.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtonBar)) __obj.updateDynamic("showButtonBar")(showButtonBar.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeek)) __obj.updateDynamic("showWeek")(showWeek.asInstanceOf[js.Any])
    if (stepHour != null) __obj.updateDynamic("stepHour")(stepHour.asInstanceOf[js.Any])
    if (stepMinute != null) __obj.updateDynamic("stepMinute")(stepMinute.asInstanceOf[js.Any])
    if (stepSecond != null) __obj.updateDynamic("stepSecond")(stepSecond.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(timeOnly)) __obj.updateDynamic("timeOnly")(timeOnly.asInstanceOf[js.Any])
    if (todayButtonClassName != null) __obj.updateDynamic("todayButtonClassName")(todayButtonClassName.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(touchUI)) __obj.updateDynamic("touchUI")(touchUI.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewDate != null) __obj.updateDynamic("viewDate")(viewDate.asInstanceOf[js.Any])
    if (!js.isUndefined(yearNavigator)) __obj.updateDynamic("yearNavigator")(yearNavigator.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

