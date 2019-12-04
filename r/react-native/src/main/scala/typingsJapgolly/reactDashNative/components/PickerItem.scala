package typingsJapgolly.reactDashNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.PickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerItem {
  def apply(
    label: String,
    color: String = null,
    testID: String = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickerItemProps, 
    typingsJapgolly.reactDashNative.reactDashNativeMod.PickerItem, 
    Unit, 
    PickerItemProps
  ] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNative.reactDashNativeMod.PickerItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNative.reactDashNativeMod.PickerItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNative.reactDashNativeMod.PickerItemProps])(children: _*)
  }
  @JSImport("react-native", "PickerItem")
  @js.native
  object componentImport extends js.Object
  
}

