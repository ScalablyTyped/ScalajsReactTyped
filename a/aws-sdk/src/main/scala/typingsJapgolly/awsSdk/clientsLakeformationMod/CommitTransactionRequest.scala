package typingsJapgolly.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTransactionRequest extends StObject {
  
  /**
    * The transaction to commit.
    */
  var TransactionId: TransactionIdString
}
object CommitTransactionRequest {
  
  inline def apply(TransactionId: TransactionIdString): CommitTransactionRequest = {
    val __obj = js.Dynamic.literal(TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTransactionRequest]
  }
  
  extension [Self <: CommitTransactionRequest](x: Self) {
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
