package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libCalendarHeaderMod.RenderHeader
import typingsJapgolly.antd.libCalendarMod.CalendarMode
import typingsJapgolly.antd.libCalendarMod.CalendarProps
import typingsJapgolly.antd.libCalendarMod.default
import typingsJapgolly.moment.momentMod.Moment
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  def apply(
    className: String = null,
    dateCellRender: /* date */ Moment => CallbackTo[Node] = null,
    dateFullCellRender: /* date */ Moment => CallbackTo[Node] = null,
    defaultValue: Moment = null,
    disabledDate: /* current */ Moment => CallbackTo[Boolean] = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* headerRender */ RenderHeader => CallbackTo[Node] = null,
    locale: js.Any = null,
    mode: CalendarMode = null,
    monthCellRender: /* date */ Moment => CallbackTo[Node] = null,
    monthFullCellRender: /* date */ Moment => CallbackTo[Node] = null,
    onChange: /* date */ js.UndefOr[Moment] => Callback = null,
    onPanelChange: (/* date */ js.UndefOr[Moment], /* mode */ js.UndefOr[CalendarMode]) => Callback = null,
    onSelect: /* date */ js.UndefOr[Moment] => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    value: Moment = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CalendarProps, default, Unit, CalendarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateCellRender != null) __obj.updateDynamic("dateCellRender")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.moment.momentMod.Moment) => dateCellRender(t0).runNow()))
    if (dateFullCellRender != null) __obj.updateDynamic("dateFullCellRender")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.moment.momentMod.Moment) => dateFullCellRender(t0).runNow()))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* current */ typingsJapgolly.moment.momentMod.Moment) => disabledDate(t0).runNow()))
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1((t0: /* headerRender */ typingsJapgolly.antd.libCalendarHeaderMod.RenderHeader) => headerRender(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.moment.momentMod.Moment) => monthCellRender(t0).runNow()))
    if (monthFullCellRender != null) __obj.updateDynamic("monthFullCellRender")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.moment.momentMod.Moment) => monthFullCellRender(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* date */ js.UndefOr[typingsJapgolly.moment.momentMod.Moment]) => onChange(t0).runNow()))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: /* date */ js.UndefOr[typingsJapgolly.moment.momentMod.Moment], t1: /* mode */ js.UndefOr[typingsJapgolly.antd.libCalendarMod.CalendarMode]) => onPanelChange(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* date */ js.UndefOr[typingsJapgolly.moment.momentMod.Moment]) => onSelect(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libCalendarMod.CalendarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libCalendarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libCalendarMod.CalendarProps])(children: _*)
  }
  @JSImport("antd/lib/calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

