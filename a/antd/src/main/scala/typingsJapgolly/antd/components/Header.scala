package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.esCalendarHeaderMod.HeaderProps
import typingsJapgolly.antd.esCalendarHeaderMod.RenderHeader
import typingsJapgolly.antd.esCalendarHeaderMod.default
import typingsJapgolly.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    value: Moment,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* headerRender */ RenderHeader => CallbackTo[Node] = null,
    locale: js.Any = null,
    onTypeChange: /* type */ String => Callback = null,
    onValueChange: /* value */ Moment => Callback = null,
    prefixCls: String = null,
    `type`: String = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    yearSelectOffset: Int | Double = null,
    yearSelectTotal: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HeaderProps, default, Unit, HeaderProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1((t0: /* headerRender */ typingsJapgolly.antd.esCalendarHeaderMod.RenderHeader) => headerRender(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onTypeChange != null) __obj.updateDynamic("onTypeChange")(js.Any.fromFunction1((t0: /* type */ java.lang.String) => onTypeChange(t0).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.moment.momentMod.Moment) => onValueChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (yearSelectOffset != null) __obj.updateDynamic("yearSelectOffset")(yearSelectOffset.asInstanceOf[js.Any])
    if (yearSelectTotal != null) __obj.updateDynamic("yearSelectTotal")(yearSelectTotal.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esCalendarHeaderMod.HeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.esCalendarHeaderMod.default](js.constructorOf[typingsJapgolly.antd.esCalendarHeaderMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esCalendarHeaderMod.HeaderProps])(children: _*)
  }
}

