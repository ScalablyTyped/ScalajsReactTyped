package typingsJapgolly.reactNativeMaterialMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeMaterialMenu.mod.MenuItemProps
import typingsJapgolly.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typingsJapgolly.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import typingsJapgolly.std.StyleMedia_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledTextColor: String = null,
    ellipsizeMode: clip | tail = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: StyleMedia_ = null,
    textStyle: TextStyle = null,
    underlayColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MenuItemProps, 
    typingsJapgolly.reactNativeMaterialMenu.mod.MenuItem, 
    Unit, 
    MenuItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialMenu.mod.MenuItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialMenu.mod.MenuItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialMenu.mod.MenuItemProps])(children: _*)
  }
  @JSImport("react-native-material-menu", "MenuItem")
  @js.native
  object componentImport extends js.Object
  
}

