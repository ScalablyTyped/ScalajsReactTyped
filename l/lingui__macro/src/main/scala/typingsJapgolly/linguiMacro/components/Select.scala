package typingsJapgolly.linguiMacro.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.linguiMacro.mod.SelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  inline def apply(other: Any, value: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SelectProps]))
  }
  
  @JSImport("@lingui/macro", "Select_")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SelectProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
