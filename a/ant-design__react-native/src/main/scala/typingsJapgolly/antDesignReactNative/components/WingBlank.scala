package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.lg
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.md
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.sm
import typingsJapgolly.antDesignReactNative.wingBlankMod.WingBlankProps
import typingsJapgolly.antDesignReactNative.wingBlankMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WingBlank {
  def apply(
    size: sm | md | lg = null,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[WingBlankProps, default, Unit, WingBlankProps] = {
    val __obj = js.Dynamic.literal()
  
      if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.wingBlankMod.WingBlankProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.wingBlankMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.wingBlankMod.WingBlankProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/wing-blank", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

