package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.AnonLang
import typingsJapgolly.antd.AnonOnChange
import typingsJapgolly.antd.generateCalendarMod.CalendarMode
import typingsJapgolly.antd.generateCalendarMod.CalendarProps
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  def apply(
    className: String = null,
    dateCellRender: Moment => CallbackTo[Node] = null,
    dateFullCellRender: Moment => CallbackTo[Node] = null,
    defaultValue: Moment = null,
    disabledDate: Moment => CallbackTo[Boolean] = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* config */ AnonOnChange[Moment] => CallbackTo[Node] = null,
    locale: AnonLang = null,
    mode: CalendarMode = null,
    monthCellRender: Moment => CallbackTo[Node] = null,
    monthFullCellRender: Moment => CallbackTo[Node] = null,
    onChange: Moment => Callback = null,
    onPanelChange: (Moment, /* mode */ CalendarMode) => Callback = null,
    onSelect: Moment => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    value: Moment = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    CalendarProps[Moment], 
    MountedWithRawType[CalendarProps[Moment], js.Object, RawMounted[CalendarProps[Moment], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateCellRender != null) __obj.updateDynamic("dateCellRender")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => dateCellRender(t0).runNow()))
    if (dateFullCellRender != null) __obj.updateDynamic("dateFullCellRender")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => dateFullCellRender(t0).runNow()))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => disabledDate(t0).runNow()))
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1((t0: /* config */ typingsJapgolly.antd.AnonOnChange[typingsJapgolly.moment.mod.Moment]) => headerRender(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => monthCellRender(t0).runNow()))
    if (monthFullCellRender != null) __obj.updateDynamic("monthFullCellRender")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => monthFullCellRender(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => onChange(t0).runNow()))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: typingsJapgolly.moment.mod.Moment, t1: /* mode */ typingsJapgolly.antd.generateCalendarMod.CalendarMode) => onPanelChange(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => onSelect(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.generateCalendarMod.CalendarProps[typingsJapgolly.moment.mod.Moment], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.generateCalendarMod.CalendarProps[typingsJapgolly.moment.mod.Moment]])(children: _*)
  }
  @JSImport("antd", "Calendar")
  @js.native
  object componentImport extends js.Object
  
}

