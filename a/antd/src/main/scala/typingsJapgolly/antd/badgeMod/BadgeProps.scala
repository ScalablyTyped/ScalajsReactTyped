package typingsJapgolly.antd.badgeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.processing
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.warning
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  /** Number to show in badge */
  var count: js.UndefOr[Node] = js.undefined
  /** whether to show red dot without number */
  var dot: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
  /** Max count to show */
  var overflowCount: js.UndefOr[Double] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var scrollNumberPrefixCls: js.UndefOr[String] = js.undefined
  var showZero: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[
    success | processing | typingsJapgolly.antd.antdStrings.default | error | warning
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    count: VdomNode = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    offset: js.Tuple2[Double | String, Double | String] = null,
    overflowCount: Int | Double = null,
    prefixCls: String = null,
    scrollNumberPrefixCls: String = null,
    showZero: js.UndefOr[Boolean] = js.undefined,
    status: success | processing | typingsJapgolly.antd.antdStrings.default | error | warning = null,
    style: CSSProperties = null,
    text: VdomNode = null,
    title: String = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (scrollNumberPrefixCls != null) __obj.updateDynamic("scrollNumberPrefixCls")(scrollNumberPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

