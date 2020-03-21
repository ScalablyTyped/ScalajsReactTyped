package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.mod.RadioButtonsItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioButtonsItem {
  def apply(key: js.UndefOr[Key] = js.undefined, _overrides: StringDictionary[js.Any] = null)(children: String): UnmountedWithRoot[
    RadioButtonsItemProps, 
    typingsJapgolly.protonNative.mod.RadioButtonsItem, 
    Unit, 
    RadioButtonsItemProps
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.RadioButtonsItemProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.protonNative.mod.RadioButtonsItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.RadioButtonsItemProps])
  }
  @JSImport("proton-native", "RadioButtonsItem")
  @js.native
  object componentImport extends js.Object
  
}

