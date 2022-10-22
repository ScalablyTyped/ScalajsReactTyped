package typingsJapgolly.rcDropdown.components

import typingsJapgolly.rcDropdown.esDropdownMod.DropdownProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @JSImport("rc-dropdown/es/Dropdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Dropdown.type): SharedBuilder_DropdownPropsRefAttributes1412069010 = new SharedBuilder_DropdownPropsRefAttributes1412069010(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownProps & RefAttributes[Any]): SharedBuilder_DropdownPropsRefAttributes1412069010 = new SharedBuilder_DropdownPropsRefAttributes1412069010(js.Array(this.component, p.asInstanceOf[js.Any]))
}
