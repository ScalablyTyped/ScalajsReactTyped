package typingsJapgolly.antdMobile.marqueeMod

import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarqueeProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var fps: js.UndefOr[Double] = js.undefined
  var leading: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var trailing: js.UndefOr[Double] = js.undefined
}

object MarqueeProps {
  @scala.inline
  def apply(
    className: String = null,
    fps: Int | Double = null,
    leading: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null,
    text: String = null,
    trailing: Int | Double = null
  ): MarqueeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (trailing != null) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarqueeProps]
  }
}

