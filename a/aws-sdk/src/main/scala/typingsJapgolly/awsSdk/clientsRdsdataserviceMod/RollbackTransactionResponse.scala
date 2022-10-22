package typingsJapgolly.awsSdk.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackTransactionResponse extends StObject {
  
  /**
    * The status of the rollback operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
}
object RollbackTransactionResponse {
  
  inline def apply(): RollbackTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackTransactionResponse]
  }
  
  extension [Self <: RollbackTransactionResponse](x: Self) {
    
    inline def setTransactionStatus(value: TransactionStatus): Self = StObject.set(x, "transactionStatus", value.asInstanceOf[js.Any])
    
    inline def setTransactionStatusUndefined: Self = StObject.set(x, "transactionStatus", js.undefined)
  }
}
