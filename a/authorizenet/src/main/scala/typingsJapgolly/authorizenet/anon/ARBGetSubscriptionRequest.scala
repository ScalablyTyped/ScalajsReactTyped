package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBGetSubscriptionRequest extends StObject {
  
  var ARBGetSubscriptionRequest: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionRequest
}
object ARBGetSubscriptionRequest {
  
  inline def apply(ARBGetSubscriptionRequest: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionRequest): ARBGetSubscriptionRequest = {
    val __obj = js.Dynamic.literal(ARBGetSubscriptionRequest = ARBGetSubscriptionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBGetSubscriptionRequest]
  }
  
  extension [Self <: ARBGetSubscriptionRequest](x: Self) {
    
    inline def setARBGetSubscriptionRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.ARBGetSubscriptionRequest): Self = StObject.set(x, "ARBGetSubscriptionRequest", value.asInstanceOf[js.Any])
  }
}
