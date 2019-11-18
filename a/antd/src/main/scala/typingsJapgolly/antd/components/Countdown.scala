package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.esStatisticCountdownMod.CountdownProps
import typingsJapgolly.antd.esStatisticCountdownMod.default
import typingsJapgolly.antd.esStatisticUtilsMod.Formatter
import typingsJapgolly.antd.esStatisticUtilsMod.countdownValueType
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Countdown {
  def apply(
    className: String = null,
    decimalSeparator: String = null,
    format: String = null,
    formatter: Formatter = null,
    groupSeparator: String = null,
    onFinish: js.UndefOr[Callback] = js.undefined,
    precision: Int | Double = null,
    prefix: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    suffix: VdomNode = null,
    title: VdomNode = null,
    value: countdownValueType = null,
    valueRender: /* node */ Node => CallbackTo[Node] = null,
    valueStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CountdownProps, default, Unit, CountdownProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator.asInstanceOf[js.Any])
    onFinish.foreach(p => __obj.updateDynamic("onFinish")(p.toJsFn))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRender != null) __obj.updateDynamic("valueRender")(js.Any.fromFunction1((t0: /* node */ japgolly.scalajs.react.raw.React.Node) => valueRender(t0).runNow()))
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esStatisticCountdownMod.CountdownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.esStatisticCountdownMod.default](js.constructorOf[typingsJapgolly.antd.esStatisticCountdownMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esStatisticCountdownMod.CountdownProps])(children: _*)
  }
}

