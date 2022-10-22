package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBGetSubscriptionListRequest extends StObject {
  
  var ARBGetSubscriptionListRequest: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionListRequest
}
object ARBGetSubscriptionListRequest {
  
  inline def apply(
    ARBGetSubscriptionListRequest: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionListRequest
  ): ARBGetSubscriptionListRequest = {
    val __obj = js.Dynamic.literal(ARBGetSubscriptionListRequest = ARBGetSubscriptionListRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBGetSubscriptionListRequest]
  }
  
  extension [Self <: ARBGetSubscriptionListRequest](x: Self) {
    
    inline def setARBGetSubscriptionListRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionListRequest): Self = StObject.set(x, "ARBGetSubscriptionListRequest", value.asInstanceOf[js.Any])
  }
}
