package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsDropdownItemMod.DropdownItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  @JSImport("antd-mobile/es/components/dropdown/item", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Item.type): SharedBuilder_DropdownItemProps_1238912632 = new SharedBuilder_DropdownItemProps_1238912632(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownItemProps): SharedBuilder_DropdownItemProps_1238912632 = new SharedBuilder_DropdownItemProps_1238912632(js.Array(this.component, p.asInstanceOf[js.Any]))
}
