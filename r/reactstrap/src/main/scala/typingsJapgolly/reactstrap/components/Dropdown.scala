package typingsJapgolly.reactstrap.components

import typingsJapgolly.reactstrap.typesLibDropdownMod.DropdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @JSImport("reactstrap", "Dropdown")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Dropdown.type): SharedBuilder_DropdownProps331191894[typingsJapgolly.reactstrap.mod.Dropdown] = new SharedBuilder_DropdownProps331191894[typingsJapgolly.reactstrap.mod.Dropdown](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownProps): SharedBuilder_DropdownProps331191894[typingsJapgolly.reactstrap.mod.Dropdown] = new SharedBuilder_DropdownProps331191894[typingsJapgolly.reactstrap.mod.Dropdown](js.Array(this.component, p.asInstanceOf[js.Any]))
}
