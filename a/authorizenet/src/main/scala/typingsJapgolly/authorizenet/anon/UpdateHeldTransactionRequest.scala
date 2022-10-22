package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHeldTransactionRequest extends StObject {
  
  var updateHeldTransactionRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateHeldTransactionRequest
}
object UpdateHeldTransactionRequest {
  
  inline def apply(
    updateHeldTransactionRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateHeldTransactionRequest
  ): UpdateHeldTransactionRequest = {
    val __obj = js.Dynamic.literal(updateHeldTransactionRequest = updateHeldTransactionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHeldTransactionRequest]
  }
  
  extension [Self <: UpdateHeldTransactionRequest](x: Self) {
    
    inline def setUpdateHeldTransactionRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.UpdateHeldTransactionRequest): Self = StObject.set(x, "updateHeldTransactionRequest", value.asInstanceOf[js.Any])
  }
}
