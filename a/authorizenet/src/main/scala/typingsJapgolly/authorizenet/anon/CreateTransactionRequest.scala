package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransactionRequest extends StObject {
  
  var createTransactionRequest: typingsJapgolly.authorizenet.mod.APIContracts.CreateTransactionRequest
}
object CreateTransactionRequest {
  
  inline def apply(createTransactionRequest: typingsJapgolly.authorizenet.mod.APIContracts.CreateTransactionRequest): CreateTransactionRequest = {
    val __obj = js.Dynamic.literal(createTransactionRequest = createTransactionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransactionRequest]
  }
  
  extension [Self <: CreateTransactionRequest](x: Self) {
    
    inline def setCreateTransactionRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.CreateTransactionRequest): Self = StObject.set(x, "createTransactionRequest", value.asInstanceOf[js.Any])
  }
}
