package typingsJapgolly.antDesignReactNative.noticeBarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.closable
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.link
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.marqueeMod.MarqueeProps
import typingsJapgolly.antDesignReactNative.noticeBarPropsTypeMod.NoticeBarPropsType
import typingsJapgolly.antDesignReactNative.noticeBarStyleMod.NoticeBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeNativeProps
  extends NoticeBarPropsType
     with WithThemeStyles[NoticeBarStyle] {
  var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object NoticeNativeProps {
  @scala.inline
  def apply(
    action: VdomElement = null,
    icon: VdomElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[NoticeBarStyle] = null
  ): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeNativeProps]
  }
}

