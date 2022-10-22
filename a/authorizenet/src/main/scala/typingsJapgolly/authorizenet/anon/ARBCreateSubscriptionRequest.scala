package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBCreateSubscriptionRequest extends StObject {
  
  var ARBCreateSubscriptionRequest: typingsJapgolly.authorizenet.mod.APIContracts.ARBCreateSubscriptionRequest
}
object ARBCreateSubscriptionRequest {
  
  inline def apply(
    ARBCreateSubscriptionRequest: typingsJapgolly.authorizenet.mod.APIContracts.ARBCreateSubscriptionRequest
  ): ARBCreateSubscriptionRequest = {
    val __obj = js.Dynamic.literal(ARBCreateSubscriptionRequest = ARBCreateSubscriptionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBCreateSubscriptionRequest]
  }
  
  extension [Self <: ARBCreateSubscriptionRequest](x: Self) {
    
    inline def setARBCreateSubscriptionRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.ARBCreateSubscriptionRequest): Self = StObject.set(x, "ARBCreateSubscriptionRequest", value.asInstanceOf[js.Any])
  }
}
