package typingsJapgolly.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceBackend extends StObject {
  
  /**
    * A reference to an object that represents the client policy for a backend.
    */
  var clientPolicy: js.UndefOr[ClientPolicy] = js.undefined
  
  /**
    * The name of the virtual service that is acting as a virtual node backend.
    */
  var virtualServiceName: ServiceName
}
object VirtualServiceBackend {
  
  inline def apply(virtualServiceName: ServiceName): VirtualServiceBackend = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceBackend]
  }
  
  extension [Self <: VirtualServiceBackend](x: Self) {
    
    inline def setClientPolicy(value: ClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
    
    inline def setVirtualServiceName(value: ServiceName): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
