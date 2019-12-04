package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libStatisticUtilsMod.Formatter
import typingsJapgolly.antd.libStatisticUtilsMod.valueType
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.PropsWithChildren<antd.antd/lib/statistic/Statistic.StatisticProps> */
trait PropsWithChildrenStatisticProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var decimalSeparator: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var groupSeparator: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[Node] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffix: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[valueType] = js.undefined
  var valueRender: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
  var valueStyle: js.UndefOr[CSSProperties] = js.undefined
}

object PropsWithChildrenStatisticProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    className: String = null,
    decimalSeparator: String = null,
    formatter: Formatter = null,
    groupSeparator: String = null,
    precision: Int | Double = null,
    prefix: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    suffix: VdomNode = null,
    title: VdomNode = null,
    value: valueType = null,
    valueRender: /* node */ Node => CallbackTo[Node] = null,
    valueStyle: CSSProperties = null
  ): PropsWithChildrenStatisticProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRender != null) __obj.updateDynamic("valueRender")(js.Any.fromFunction1((t0: /* node */ japgolly.scalajs.react.raw.React.Node) => valueRender(t0).runNow()))
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildrenStatisticProps]
  }
}

