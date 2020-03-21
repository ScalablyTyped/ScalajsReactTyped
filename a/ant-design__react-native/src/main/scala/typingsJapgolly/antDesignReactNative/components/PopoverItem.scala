package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.popoverMod.PopoverItemProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopoverItem {
  def apply(
    value: js.Any,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PopoverItemProps, 
    typingsJapgolly.antDesignReactNative.popoverMod.PopoverItem, 
    Unit, 
    PopoverItemProps
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.popoverMod.PopoverItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.popoverMod.PopoverItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.popoverMod.PopoverItemProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/popover", "PopoverItem")
  @js.native
  object componentImport extends js.Object
  
}

