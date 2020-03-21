package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.closable
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.link
import typingsJapgolly.antdMobileRn.marqueeNativeMod.MarqueeProps
import typingsJapgolly.antdMobileRn.noticeBarIndexNativeMod.NoticeNativeProps
import typingsJapgolly.antdMobileRn.noticeBarStyleIndexNativeMod.INoticeBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeBar {
  def apply(
    action: VdomElement = null,
    icon: VdomElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: INoticeBarStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NoticeNativeProps, typingsJapgolly.antdMobileRn.mod.NoticeBar, Unit, NoticeNativeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.noticeBarIndexNativeMod.NoticeNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.NoticeBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.noticeBarIndexNativeMod.NoticeNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "NoticeBar")
  @js.native
  object componentImport extends js.Object
  
}

