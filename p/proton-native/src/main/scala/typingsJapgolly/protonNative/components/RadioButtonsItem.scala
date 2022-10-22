package typingsJapgolly.protonNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.protonNative.mod.RadioButtonsItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonsItem {
  
  inline def apply(children: String): Default[typingsJapgolly.protonNative.mod.RadioButtonsItem] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Default[typingsJapgolly.protonNative.mod.RadioButtonsItem](js.Array(this.component, __props.asInstanceOf[RadioButtonsItemProps]))
  }
  
  @JSImport("proton-native", "RadioButtonsItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RadioButtonsItemProps): Default[typingsJapgolly.protonNative.mod.RadioButtonsItem] = new Default[typingsJapgolly.protonNative.mod.RadioButtonsItem](js.Array(this.component, p.asInstanceOf[js.Any]))
}
