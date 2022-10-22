package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libDropdownToggleMod.DropdownToggleProps
import typingsJapgolly.reactBootstrap.libDropdownToggleMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownToggle {
  
  @JSImport("react-bootstrap/lib/DropdownToggle", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DropdownToggle.type): SharedBuilder_DropdownToggleProps264881114[^] = new SharedBuilder_DropdownToggleProps264881114[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownToggleProps): SharedBuilder_DropdownToggleProps264881114[^] = new SharedBuilder_DropdownToggleProps264881114[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
