package typingsJapgolly.reactGateway.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactGateway.gatewayMod.GatewayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gateway {
  
  inline def apply(into: String): Default[typingsJapgolly.reactGateway.mod.Gateway] = {
    val __props = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactGateway.mod.Gateway](js.Array(this.component, __props.asInstanceOf[GatewayProps]))
  }
  
  @JSImport("react-gateway", "Gateway")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: GatewayProps): Default[typingsJapgolly.reactGateway.mod.Gateway] = new Default[typingsJapgolly.reactGateway.mod.Gateway](js.Array(this.component, p.asInstanceOf[js.Any]))
}
