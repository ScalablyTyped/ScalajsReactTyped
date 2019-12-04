package typingsJapgolly.reactDashNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.PickerIOSItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerIOSItem {
  def apply(
    label: String = null,
    value: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickerIOSItemProps, 
    typingsJapgolly.reactDashNative.reactDashNativeMod.PickerIOSItem, 
    Unit, 
    PickerIOSItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNative.reactDashNativeMod.PickerIOSItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNative.reactDashNativeMod.PickerIOSItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNative.reactDashNativeMod.PickerIOSItemProps])(children: _*)
  }
  @JSImport("react-native", "PickerIOSItem")
  @js.native
  object componentImport extends js.Object
  
}

