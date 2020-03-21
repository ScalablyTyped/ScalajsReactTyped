package typingsJapgolly.antd.generateCalendarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antd.AnonLang
import typingsJapgolly.antd.antdStrings.date
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.time
import typingsJapgolly.rcPicker.dateBodyMod.DateRender
import typingsJapgolly.rcPicker.interfaceMod.Components
import typingsJapgolly.rcPicker.interfaceMod.Locale
import typingsJapgolly.rcPicker.interfaceMod.OnPanelChange
import typingsJapgolly.rcPicker.interfaceMod.PanelMode
import typingsJapgolly.rcPicker.interfaceMod.PickerMode
import typingsJapgolly.rcPicker.monthBodyMod.MonthCellRender
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/calendar/generateCalendar.InjectDefaultProps<rc-picker.rc-picker/lib/PickerPanel.PickerPanelBaseProps<DateType>> */
trait PickerPanelBaseProps[DateType] extends PickerProps[DateType] {
  var className: js.UndefOr[String] = js.undefined
  var components: js.UndefOr[Components] = js.undefined
  var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
  var defaultPickerValue: js.UndefOr[DateType] = js.undefined
  var defaultValue: js.UndefOr[DateType] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var hideHeader: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[AnonLang] = js.undefined
  var mode: js.UndefOr[PanelMode] = js.undefined
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
  var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.undefined
  var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
  var picker: Exclude[PickerMode, date | time]
  var pickerValue: js.UndefOr[DateType] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, Node]] = js.undefined
  var size: js.UndefOr[large | typingsJapgolly.antd.antdStrings.default | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[DateType] = js.undefined
}

object PickerPanelBaseProps {
  @scala.inline
  def apply[DateType](
    picker: Exclude[PickerMode, date | time],
    className: String = null,
    components: Components = null,
    dateRender: (DateType, DateType) => CallbackTo[Node] = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    direction: ltr | rtl = null,
    disabledDate: /* date */ DateType => CallbackTo[Boolean] = null,
    hideHeader: js.UndefOr[Boolean] = js.undefined,
    locale: AnonLang = null,
    mode: PanelMode = null,
    monthCellRender: (DateType, /* locale */ Locale) => CallbackTo[Node] = null,
    onChange: /* value */ DateType => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onOk: /* date */ DateType => Callback = null,
    onPanelChange: (DateType, /* mode */ PanelMode) => Callback = null,
    onPickerValueChange: /* date */ DateType => Callback = null,
    onSelect: /* value */ DateType => Callback = null,
    pickerValue: DateType = null,
    prefixCls: String = null,
    renderExtraFooter: /* mode */ PanelMode => CallbackTo[Node] = null,
    size: large | typingsJapgolly.antd.antdStrings.default | small = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    value: DateType = null
  ): PickerPanelBaseProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: DateType, t1: DateType) => dateRender(t0, t1).runNow()))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* date */ DateType) => disabledDate(t0).runNow()))
    if (!js.isUndefined(hideHeader)) __obj.updateDynamic("hideHeader")(hideHeader.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2((t0: DateType, t1: /* locale */ typingsJapgolly.rcPicker.interfaceMod.Locale) => monthCellRender(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ DateType) => onChange(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseDown(t0).runNow()))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* date */ DateType) => onOk(t0).runNow()))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: DateType, t1: /* mode */ typingsJapgolly.rcPicker.interfaceMod.PanelMode) => onPanelChange(t0, t1).runNow()))
    if (onPickerValueChange != null) __obj.updateDynamic("onPickerValueChange")(js.Any.fromFunction1((t0: /* date */ DateType) => onPickerValueChange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* value */ DateType) => onSelect(t0).runNow()))
    if (pickerValue != null) __obj.updateDynamic("pickerValue")(pickerValue.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1((t0: /* mode */ typingsJapgolly.rcPicker.interfaceMod.PanelMode) => renderExtraFooter(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelBaseProps[DateType]]
  }
}

