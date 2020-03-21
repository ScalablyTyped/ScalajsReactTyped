package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.Image
import typingsJapgolly.reactNativeMaterialUi.AnonContainerContentContainer
import typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Header
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerHeader {
  def apply(
    backgroundColor: String = null,
    image: js.Array[Image] = null,
    style: AnonContainerContentContainer = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerHeaderProps, Header, Unit, DrawerHeaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.DrawerHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Header](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.DrawerHeaderProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Drawer.Header")
  @js.native
  object componentImport extends js.Object
  
}

