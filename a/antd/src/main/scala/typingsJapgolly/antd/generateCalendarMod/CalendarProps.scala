package typingsJapgolly.antd.generateCalendarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.AnonLang
import typingsJapgolly.antd.AnonOnChange
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps[DateType] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dateCellRender: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
  var dateFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
  var defaultValue: js.UndefOr[DateType] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var headerRender: js.UndefOr[HeaderRender[DateType]] = js.undefined
  var locale: js.UndefOr[AnonLang] = js.undefined
  var mode: js.UndefOr[CalendarMode] = js.undefined
  var monthCellRender: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
  var monthFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
  var onPanelChange: js.UndefOr[js.Function2[/* date */ DateType, /* mode */ CalendarMode, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
  var value: js.UndefOr[DateType] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply[DateType](
    className: String = null,
    dateCellRender: /* date */ DateType => CallbackTo[Node] = null,
    dateFullCellRender: /* date */ DateType => CallbackTo[Node] = null,
    defaultValue: DateType = null,
    disabledDate: /* date */ DateType => CallbackTo[Boolean] = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* config */ AnonOnChange[DateType] => CallbackTo[Node] = null,
    locale: AnonLang = null,
    mode: CalendarMode = null,
    monthCellRender: /* date */ DateType => CallbackTo[Node] = null,
    monthFullCellRender: /* date */ DateType => CallbackTo[Node] = null,
    onChange: /* date */ DateType => Callback = null,
    onPanelChange: (/* date */ DateType, /* mode */ CalendarMode) => Callback = null,
    onSelect: /* date */ DateType => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    validRange: js.Tuple2[DateType, DateType] = null,
    value: DateType = null
  ): CalendarProps[DateType] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateCellRender != null) __obj.updateDynamic("dateCellRender")(js.Any.fromFunction1((t0: /* date */ DateType) => dateCellRender(t0).runNow()))
    if (dateFullCellRender != null) __obj.updateDynamic("dateFullCellRender")(js.Any.fromFunction1((t0: /* date */ DateType) => dateFullCellRender(t0).runNow()))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* date */ DateType) => disabledDate(t0).runNow()))
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1((t0: /* config */ typingsJapgolly.antd.AnonOnChange[DateType]) => headerRender(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction1((t0: /* date */ DateType) => monthCellRender(t0).runNow()))
    if (monthFullCellRender != null) __obj.updateDynamic("monthFullCellRender")(js.Any.fromFunction1((t0: /* date */ DateType) => monthFullCellRender(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* date */ DateType) => onChange(t0).runNow()))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: /* date */ DateType, t1: /* mode */ typingsJapgolly.antd.generateCalendarMod.CalendarMode) => onPanelChange(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* date */ DateType) => onSelect(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps[DateType]]
  }
}

