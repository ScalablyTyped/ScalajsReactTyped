package typingsJapgolly.reactNativeMaterialMenu.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialMenu.mod.MenuDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuDivider {
  def apply(
    color: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MenuDividerProps, 
    typingsJapgolly.reactNativeMaterialMenu.mod.MenuDivider, 
    Unit, 
    MenuDividerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialMenu.mod.MenuDividerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialMenu.mod.MenuDivider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialMenu.mod.MenuDividerProps])(children: _*)
  }
  @JSImport("react-native-material-menu", "MenuDivider")
  @js.native
  object componentImport extends js.Object
  
}

