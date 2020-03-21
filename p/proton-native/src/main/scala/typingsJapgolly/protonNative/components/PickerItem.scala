package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.mod.PickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerItem {
  def apply(key: js.UndefOr[Key] = js.undefined, _overrides: StringDictionary[js.Any] = null)(children: String): UnmountedWithRoot[PickerItemProps, typingsJapgolly.protonNative.mod.PickerItem, Unit, PickerItemProps] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.PickerItemProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.protonNative.mod.PickerItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.PickerItemProps])
  }
  @JSImport("proton-native", "PickerItem")
  @js.native
  object componentImport extends js.Object
  
}

