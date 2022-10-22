package typingsJapgolly.reachRouter.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reachRouter.mod.ServerLocationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServerLocation {
  
  inline def apply(url: String): Default[typingsJapgolly.reachRouter.mod.ServerLocation] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reachRouter.mod.ServerLocation](js.Array(this.component, __props.asInstanceOf[ServerLocationProps]))
  }
  
  @JSImport("@reach/router", "ServerLocation")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ServerLocationProps): Default[typingsJapgolly.reachRouter.mod.ServerLocation] = new Default[typingsJapgolly.reachRouter.mod.ServerLocation](js.Array(this.component, p.asInstanceOf[js.Any]))
}
