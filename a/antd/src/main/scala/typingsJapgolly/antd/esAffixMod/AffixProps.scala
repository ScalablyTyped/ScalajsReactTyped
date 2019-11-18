package typingsJapgolly.antd.esAffixMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixProps extends js.Object {
  var children: Element
  var className: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  /** 距离窗口底部达到指定偏移量后触发 */
  var offsetBottom: js.UndefOr[Double] = js.undefined
  /**
    * 距离窗口顶部达到指定偏移量后触发
    */
  var offsetTop: js.UndefOr[Double] = js.undefined
  /** 固定状态改变时触发的回调函数 */
  var onChange: js.UndefOr[js.Function1[/* affixed */ js.UndefOr[Boolean], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** 设置 Affix 需要监听其滚动事件的元素，值为一个返回对应 DOM 元素的函数 */
  var target: js.UndefOr[js.Function0[Window | HTMLElement | Null]] = js.undefined
}

object AffixProps {
  @scala.inline
  def apply(
    children: VdomElement,
    className: String = null,
    offset: Int | Double = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onChange: /* affixed */ js.UndefOr[Boolean] => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    target: js.UndefOr[CallbackTo[Window | HTMLElement | Null]] = js.undefined
  ): AffixProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* affixed */ js.UndefOr[scala.Boolean]) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    target.foreach(p => __obj.updateDynamic("target")(p.toJsFn))
    __obj.asInstanceOf[AffixProps]
  }
}

