package typingsJapgolly.reactGateway.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GatewayProvider {
  
  @JSImport("react-gateway", "GatewayProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: GatewayProvider.type): Default[typingsJapgolly.reactGateway.mod.GatewayProvider] = new Default[typingsJapgolly.reactGateway.mod.GatewayProvider](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[typingsJapgolly.reactGateway.mod.GatewayProvider] = new Default[typingsJapgolly.reactGateway.mod.GatewayProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}
