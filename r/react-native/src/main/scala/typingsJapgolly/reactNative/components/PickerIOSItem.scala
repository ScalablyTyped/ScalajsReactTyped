package typingsJapgolly.reactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.PickerIOSItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerIOSItem {
  def apply(
    label: String = null,
    value: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickerIOSItemProps, 
    typingsJapgolly.reactNative.mod.PickerIOSItem, 
    Unit, 
    PickerIOSItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNative.mod.PickerIOSItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNative.mod.PickerIOSItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNative.mod.PickerIOSItemProps])(children: _*)
  }
  @JSImport("react-native", "PickerIOSItem")
  @js.native
  object componentImport extends js.Object
  
}

