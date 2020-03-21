package typingsJapgolly.antdMobileRn.noticeBarIndexNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.closable
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.link
import typingsJapgolly.antdMobileRn.marqueeNativeMod.MarqueeProps
import typingsJapgolly.antdMobileRn.noticeBarPropsTypeMod.NoticeBarPropsType
import typingsJapgolly.antdMobileRn.noticeBarStyleIndexNativeMod.INoticeBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeNativeProps extends NoticeBarPropsType {
  var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[INoticeBarStyle] = js.undefined
}

object NoticeNativeProps {
  @scala.inline
  def apply(
    action: VdomElement = null,
    icon: VdomElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: INoticeBarStyle = null
  ): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeNativeProps]
  }
}

