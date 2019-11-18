package typingsJapgolly.antd.libStatisticCountdownMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libStatisticStatisticMod.StatisticProps
import typingsJapgolly.antd.libStatisticUtilsMod.Formatter
import typingsJapgolly.antd.libStatisticUtilsMod.countdownValueType
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountdownProps extends StatisticProps {
  var format: js.UndefOr[String] = js.undefined
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("value")
  var value_CountdownProps: js.UndefOr[countdownValueType] = js.undefined
}

object CountdownProps {
  @scala.inline
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
    valueStyle: CSSProperties = null
  ): CountdownProps = {
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
    __obj.asInstanceOf[CountdownProps]
  }
}

