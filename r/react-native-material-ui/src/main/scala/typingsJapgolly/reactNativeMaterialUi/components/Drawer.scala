package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonContainerViewStyle
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer {
  def apply(
    style: AnonContainerViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerProps, typingsJapgolly.reactNativeMaterialUi.mod.Drawer, Unit, DrawerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.DrawerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Drawer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.DrawerProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Drawer")
  @js.native
  object componentImport extends js.Object
  
}

