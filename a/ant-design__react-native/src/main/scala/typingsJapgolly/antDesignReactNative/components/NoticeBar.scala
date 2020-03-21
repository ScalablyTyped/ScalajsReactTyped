package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.closable
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.link
import typingsJapgolly.antDesignReactNative.marqueeMod.MarqueeProps
import typingsJapgolly.antDesignReactNative.noticeBarMod.NoticeNativeProps
import typingsJapgolly.antDesignReactNative.noticeBarMod.default
import typingsJapgolly.antDesignReactNative.noticeBarStyleMod.NoticeBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeBar {
  def apply(
    action: VdomElement = null,
    icon: VdomElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[NoticeBarStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NoticeNativeProps, default, Unit, NoticeNativeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.noticeBarMod.NoticeNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.noticeBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.noticeBarMod.NoticeNativeProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/notice-bar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

