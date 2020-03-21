package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.flexItemNativeMod.FlexItemProps
import typingsJapgolly.antdMobileRn.flexItemNativeMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlexItemDotnative {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    flex: Int | Double = null,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    onPressIn: js.UndefOr[Callback] = js.undefined,
    onPressOut: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlexItemProps, default, Unit, FlexItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    onPressIn.foreach(p => __obj.updateDynamic("onPressIn")(p.toJsFn))
    onPressOut.foreach(p => __obj.updateDynamic("onPressOut")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.flexItemNativeMod.FlexItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.flexItemNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.flexItemNativeMod.FlexItemProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/flex/FlexItem.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

