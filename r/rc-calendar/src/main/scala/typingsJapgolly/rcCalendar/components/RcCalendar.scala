package typingsJapgolly.rcCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.rcCalendar.mod.Mode
import typingsJapgolly.rcCalendar.mod.Props
import typingsJapgolly.rcCalendar.mod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcCalendar {
  def apply(
    className: String = null,
    dateInputPlaceholder: String = null,
    dateRender: (/* current */ Moment, /* value */ Moment) => CallbackTo[Node] = null,
    defaultValue: Moment = null,
    disabledDate: /* current */ js.UndefOr[Moment] => CallbackTo[Boolean] = null,
    disabledTime: /* current */ js.UndefOr[Moment] => CallbackTo[js.Object] = null,
    format: String | js.Array[String] = null,
    inputMode: String = null,
    locale: js.Object = null,
    mode: Mode = null,
    monthCellContentRender: (/* current */ Moment, /* locale */ js.Object) => CallbackTo[Node] = null,
    monthCellRender: (/* current */ Moment, /* locale */ js.Object) => CallbackTo[String] = null,
    onChange: /* date */ Moment | Null => Callback = null,
    onClear: js.UndefOr[Callback] = js.undefined,
    onKeyDown: js.UndefOr[Callback] = js.undefined,
    onOk: js.UndefOr[Callback] = js.undefined,
    onPanelChange: (/* date */ Moment | Null, /* mode */ Mode) => Callback = null,
    onSelect: /* date */ Moment => Callback = null,
    prefixCls: String = null,
    renderFooter: js.UndefOr[CallbackTo[Node]] = js.undefined,
    renderSidebar: js.UndefOr[CallbackTo[Node]] = js.undefined,
    selectedValue: Moment = null,
    showDateInput: js.UndefOr[Boolean] = js.undefined,
    showOk: js.UndefOr[Boolean] = js.undefined,
    showToday: js.UndefOr[Boolean] = js.undefined,
    showWeekNumber: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    timePicker: VdomNode = null,
    value: Moment = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateInputPlaceholder != null) __obj.updateDynamic("dateInputPlaceholder")(dateInputPlaceholder.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.moment.mod.Moment, t1: /* value */ typingsJapgolly.moment.mod.Moment) => dateRender(t0, t1).runNow()))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* current */ js.UndefOr[typingsJapgolly.moment.mod.Moment]) => disabledDate(t0).runNow()))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1((t0: /* current */ js.UndefOr[typingsJapgolly.moment.mod.Moment]) => disabledTime(t0).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellContentRender != null) __obj.updateDynamic("monthCellContentRender")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.moment.mod.Moment, t1: /* locale */ js.Object) => monthCellContentRender(t0, t1).runNow()))
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.moment.mod.Moment, t1: /* locale */ js.Object) => monthCellRender(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.moment.mod.Moment | scala.Null) => onChange(t0).runNow()))
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    onKeyDown.foreach(p => __obj.updateDynamic("onKeyDown")(p.toJsFn))
    onOk.foreach(p => __obj.updateDynamic("onOk")(p.toJsFn))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: /* date */ typingsJapgolly.moment.mod.Moment | scala.Null, t1: /* mode */ typingsJapgolly.rcCalendar.mod.Mode) => onPanelChange(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.moment.mod.Moment) => onSelect(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    renderFooter.foreach(p => __obj.updateDynamic("renderFooter")(p.toJsFn))
    renderSidebar.foreach(p => __obj.updateDynamic("renderSidebar")(p.toJsFn))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(showDateInput)) __obj.updateDynamic("showDateInput")(showDateInput.asInstanceOf[js.Any])
    if (!js.isUndefined(showOk)) __obj.updateDynamic("showOk")(showOk.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumber)) __obj.updateDynamic("showWeekNumber")(showWeekNumber.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (timePicker != null) __obj.updateDynamic("timePicker")(timePicker.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcCalendar.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcCalendar.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcCalendar.mod.Props])(children: _*)
  }
  @JSImport("rc-calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

