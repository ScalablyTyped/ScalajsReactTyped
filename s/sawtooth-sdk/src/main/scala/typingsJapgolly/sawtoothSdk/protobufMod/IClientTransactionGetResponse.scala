package typingsJapgolly.sawtoothSdk.protobufMod

import typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientTransactionGetResponse extends StObject {
  
  /** ClientTransactionGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
  
  /** ClientTransactionGetResponse transaction */
  var transaction: js.UndefOr[ITransaction | Null] = js.undefined
}
object IClientTransactionGetResponse {
  
  inline def apply(): IClientTransactionGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionGetResponse]
  }
  
  extension [Self <: IClientTransactionGetResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTransaction(value: ITransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
