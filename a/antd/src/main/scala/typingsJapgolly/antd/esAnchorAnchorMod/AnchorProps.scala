package typingsJapgolly.antd.esAnchorAnchorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_Href
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorProps extends js.Object {
  var affix: js.UndefOr[Boolean] = js.undefined
  var bounds: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var getContainer: js.UndefOr[js.Function0[AnchorContainer]] = js.undefined
  /** Return customize highlight anchor */
  var getCurrentAnchor: js.UndefOr[js.Function0[String]] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  /** Listening event when scrolling change active link */
  var onChange: js.UndefOr[js.Function1[/* currentActiveLink */ String, Unit]] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Anon_Href, Unit]
  ] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showInkInFixed: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** Scroll to target offset value, if none, it's offsetTop prop value or 0. */
  var targetOffset: js.UndefOr[Double] = js.undefined
}

object AnchorProps {
  @scala.inline
  def apply(
    affix: js.UndefOr[Boolean] = js.undefined,
    bounds: Int | Double = null,
    children: VdomNode = null,
    className: String = null,
    getContainer: js.UndefOr[CallbackTo[AnchorContainer]] = js.undefined,
    getCurrentAnchor: js.UndefOr[CallbackTo[String]] = js.undefined,
    offsetTop: Int | Double = null,
    onChange: /* currentActiveLink */ String => Callback = null,
    onClick: (/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Anon_Href) => Callback = null,
    prefixCls: String = null,
    showInkInFixed: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetOffset: Int | Double = null
  ): AnchorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affix)) __obj.updateDynamic("affix")(affix.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    getContainer.foreach(p => __obj.updateDynamic("getContainer")(p.toJsFn))
    getCurrentAnchor.foreach(p => __obj.updateDynamic("getCurrentAnchor")(p.toJsFn))
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* currentActiveLink */ java.lang.String) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* link */ typingsJapgolly.antd.Anon_Href) => onClick(t0, t1).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInkInFixed)) __obj.updateDynamic("showInkInFixed")(showInkInFixed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorProps]
  }
}

