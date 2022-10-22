package typingsJapgolly.reactGateway.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactGateway.gatewayDestMod.GatewayDestProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GatewayDest {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GatewayDestProps]))
  }
  
  @JSImport("react-gateway", "GatewayDest")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactGateway.mod.GatewayDest] {
    
    inline def component(value: String | ComponentType[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GatewayDestProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
