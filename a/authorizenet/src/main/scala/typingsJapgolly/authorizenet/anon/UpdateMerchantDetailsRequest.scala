package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMerchantDetailsRequest extends StObject {
  
  var updateMerchantDetailsRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateMerchantDetailsRequest
}
object UpdateMerchantDetailsRequest {
  
  inline def apply(
    updateMerchantDetailsRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateMerchantDetailsRequest
  ): UpdateMerchantDetailsRequest = {
    val __obj = js.Dynamic.literal(updateMerchantDetailsRequest = updateMerchantDetailsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMerchantDetailsRequest]
  }
  
  extension [Self <: UpdateMerchantDetailsRequest](x: Self) {
    
    inline def setUpdateMerchantDetailsRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.UpdateMerchantDetailsRequest): Self = StObject.set(x, "updateMerchantDetailsRequest", value.asInstanceOf[js.Any])
  }
}
