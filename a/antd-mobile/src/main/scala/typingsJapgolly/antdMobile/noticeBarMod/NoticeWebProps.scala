package typingsJapgolly.antdMobile.noticeBarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antdMobile.antdMobileStrings.closable
import typingsJapgolly.antdMobile.antdMobileStrings.link
import typingsJapgolly.antdMobile.marqueeMod.MarqueeProps
import typingsJapgolly.antdMobile.noticeBarPropsTypeMod.NoticeBarPropsType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeWebProps extends NoticeBarPropsType {
  var className: js.UndefOr[String] = js.undefined
  var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object NoticeWebProps {
  @scala.inline
  def apply(
    action: VdomElement = null,
    className: String = null,
    icon: VdomElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null
  ): NoticeWebProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeWebProps]
  }
}

