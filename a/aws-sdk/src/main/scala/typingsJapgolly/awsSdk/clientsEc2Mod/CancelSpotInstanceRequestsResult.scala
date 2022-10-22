package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSpotInstanceRequestsResult extends StObject {
  
  /**
    * One or more Spot Instance requests.
    */
  var CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList] = js.undefined
}
object CancelSpotInstanceRequestsResult {
  
  inline def apply(): CancelSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotInstanceRequestsResult]
  }
  
  extension [Self <: CancelSpotInstanceRequestsResult](x: Self) {
    
    inline def setCancelledSpotInstanceRequests(value: CancelledSpotInstanceRequestList): Self = StObject.set(x, "CancelledSpotInstanceRequests", value.asInstanceOf[js.Any])
    
    inline def setCancelledSpotInstanceRequestsUndefined: Self = StObject.set(x, "CancelledSpotInstanceRequests", js.undefined)
    
    inline def setCancelledSpotInstanceRequestsVarargs(value: CancelledSpotInstanceRequest*): Self = StObject.set(x, "CancelledSpotInstanceRequests", js.Array(value*))
  }
}
