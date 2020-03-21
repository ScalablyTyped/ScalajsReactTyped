package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.around
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.baseline
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.between
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.center
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.column
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.end
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.row
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.start
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.stretch
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.wrap
import typingsJapgolly.antDesignReactNative.flexFlexMod.FlexProps
import typingsJapgolly.antDesignReactNative.flexMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flex {
  def apply(
    align: start | center | end | baseline | stretch = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    onPressIn: js.UndefOr[Callback] = js.undefined,
    onPressOut: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    wrap: nowrap | wrap | `wrap-reverse` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlexProps, default, Unit, FlexProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    onPressIn.foreach(p => __obj.updateDynamic("onPressIn")(p.toJsFn))
    onPressOut.foreach(p => __obj.updateDynamic("onPressOut")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.flexFlexMod.FlexProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.flexMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.flexFlexMod.FlexProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/flex", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

