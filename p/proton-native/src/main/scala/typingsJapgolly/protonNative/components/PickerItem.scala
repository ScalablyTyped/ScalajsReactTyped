package typingsJapgolly.protonNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.protonNative.mod.PickerItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerItem {
  
  inline def apply(children: String): Default[typingsJapgolly.protonNative.mod.PickerItem] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Default[typingsJapgolly.protonNative.mod.PickerItem](js.Array(this.component, __props.asInstanceOf[PickerItemProps]))
  }
  
  @JSImport("proton-native", "PickerItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PickerItemProps): Default[typingsJapgolly.protonNative.mod.PickerItem] = new Default[typingsJapgolly.protonNative.mod.PickerItem](js.Array(this.component, p.asInstanceOf[js.Any]))
}
