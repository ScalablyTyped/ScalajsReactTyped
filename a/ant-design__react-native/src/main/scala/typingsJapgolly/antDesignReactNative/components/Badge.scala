package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.large
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.small
import typingsJapgolly.antDesignReactNative.badgeMod.BadgeProps
import typingsJapgolly.antDesignReactNative.badgeMod.default
import typingsJapgolly.antDesignReactNative.badgeStyleMod.BadgeStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge {
  def apply(
    corner: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    overflowCount: Int | Double = null,
    size: large | small = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[BadgeStyle] = null,
    text: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BadgeProps, default, Unit, BadgeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.badgeMod.BadgeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.badgeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.badgeMod.BadgeProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/badge", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

