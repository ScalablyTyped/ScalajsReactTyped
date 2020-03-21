package typingsJapgolly.rcPicker.datetimePanelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcPicker.dateBodyMod.DateRender
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.DisabledTime
import typingsJapgolly.rcPicker.interfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.interfaceMod.Locale
import typingsJapgolly.rcPicker.interfaceMod.NullableDateType
import typingsJapgolly.rcPicker.interfaceMod.OnSelect
import typingsJapgolly.rcPicker.interfaceMod.PanelMode
import typingsJapgolly.rcPicker.interfaceMod.PanelRefProps
import typingsJapgolly.rcPicker.rcPickerStrings.key
import typingsJapgolly.rcPicker.rcPickerStrings.mouse
import typingsJapgolly.rcPicker.rcPickerStrings.submit
import typingsJapgolly.rcPicker.timePanelMod.SharedTimeProps
import typingsJapgolly.rcPicker.uiUtilMod.KeyboardConfig
import typingsJapgolly.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-picker.rc-picker/lib/panels/DatePanel.DatePanelProps<DateType>, 'disabledHours' | 'disabledMinutes' | 'disabledSeconds'> */
trait DatetimePanelProps[DateType] extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
  var defaultPickerValue: js.UndefOr[DateType] = js.undefined
  var defaultValue: js.UndefOr[DateType] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var keyboardConfig: js.UndefOr[KeyboardConfig] = js.undefined
  var locale: Locale
  var nextIcon: js.UndefOr[Node] = js.undefined
  var onPanelChange: js.Function2[/* mode */ PanelMode | Null, /* viewValue */ DateType, Unit]
  var onSelect: OnSelect[DateType]
  var onViewDateChange: js.Function1[/* value */ DateType, Unit]
  var operationRef: MutableRefObject[PanelRefProps]
  var panelName: js.UndefOr[String] = js.undefined
  var prefixCls: String
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
  var prevIcon: js.UndefOr[Node] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
  var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.undefined
  var superNextIcon: js.UndefOr[Node] = js.undefined
  var superPrevIcon: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[NullableDateType[DateType]] = js.undefined
  var viewDate: DateType
}

object DatetimePanelProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onPanelChange: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Callback,
    onSelect: (DateType, /* type */ key | mouse | submit) => Callback,
    onViewDateChange: /* value */ DateType => Callback,
    operationRef: MutableRefObject[PanelRefProps],
    prefixCls: String,
    viewDate: DateType,
    active: js.UndefOr[Boolean] = js.undefined,
    dateRender: (DateType, DateType) => CallbackTo[Node] = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    disabledDate: /* date */ DateType => CallbackTo[Boolean] = null,
    disabledTime: /* date */ DateType | Null => CallbackTo[DisabledTimes] = null,
    keyboardConfig: KeyboardConfig = null,
    nextIcon: VdomNode = null,
    panelName: String = null,
    prefixColumn: /* date */ DateType => CallbackTo[Node] = null,
    prevIcon: VdomNode = null,
    rowClassName: /* date */ DateType => CallbackTo[String] = null,
    showTime: Boolean | SharedTimeProps[DateType] = null,
    superNextIcon: VdomNode = null,
    superPrevIcon: VdomNode = null,
    value: NullableDateType[DateType] = null
  ): DatetimePanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: /* mode */ typingsJapgolly.rcPicker.interfaceMod.PanelMode | scala.Null, t1: /* viewValue */ DateType) => onPanelChange(t0, t1).runNow()))
    __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: DateType, t1: /* type */ typingsJapgolly.rcPicker.rcPickerStrings.key | typingsJapgolly.rcPicker.rcPickerStrings.mouse | typingsJapgolly.rcPicker.rcPickerStrings.submit) => onSelect(t0, t1).runNow()))
    __obj.updateDynamic("onViewDateChange")(js.Any.fromFunction1((t0: /* value */ DateType) => onViewDateChange(t0).runNow()))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: DateType, t1: DateType) => dateRender(t0, t1).runNow()))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* date */ DateType) => disabledDate(t0).runNow()))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1((t0: /* date */ DateType | scala.Null) => disabledTime(t0).runNow()))
    if (keyboardConfig != null) __obj.updateDynamic("keyboardConfig")(keyboardConfig.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.rawNode.asInstanceOf[js.Any])
    if (panelName != null) __obj.updateDynamic("panelName")(panelName.asInstanceOf[js.Any])
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1((t0: /* date */ DateType) => prefixColumn(t0).runNow()))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.rawNode.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1((t0: /* date */ DateType) => rowClassName(t0).runNow()))
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.rawNode.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimePanelProps[DateType]]
  }
}

