package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBGetSubscriptionStatusRequest extends StObject {
  
  var ARBGetSubscriptionStatusRequest: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionStatusRequest
}
object ARBGetSubscriptionStatusRequest {
  
  inline def apply(
    ARBGetSubscriptionStatusRequest: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionStatusRequest
  ): ARBGetSubscriptionStatusRequest = {
    val __obj = js.Dynamic.literal(ARBGetSubscriptionStatusRequest = ARBGetSubscriptionStatusRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBGetSubscriptionStatusRequest]
  }
  
  extension [Self <: ARBGetSubscriptionStatusRequest](x: Self) {
    
    inline def setARBGetSubscriptionStatusRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionStatusRequest): Self = StObject.set(x, "ARBGetSubscriptionStatusRequest", value.asInstanceOf[js.Any])
  }
}
