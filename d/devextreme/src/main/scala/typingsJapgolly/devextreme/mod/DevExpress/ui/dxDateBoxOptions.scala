package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonComponentDate
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonComponentT
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementEventJQueryEvent
import typingsJapgolly.devextreme.AnonIcon
import typingsJapgolly.devextreme.AnonJQueryEvent
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.calendar
import typingsJapgolly.devextreme.devextremeStrings.century
import typingsJapgolly.devextreme.devextremeStrings.clear
import typingsJapgolly.devextreme.devextremeStrings.date
import typingsJapgolly.devextreme.devextremeStrings.datetime
import typingsJapgolly.devextreme.devextremeStrings.decade
import typingsJapgolly.devextreme.devextremeStrings.dropDown
import typingsJapgolly.devextreme.devextremeStrings.email
import typingsJapgolly.devextreme.devextremeStrings.filled
import typingsJapgolly.devextreme.devextremeStrings.instantly
import typingsJapgolly.devextreme.devextremeStrings.invalid
import typingsJapgolly.devextreme.devextremeStrings.list
import typingsJapgolly.devextreme.devextremeStrings.month
import typingsJapgolly.devextreme.devextremeStrings.native
import typingsJapgolly.devextreme.devextremeStrings.onFocus
import typingsJapgolly.devextreme.devextremeStrings.outlined
import typingsJapgolly.devextreme.devextremeStrings.password
import typingsJapgolly.devextreme.devextremeStrings.pending
import typingsJapgolly.devextreme.devextremeStrings.rollers
import typingsJapgolly.devextreme.devextremeStrings.search
import typingsJapgolly.devextreme.devextremeStrings.tel
import typingsJapgolly.devextreme.devextremeStrings.text
import typingsJapgolly.devextreme.devextremeStrings.time
import typingsJapgolly.devextreme.devextremeStrings.underlined
import typingsJapgolly.devextreme.devextremeStrings.url
import typingsJapgolly.devextreme.devextremeStrings.useButtons
import typingsJapgolly.devextreme.devextremeStrings.valid
import typingsJapgolly.devextreme.devextremeStrings.year
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDateBoxOptions extends dxDropDownEditorOptions[dxDateBox] {
  /** Specifies whether or not adaptive widget rendering is enabled on a small screen. */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.undefined
  /** The text displayed on the Apply button. */
  var applyButtonText: js.UndefOr[String] = js.undefined
  /** Configures the calendar's value picker. Applies only if the pickerType is "calendar". */
  var calendarOptions: js.UndefOr[dxCalendarOptions] = js.undefined
  /** The text displayed on the Cancel button. */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  /** Specifies the message displayed if the specified date is later than the max value or earlier than the min value. */
  var dateOutOfRangeMessage: js.UndefOr[String] = js.undefined
  /** Specifies the date-time value serialization format. Use it only if you do not specify the value at design time. */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  /** Specifies dates to be disabled. Applies only if pickerType is "calendar". */
  var disabledDates: js.UndefOr[js.Array[js.Date] | (js.Function1[/* data */ AnonComponentDate, Boolean])] = js.undefined
  /** Specifies the date display format. Ignored if the pickerType option is "native" */
  var displayFormat: js.UndefOr[format] = js.undefined
  /** Specifies the interval between neighboring values in the popup list in minutes. */
  var interval: js.UndefOr[Double] = js.undefined
  /** Specifies the message displayed if the typed value is not a valid date or time. */
  var invalidDateMessage: js.UndefOr[String] = js.undefined
  /** The last date that can be selected within the widget. */
  var max: js.UndefOr[js.Date | Double | String] = js.undefined
  /** @deprecated Use the calendarOptions option instead. */
  /** Specifies the maximum zoom level of a calendar, which is used to pick the date. */
  var maxZoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
  /** The minimum date that can be selected within the widget. */
  var min: js.UndefOr[js.Date | Double | String] = js.undefined
  /** @deprecated Use the calendarOptions option instead. */
  /** Specifies the minimal zoom level of a calendar, which is used to pick the date. */
  var minZoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
  /** Specifies the type of the date/time picker. */
  var pickerType: js.UndefOr[calendar | list | native | rollers] = js.undefined
  /** Specifies whether to show the analog clock in the value picker. Applies only if type is "datetime" and pickerType is "calendar". */
  var showAnalogClock: js.UndefOr[Boolean] = js.undefined
  /** A format used to display date/time information. */
  var `type`: js.UndefOr[date | datetime | time] = js.undefined
  /** Specifies whether to control user input using a mask created based on the displayFormat. */
  var useMaskBehavior: js.UndefOr[Boolean] = js.undefined
  /** An object or a value specifying the date and time currently selected using the date box. */
  @JSName("value")
  var value_dxDateBoxOptions: js.UndefOr[js.Date | Double | String] = js.undefined
}

object dxDateBoxOptions {
  @scala.inline
  def apply(
    acceptCustomValue: js.UndefOr[Boolean] = js.undefined,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    adaptivityEnabled: js.UndefOr[Boolean] = js.undefined,
    applyButtonText: String = null,
    applyValueMode: instantly | useButtons = null,
    bindingOptions: js.Any = null,
    buttons: js.Array[clear | dropDown | dxTextEditorButton] = null,
    calendarOptions: dxCalendarOptions = null,
    cancelButtonText: String = null,
    dateOutOfRangeMessage: String = null,
    dateSerializationFormat: String = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[js.Date] | (js.Function1[/* data */ AnonComponentDate, Boolean]) = null,
    displayFormat: format = null,
    dropDownButtonTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    interval: Int | Double = null,
    invalidDateMessage: String = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    max: js.Date | Double | String = null,
    maxLength: String | Double = null,
    maxZoomLevel: century | decade | month | year = null,
    min: js.Date | Double | String = null,
    minZoomLevel: century | decade | month | year = null,
    mode: email | password | search | tel | text | url = null,
    name: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onClosed: /* e */ AnonComponentT[dxDateBox] => CallbackTo[js.Any] = null,
    onContentReady: /* e */ AnonComponentElement[dxDateBox] => CallbackTo[js.Any] = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onCut: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxDateBox] => CallbackTo[js.Any] = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxDateBox] => CallbackTo[js.Any] = null,
    onInput: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onOpened: /* e */ AnonComponentT[dxDateBox] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxDateBox] => CallbackTo[js.Any] = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    onValueChanged: /* e */ AnonJQueryEvent[dxDateBox] => CallbackTo[js.Any] = null,
    openOnFieldClick: js.UndefOr[Boolean] = js.undefined,
    opened: js.UndefOr[Boolean] = js.undefined,
    pickerType: calendar | list | native | rollers = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showAnalogClock: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showDropDownButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    text: String = null,
    `type`: date | datetime | time = null,
    useMaskBehavior: js.UndefOr[Boolean] = js.undefined,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: js.Date | Double | String = null,
    valueChangeEvent: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDateBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptCustomValue)) __obj.updateDynamic("acceptCustomValue")(acceptCustomValue.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptivityEnabled)) __obj.updateDynamic("adaptivityEnabled")(adaptivityEnabled.asInstanceOf[js.Any])
    if (applyButtonText != null) __obj.updateDynamic("applyButtonText")(applyButtonText.asInstanceOf[js.Any])
    if (applyValueMode != null) __obj.updateDynamic("applyValueMode")(applyValueMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (calendarOptions != null) __obj.updateDynamic("calendarOptions")(calendarOptions.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (dateOutOfRangeMessage != null) __obj.updateDynamic("dateOutOfRangeMessage")(dateOutOfRangeMessage.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat.asInstanceOf[js.Any])
    if (dropDownButtonTemplate != null) __obj.updateDynamic("dropDownButtonTemplate")(dropDownButtonTemplate.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (invalidDateMessage != null) __obj.updateDynamic("invalidDateMessage")(invalidDateMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onChange(t0).runNow()))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentT[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onClosed(t0).runNow()))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onContentReady(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onCut(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onDisposing(t0).runNow()))
    if (onEnterKey != null) __obj.updateDynamic("onEnterKey")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onEnterKey(t0).runNow()))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onFocusIn(t0).runNow()))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onFocusOut(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onInitialized(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onInput(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onKeyUp(t0).runNow()))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentT[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onOpened(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onOptionChanged(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onPaste(t0).runNow()))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDateBox]) => onValueChanged(t0).runNow()))
    if (!js.isUndefined(openOnFieldClick)) __obj.updateDynamic("openOnFieldClick")(openOnFieldClick.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (pickerType != null) __obj.updateDynamic("pickerType")(pickerType.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showAnalogClock)) __obj.updateDynamic("showAnalogClock")(showAnalogClock.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskBehavior)) __obj.updateDynamic("useMaskBehavior")(useMaskBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDateBoxOptions]
  }
}

