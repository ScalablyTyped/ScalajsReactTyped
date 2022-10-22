package typingsJapgolly.rrc.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rrc.mod.StatusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Status {
  
  inline def apply(code: String): Default[typingsJapgolly.rrc.mod.Status] = {
    val __props = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    new Default[typingsJapgolly.rrc.mod.Status](js.Array(this.component, __props.asInstanceOf[StatusProps]))
  }
  
  @JSImport("rrc", "Status")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StatusProps): Default[typingsJapgolly.rrc.mod.Status] = new Default[typingsJapgolly.rrc.mod.Status](js.Array(this.component, p.asInstanceOf[js.Any]))
}
