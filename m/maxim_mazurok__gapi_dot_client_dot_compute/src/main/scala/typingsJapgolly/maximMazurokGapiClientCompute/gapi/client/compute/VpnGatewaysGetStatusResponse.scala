package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGatewaysGetStatusResponse extends StObject {
  
  var result: js.UndefOr[VpnGatewayStatus] = js.undefined
}
object VpnGatewaysGetStatusResponse {
  
  inline def apply(): VpnGatewaysGetStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewaysGetStatusResponse]
  }
  
  extension [Self <: VpnGatewaysGetStatusResponse](x: Self) {
    
    inline def setResult(value: VpnGatewayStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
