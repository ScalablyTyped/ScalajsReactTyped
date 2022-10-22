package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworksUpdatePeeringRequest extends StObject {
  
  var networkPeering: js.UndefOr[NetworkPeering] = js.undefined
}
object NetworksUpdatePeeringRequest {
  
  inline def apply(): NetworksUpdatePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksUpdatePeeringRequest]
  }
  
  extension [Self <: NetworksUpdatePeeringRequest](x: Self) {
    
    inline def setNetworkPeering(value: NetworkPeering): Self = StObject.set(x, "networkPeering", value.asInstanceOf[js.Any])
    
    inline def setNetworkPeeringUndefined: Self = StObject.set(x, "networkPeering", js.undefined)
  }
}
