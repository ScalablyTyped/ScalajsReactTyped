package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCustomerTransactionReceiptRequest extends StObject {
  
  var sendCustomerTransactionReceiptRequest: typingsJapgolly.authorizenet.mod.APIContracts.SendCustomerTransactionReceiptRequest
}
object SendCustomerTransactionReceiptRequest {
  
  inline def apply(
    sendCustomerTransactionReceiptRequest: typingsJapgolly.authorizenet.mod.APIContracts.SendCustomerTransactionReceiptRequest
  ): SendCustomerTransactionReceiptRequest = {
    val __obj = js.Dynamic.literal(sendCustomerTransactionReceiptRequest = sendCustomerTransactionReceiptRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCustomerTransactionReceiptRequest]
  }
  
  extension [Self <: SendCustomerTransactionReceiptRequest](x: Self) {
    
    inline def setSendCustomerTransactionReceiptRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.SendCustomerTransactionReceiptRequest): Self = StObject.set(x, "sendCustomerTransactionReceiptRequest", value.asInstanceOf[js.Any])
  }
}
