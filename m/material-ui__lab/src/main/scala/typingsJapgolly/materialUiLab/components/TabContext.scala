package typingsJapgolly.materialUiLab.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.materialUiLab.tabContextTabContextMod.TabContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabContext {
  
  inline def apply(value: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TabContextProps]))
  }
  
  @JSImport("@material-ui/lab", "TabContext")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TabContextProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
